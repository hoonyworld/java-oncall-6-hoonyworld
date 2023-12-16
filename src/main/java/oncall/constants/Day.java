package oncall.constants;

import java.util.Arrays;
import java.util.List;

public enum Day {
    JANUARY_MONDAY("월", Arrays.asList(2, 9, 16, 23, 30)),
    JANAWORY_TUESDAY("화", Arrays.asList(3,10,17,24,31)),
    JANAWORY_WEDNESDAY("수", Arrays.asList(4,11,18,25)),
    JANAWORY_THURSDAY("목", Arrays.asList(5,12,19,26)),
    JANAWORY_FRIDAY("금", Arrays.asList(6,13,20,27)),
    JANAWORY_SATURDAY("토", Arrays.asList(7,14,21,28)),
    JANAWORY_SUNDAY("일", Arrays.asList(1,8,15,22,29)),
    FEBRUARY_MONDAY("월", Arrays.asList(6,13,20,27)),
    FEBRUARY_TUESDAY("화", Arrays.asList(7,14,21,28)),
    FEBRUARY_WEDNESDAY("수", Arrays.asList(1,8,15,22)),
    FEBRUARY_THURSDAY("목", Arrays.asList(2,9,16,23)),
    FEBRUARY_FRIDAY("금", Arrays.asList(3,10,17,24)),
    FEBRUARY_SATURDAY("토", Arrays.asList(4,11,18,25)),
    FEBRUARY_SUNDAY("일", Arrays.asList(5,12,19,26)),
    MARCH_MONDAY("월", Arrays.asList(6,13,20,27)),
    MARCH_TUESDAY("화", Arrays.asList(7,14,21,28)),
    MARCH_WEDNESDAY("수", Arrays.asList(1,8,15,22,29)),
    MARCH_THURSDAY("목", Arrays.asList(2,9,16,23,30)),
    MARCH_FRIDAY("금", Arrays.asList(3,10,17,24,31)),
    MARCH_SATURDAY("토", Arrays.asList(4,11,18,25)),
    MARCH_SUNDAY("일", Arrays.asList(5,12,19,26)),
    APRIL_MONDAY("월", Arrays.asList(3,10,17,24)),
    APRIL_TUESDAY("화", Arrays.asList(4,11,18,25)),
    APRIL_WEDNESDAY("수", Arrays.asList(5,12,19,26)),
    APRIL_THURSDAY("목", Arrays.asList(6,13,20,27)),
    APRIL_FRIDAY("금", Arrays.asList(7,14,21,28)),
    APRIL_SATURDAY("토", Arrays.asList(1,8,15,22,29)),
    APRIL_SUNDAY("일", Arrays.asList(2,9,16,23,30)),
    MAY_MONDAY("월", Arrays.asList(1,8,15,22,29)),
    MAY_TUESDAY("화", Arrays.asList(2,9,16,23,30)),
    MAY_WEDNESDAY("수", Arrays.asList(3,10,17,24,31)),
    MAY_THURSDAY("목", Arrays.asList(4,11,18,25)),
    MAY_FRIDAY("금", Arrays.asList(5,12,19,26)),
    MAY_SATURDAY("토", Arrays.asList(6,13,20,27)),
    MAY_SUNDAY("일", Arrays.asList(7,14,21,28)),
    JUNE_MONDAY("월", Arrays.asList(5,12,19,26)),
    JUNE_TUESDAY("화", Arrays.asList(6,13,20,27)),
    JUNE_WEDNESDAY("수", Arrays.asList(7,14,21,28)),
    JUNE_THURSDAY("목", Arrays.asList(1,8,15,22,29)),
    JUNE_FRIDAY("금", Arrays.asList(2,9,16,23,30)),
    JUNE_SATURDAY("토", Arrays.asList(3,10,17,24)),
    JUNE_SUNDAY("일", Arrays.asList(4,11,18,25)),
    JULY_MONDAY("월", Arrays.asList(3,10,17,24,31)),
    JULY_TUESDAY("화", Arrays.asList(4,11,18,25)),
    JULY_WEDNESDAY("수", Arrays.asList(5,12,19,26)),
    JULY_THURSDAY("목", Arrays.asList(6,13,20,27)),
    JULY_FRIDAY("금", Arrays.asList(7,14,21,28)),
    JULY_SATURDAY("토", Arrays.asList(1,8,15,22,29)),
    JULY_SUNDAY("일", Arrays.asList(2,9,16,23,30)),
    AUGUST_MONDAY("월", Arrays.asList(7,14,21,28)),
    AUGUST_TUESDAY("화", Arrays.asList(1,8,15,22,29)),
    AUGUST_WEDNESDAY("수", Arrays.asList(2,9,16,23,30)),
    AUGUST_THURSDAY("목", Arrays.asList(3,10,17,24,31)),
    AUGUST_FRIDAY("금", Arrays.asList(4,11,18,25)),
    AUGUST_SATURDAY("토", Arrays.asList(5,12,19,26)),
    AUGUST_SUNDAY("일", Arrays.asList(6,13,20,27)),
    SEPTEMBER_MONDAY("월", Arrays.asList(4,11,18,25)),
    SEPTEMBER_TUESDAY("화", Arrays.asList(5,12,19,26)),
    SEPTEMBER_WEDNESDAY("수", Arrays.asList(6,13,20,27)),
    SEPTEMBER_THURSDAY("목", Arrays.asList(7,14,21,28)),
    SEPTEMBER_FRIDAY("금", Arrays.asList(1,8,15,22,29)),
    SEPTEMBER_SATURDAY("토", Arrays.asList(2,9,16,23,30)),
    SEPTEMBER_SUNDAY("일", Arrays.asList(3,10,17,24)),
    OCTOBER_MONDAY("월", Arrays.asList(2,9,16,23,30)),
    OCTOBER_TUESDAY("화", Arrays.asList(3,10,17,24,31)),
    OCTOBER_WEDNESDAY("수", Arrays.asList(4,11,18,25)),
    OCTOBER_THURSDAY("목", Arrays.asList(5,12,19,26)),
    OCTOBER_FRIDAY("금", Arrays.asList(6,13,20,27)),
    OCTOBER_SATURDAY("토", Arrays.asList(7,14,21,28)),
    OCTOBER_SUNDAY("일", Arrays.asList(1,8,15,22,29)),
    NOVEMBER_MONDAY("월", Arrays.asList(6,13,20,27)),
    NOVEMBER_TUESDAY("화", Arrays.asList(7,14,21,28)),
    NOVEMBER_WEDNESDAY("수", Arrays.asList(1,8,15,22,29)),
    NOVEMBER_THURSDAY("목", Arrays.asList(2,9,16,23,30)),
    NOVEMBER_FRIDAY("금", Arrays.asList(3,10,17,24)),
    NOVEMBER_SATURDAY("토", Arrays.asList(4,11,18,25)),
    NOVEMBER_SUNDAY("일", Arrays.asList(5,12,19,26)),
    DECEMBER_MONDAY("월", Arrays.asList(4,11,18,25)),
    DECEMBER_TUESDAY("화", Arrays.asList(5,12,19,26)),
    DECEMBER_WEDNESDAY("수", Arrays.asList(6,13,20,27)),
    DECEMBER_THURSDAY("목", Arrays.asList(7,14,21,28)),
    DECEMBER_FRIDAY("금", Arrays.asList(1,8,15,22,29)),
    DECEMBER_SATURDAY("토", Arrays.asList(2,9,16,23,30)),
    DECEMBER_SUNDAY("일", Arrays.asList(3,10,17,24));

    private final String weekAndWeekend;
    private final List<Integer> dates;

    Day(String dayOfWeek, List<Integer> dates) {
        this.weekAndWeekend = dayOfWeek;
        this.dates = dates;
    }

    public String getWeekAndWeekend() {
        return weekAndWeekend;
    }

    public List<Integer> getDates() {
        return dates;
    }
}
