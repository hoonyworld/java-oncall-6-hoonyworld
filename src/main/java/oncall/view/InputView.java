package oncall.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
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
            for (String s : input) {
                if (s.trim().isEmpty()) {
                    throw IllegalArgumentExceptionType.NON_VALID_VALUE.getException();
                }
            }

            int month = Integer.parseInt(input[0].trim());
            String startDay = input[1].trim();

            if (month < 1 || month > 12) {
                throw IllegalArgumentExceptionType.NON_VALID_VALUE.getException();
            }
            if (!isValidStartDay(startDay)) {
                throw IllegalArgumentExceptionType.NON_VALID_VALUE.getException();
            }

            return new MonthAndDay(month, startDay);
        } catch (IllegalArgumentException e) {
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
        try {
            System.out.print("평일 비상 근무 순번대로 사원 닉네임을 입력하세요> ");
            String[] oncallOrder = Console.readLine().split(",");
            validateOncallOrder(oncallOrder, false); // 평일 근무 순번에 대한 검증
            return oncallOrder;
        } catch (IllegalArgumentException e) {
            System.out.println(IllegalArgumentExceptionType.NON_VALID_VALUE.getMessage());
            return readWeekdayOncallOrder();
        }
    }

    public static String[] readHolidayOncallOrder() {
        try {
            System.out.print("휴일 비상 근무 순번대로 사원 닉네임을 입력하세요> ");
            String[] oncallOrder = Console.readLine().split(",");
            validateOncallOrder(oncallOrder, true); // 휴일 근무 순번에 대한 검증
            return oncallOrder;
        } catch (IllegalArgumentException e) {
            System.out.println(IllegalArgumentExceptionType.NON_VALID_VALUE.getMessage());
            return readHolidayOncallOrder();
        }
    }


    private static void validateOncallOrder(String[] oncallOrder, boolean isHoliday) {
        if (oncallOrder.length == 0 || hasEmptyName(oncallOrder) || hasDuplicate(oncallOrder)) {
            throw IllegalArgumentExceptionType.NON_VALID_VALUE.getException();
        }
        if (!hasValidNicknameLength(oncallOrder)) {
            throw IllegalArgumentExceptionType.NON_VALID_VALUE.getException();
        }
        if (oncallOrder.length < 5) {
            throw IllegalArgumentExceptionType.NON_VALID_VALUE.getException();
        }
        if (isHoliday && oncallOrder.length > 35) {
            throw IllegalArgumentExceptionType.NON_VALID_VALUE.getException();
        }
    }

    private static boolean hasValidNicknameLength(String[] names) {
        for (String name : names) {
            if (name.length() > 5) {
                return false;
            }
        }
        return true;
    }

        private static boolean hasDuplicate(String[] names) {
        Set<String> nameSet = new HashSet<>(Arrays.asList(names));
        return nameSet.size() != names.length;
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
