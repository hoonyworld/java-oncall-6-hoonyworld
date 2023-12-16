package oncall.constants;

public enum Holiday {
    NEW_YEAR("일", 1, 1),
    INDEPENDENCE_MOVEMENT_DAY("수",3, 1),
    CHILDREN_DAY("금",5, 5),
    MEMORIAL_DAY("화",6, 6),
    INDEPENDENCE_DAY("화",8, 15),
    NATIONAL_FOUNDATION_DAY("화",10, 3),
    HANGUL_DAY("월",10, 9),
    CHRISTMAS("월", 12, 25);

    private final String weekAndWkeekendForHoliday;
    private final int month;
    private final int day;

    Holiday(String weekAndWkeekendForHoliday, int month, int day) {
        this.weekAndWkeekendForHoliday = weekAndWkeekendForHoliday;
        this.month = month;
        this.day = day;
    }

    public String getHolidayDayOfWeek() {
        return weekAndWkeekendForHoliday;
    }

    public static boolean isHoliday(int month, int day) {
        for (Holiday holiday : Holiday.values()) {
            if (holiday.month == month && holiday.day == day) {
                return true;
            }
        }
        return false;
    }
}
