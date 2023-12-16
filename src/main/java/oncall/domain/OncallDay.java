package oncall.domain;

public class OncallDay {
    private final String date;
    private final Employee employee;

    public OncallDay(String date, Employee employee) {
        this.date = date;
        this.employee = employee;
    }

    public String getDate() {
        return date;
    }

    public Employee getEmployee() {
        return employee;
    }
}
