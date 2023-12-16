package oncall.controller;

import oncall.domain.*;
import oncall.view.InputView;
import oncall.constants.Holiday;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import oncall.view.OutputView;

public class MainController {

    int weekdayIndex = 0, holidayIndex = 0;

    public void run() {
        MonthAndDay monthAndDay = InputView.readMonthAndDay();
        String[] weekdayOncallNicknames = InputView.readWeekdayOncallOrder();
        String[] holidayOncallNicknames = InputView.readHolidayOncallOrder();

        List<Employee> weekdayOncallEmployees = convertToEmployees(weekdayOncallNicknames);
        List<Employee> holidayOncallEmployees = convertToEmployees(holidayOncallNicknames);

        OncallSchedule schedule = createOncallSchedule(monthAndDay, weekdayOncallEmployees, holidayOncallEmployees);
        OutputView.printOncallSchedule(schedule);
    }

    private List<Employee> convertToEmployees(String[] nicknames) {
        List<Employee> employees = new ArrayList<>();
        for (String nickname : nicknames) {
            employees.add(new Employee(nickname));
        }
        return employees;
    }

    private OncallSchedule createOncallSchedule(MonthAndDay monthAndDay,
                                                List<Employee> weekdayOncallEmployees,
                                                List<Employee> holidayOncallEmployees) {
        OncallSchedule schedule = new OncallSchedule();
        int month = monthAndDay.getMonth();
        String startDay = monthAndDay.getStartDay();
        int totalDaysInMonth = calculateDaysInMonth(month);

        String lastAssignedEmployee = "";
        String nextEmployeeAfterReplacement = "";

        for (int day = 1; day <= totalDaysInMonth; day++) {
            String dayOfWeek = getFormattedDayOfWeek(month, day, startDay);
            boolean isWeekend = dayOfWeek.equals("토") || dayOfWeek.equals("일");
            boolean isPublicHoliday = Holiday.isHoliday(month, day);
            boolean isHoliday = isWeekend || isPublicHoliday;

            List<Employee> currentOncallList;
            int currentIndex;
            if (isHoliday) {
                currentOncallList = holidayOncallEmployees;
                currentIndex = holidayIndex;
            } else {
                currentOncallList = weekdayOncallEmployees;
                currentIndex = weekdayIndex;
            }

            Employee assignedEmployee;
            if (!nextEmployeeAfterReplacement.isEmpty()) {
                assignedEmployee = findEmployeeByName(currentOncallList, nextEmployeeAfterReplacement);
                currentIndex = currentOncallList.indexOf(assignedEmployee);
                nextEmployeeAfterReplacement = "";  // Reset for the next iteration
            } else {
                assignedEmployee = currentOncallList.get(currentIndex % currentOncallList.size());
                if (assignedEmployee.getNickname().equals(lastAssignedEmployee)) {
                    currentIndex = (currentIndex + 1) % currentOncallList.size();
                    assignedEmployee = currentOncallList.get(currentIndex);
                    nextEmployeeAfterReplacement = lastAssignedEmployee;
                }
            }
            lastAssignedEmployee = assignedEmployee.getNickname();
            updateIndex(isHoliday, currentIndex, currentOncallList.size());
            String dateInfo = formatDateString(month, day, dayOfWeek, isPublicHoliday);
            schedule.addOncallDay(new OncallDay(dateInfo, assignedEmployee));
        }
        return schedule;
    }


    private void updateIndex(boolean isHoliday, int currentIndex, int listSize) {
        if (isHoliday) {
            holidayIndex = (currentIndex + 1) % listSize;
        } else {
            weekdayIndex = (currentIndex + 1) % listSize;
        }
    }


    private Employee findEmployeeByName(List<Employee> employees, String name) {
        for (Employee employee : employees) {
            if (employee.getNickname().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    private String formatDateString(int month, int day, String dayOfWeek, boolean isPublicHoliday) {
        String dateInfo = month + "월 " + day + "일 " + dayOfWeek;
        if (isPublicHoliday) {
            dateInfo += " (휴일)";
        }
        return dateInfo;
    }

    private int calculateDaysInMonth(int month) {
        if (month == 2) {
            return 28;
        } else if (Arrays.asList(4, 6, 9, 11).contains(month)) {
            return 30;
        } else {
            return 31;
        }
    }

    private String getFormattedDayOfWeek(int month, int day, String startDay) {
        int startDayIndex = Arrays.asList("일", "월", "화", "수", "목", "금", "토").indexOf(startDay);
        int dayOffset = day - 1;
        int actualDayIndex = (startDayIndex + dayOffset) % 7;
        String[] daysOfWeek = {"일", "월", "화", "수", "목", "금", "토"};

        return daysOfWeek[actualDayIndex];
    }
}
