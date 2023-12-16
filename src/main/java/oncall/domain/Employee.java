package oncall.domain;
public class Employee {
    private final String nickname;

    public Employee(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }
}