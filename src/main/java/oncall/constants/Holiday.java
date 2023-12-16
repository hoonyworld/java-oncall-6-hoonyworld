package oncall.constants;

public enum Holiday {
    NEW_YEAR("1,일",1),
    INDEPENDENCE_MOVEMENT_DAY("3,수", 1),
    CHILDREN_DAY("5,금",  5),
    MEMORIAL_DAY("6,화",  6),
    INDEPENDENCE_DAY("8,화",  15),
    NATIONAL_FOUNDATION_DAY("10,화",  3),
    HANGUL_DAY("10,월",  9),
    CHRISTMAS("12,월",  25);


    private final String DayofTheWeekForHoliday;
    private final int day;

    Holiday(String holiday, int day) {
        this.DayofTheWeekForHoliday = holiday;
        this.day = day;
    }

    public String getHolidayDayOfWeek() {
        return DayofTheWeekForHoliday;
    }

    public static boolean isHoliday(int month, int day) {
        for (Holiday holiday : Holiday.values()) {
            String[] monthAndDayOfWeek = holiday.getHolidayDayOfWeek().split(",");
            int holidayMonth = Integer.parseInt(monthAndDayOfWeek[0]);
            if (holidayMonth == month && holiday.day == day) {
                return true;
            }
        }
        return false;
    }
}
