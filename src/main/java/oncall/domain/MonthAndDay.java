package oncall.domain;
public class MonthAndDay {
    private final int month;
    private final String startDay;

    public MonthAndDay(int month, String startDay) {
        this.month = month;
        this.startDay = startDay;
    }

    public int getMonth() {
        return month;
    }

    public String getStartDay() {
        return startDay;
    }
}

