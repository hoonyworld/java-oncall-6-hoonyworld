package oncall.constants;

import java.util.Arrays;
import java.util.List;

public enum Day {
    JANUARY_MONDAY("1,월", Arrays.asList(2, 9, 16, 23, 30)),
    JANUARY_TUESDAY("1,화", Arrays.asList(3,10,17,24,31)),
    JANUARY_WEDNESDAY("1,수", Arrays.asList(4,11,18,25)),
    JANUARY_THURSDAY("1,목", Arrays.asList(5,12,19,26)),
    JANUARY_FRIDAY("1,금", Arrays.asList(6,13,20,27)),
    JANUARY_SATURDAY("1,토", Arrays.asList(7,14,21,28)),
    JANUARY_SUNDAY("1,일", Arrays.asList(1,8,15,22,29)),
    FEBRUARY_MONDAY("2,월", Arrays.asList(6,13,20,27)),
    FEBRUARY_TUESDAY("2,화", Arrays.asList(7,14,21,28)),
    FEBRUARY_WEDNESDAY("2,수", Arrays.asList(1,8,15,22)),
    FEBRUARY_THURSDAY("2,목", Arrays.asList(2,9,16,23)),
    FEBRUARY_FRIDAY("2,금", Arrays.asList(3,10,17,24)),
    FEBRUARY_SATURDAY("2,토", Arrays.asList(4,11,18,25)),
    FEBRUARY_SUNDAY("2,일", Arrays.asList(5,12,19,26)),
    MARCH_MONDAY("3,월", Arrays.asList(6,13,20,27)),
    MARCH_TUESDAY("3,화", Arrays.asList(7,14,21,28)),
    MARCH_WEDNESDAY("3,수", Arrays.asList(1,8,15,22,29)),
    MARCH_THURSDAY("3,목", Arrays.asList(2,9,16,23,30)),
    MARCH_FRIDAY("3,금", Arrays.asList(3,10,17,24,31)),
    MARCH_SATURDAY("3,토", Arrays.asList(4,11,18,25)),
    MARCH_SUNDAY("3,일", Arrays.asList(5,12,19,26)),
    APRIL_MONDAY("4,월", Arrays.asList(3,10,17,24)),
    APRIL_TUESDAY("4,화", Arrays.asList(4,11,18,25)),
    APRIL_WEDNESDAY("4,수", Arrays.asList(5,12,19,26)),
    APRIL_THURSDAY("4,목", Arrays.asList(6,13,20,27)),
    APRIL_FRIDAY("4,금", Arrays.asList(7,14,21,28)),
    APRIL_SATURDAY("4,토", Arrays.asList(1,8,15,22,29)),
    APRIL_SUNDAY("4,일", Arrays.asList(2,9,16,23,30)),
    MAY_MONDAY("5,월", Arrays.asList(1,8,15,22,29)),
    MAY_TUESDAY("5,화", Arrays.asList(2,9,16,23,30)),
    MAY_WEDNESDAY("5,수", Arrays.asList(3,10,17,24,31)),
    MAY_THURSDAY("5,목", Arrays.asList(4,11,18,25)),
    MAY_FRIDAY("5,금", Arrays.asList(5,12,19,26)),
    MAY_SATURDAY("5,토", Arrays.asList(6,13,20,27)),
    MAY_SUNDAY("5,일", Arrays.asList(7,14,21,28)),
    JUNE_MONDAY("6,월", Arrays.asList(5,12,19,26)),
    JUNE_TUESDAY("6,화", Arrays.asList(6,13,20,27)),
    JUNE_WEDNESDAY("6,수", Arrays.asList(7,14,21,28)),
    JUNE_THURSDAY("6,목", Arrays.asList(1,8,15,22,29)),
    JUNE_FRIDAY("6,금", Arrays.asList(2,9,16,23,30)),
    JUNE_SATURDAY("6,토", Arrays.asList(3,10,17,24)),
    JUNE_SUNDAY("6,일", Arrays.asList(4,11,18,25)),
    JULY_MONDAY("7,월", Arrays.asList(3,10,17,24,31)),
    JULY_TUESDAY("7,화", Arrays.asList(4,11,18,25)),
    JULY_WEDNESDAY("7,수", Arrays.asList(5,12,19,26)),
    JULY_THURSDAY("7,목", Arrays.asList(6,13,20,27)),
    JULY_FRIDAY("7,금", Arrays.asList(7,14,21,28)),
    JULY_SATURDAY("7,토", Arrays.asList(1,8,15,22,29)),
    JULY_SUNDAY("7,일", Arrays.asList(2,9,16,23,30)),
    AUGUST_MONDAY("8,월", Arrays.asList(7,14,21,28)),
    AUGUST_TUESDAY("8,화", Arrays.asList(1,8,15,22,29)),
    AUGUST_WEDNESDAY("8,수", Arrays.asList(2,9,16,23,30)),
    AUGUST_THURSDAY("8,목", Arrays.asList(3,10,17,24,31)),
    AUGUST_FRIDAY("8,금", Arrays.asList(4,11,18,25)),
    AUGUST_SATURDAY("8,토", Arrays.asList(5,12,19,26)),
    AUGUST_SUNDAY("8,일", Arrays.asList(6,13,20,27)),
    SEPTEMBER_MONDAY("9,월", Arrays.asList(4,11,18,25)),
    SEPTEMBER_TUESDAY("9,화", Arrays.asList(5,12,19,26)),
    SEPTEMBER_WEDNESDAY("9,수", Arrays.asList(6,13,20,27)),
    SEPTEMBER_THURSDAY("9,목", Arrays.asList(7,14,21,28)),
    SEPTEMBER_FRIDAY("9,금", Arrays.asList(1,8,15,22,29)),
    SEPTEMBER_SATURDAY("9,토", Arrays.asList(2,9,16,23,30)),
    SEPTEMBER_SUNDAY("9,일", Arrays.asList(3,10,17,24)),
    OCTOBER_MONDAY("10,월", Arrays.asList(2,9,16,23,30)),
    OCTOBER_TUESDAY("10,화", Arrays.asList(3,10,17,24,31)),
    OCTOBER_WEDNESDAY("10,수", Arrays.asList(4,11,18,25)),
    OCTOBER_THURSDAY("10,목", Arrays.asList(5,12,19,26)),
    OCTOBER_FRIDAY("10,금", Arrays.asList(6,13,20,27)),
    OCTOBER_SATURDAY("10,토", Arrays.asList(7,14,21,28)),
    OCTOBER_SUNDAY("10,일", Arrays.asList(1,8,15,22,29)),
    NOVEMBER_MONDAY("11,월", Arrays.asList(6,13,20,27)),
    NOVEMBER_TUESDAY("11,화", Arrays.asList(7,14,21,28)),
    NOVEMBER_WEDNESDAY("11,수", Arrays.asList(1,8,15,22,29)),
    NOVEMBER_THURSDAY("11,목", Arrays.asList(2,9,16,23,30)),
    NOVEMBER_FRIDAY("11,금", Arrays.asList(3,10,17,24)),
    NOVEMBER_SATURDAY("11,토", Arrays.asList(4,11,18,25)),
    NOVEMBER_SUNDAY("11,일", Arrays.asList(5,12,19,26)),
    DECEMBER_MONDAY("12,월", Arrays.asList(4,11,18,25)),
    DECEMBER_TUESDAY("12,화", Arrays.asList(5,12,19,26)),
    DECEMBER_WEDNESDAY("12,수", Arrays.asList(6,13,20,27)),
    DECEMBER_THURSDAY("12,목", Arrays.asList(7,14,21,28)),
    DECEMBER_FRIDAY("12,금", Arrays.asList(1,8,15,22,29)),
    DECEMBER_SATURDAY("12,토", Arrays.asList(2,9,16,23,30)),
    DECEMBER_SUNDAY("12,일", Arrays.asList(3,10,17,24));

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
