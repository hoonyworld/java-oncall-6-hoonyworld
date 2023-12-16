package oncall.view;

import camp.nextstep.edu.missionutils.Console;
import oncall.domain.MonthAndDay;

public class InputView {

    private InputView() {
    }

    public static MonthAndDay readMonthAndDay() {
        try {
            System.out.print("비상 근무를 배정할 월과 시작 요일을 입력하세요> ");
            String[] input = Console.readLine().split(",");
            if (input.length != 2) {
                throw IllegalArgumentExceptionType.NON_VALID_VALUE.getException();
            }

            int month = Integer.parseInt(input[0]);
            String startDay = input[1];

            if (month < 1 || month > 12) {
                throw IllegalArgumentExceptionType.NON_VALID_VALUE.getException();
            }
            if (!isValidStartDay(startDay)) {
                throw IllegalArgumentExceptionType.NON_VALID_VALUE.getException();
            }

            return new MonthAndDay(month, startDay);
        } catch (NumberFormatException e) {
            System.out.println(IllegalArgumentExceptionType.NON_VALID_VALUE.getMessage());
            return readMonthAndDay();
        }
    }

    private static boolean isValidStartDay(String day) {
        String[] validDays = {"일", "월", "화", "수", "목", "금", "토"};
        for (String validDay : validDays) {
            if (validDay.equalsIgnoreCase(day)) {
                return true;
            }
        }
        return false;
    }

    public static String[] readWeekdayOncallOrder() {
        return readOncallOrder("평일 비상 근무 순번대로 사원 닉네임을 입력하세요>");
    }

    public static String[] readHolidayOncallOrder() {
        return readOncallOrder("휴일 비상 근무 순번대로 사원 닉네임을 입력하세요>");
    }

    private static String[] readOncallOrder(String prompt) {
        try {
            System.out.print(prompt);
            String[] oncallOrder = Console.readLine().split(",");
            validateOncallOrder(oncallOrder);
            return oncallOrder;
        } catch (IllegalArgumentException e) {
            System.out.println(IllegalArgumentExceptionType.NON_VALID_VALUE.getMessage());
            return readOncallOrder(prompt);
        }
    }

    private static void validateOncallOrder(String[] oncallOrder) {
        if (oncallOrder.length == 0 || hasEmptyName(oncallOrder)) {
            throw IllegalArgumentExceptionType.NON_VALID_VALUE.getException();
        }
    }

    private static boolean hasEmptyName(String[] names) {
        for (String name : names) {
            if (name.trim().isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
