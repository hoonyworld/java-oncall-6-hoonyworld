package oncall.domain;

import java.util.ArrayList;
import java.util.List;

public class OncallSchedule {
    private final List<OncallDay> schedule;

    public OncallSchedule() {
        this.schedule = new ArrayList<>();
    }

    public void addOncallDay(OncallDay day) {
        schedule.add(day);
    }

    public List<OncallDay> getSchedule() {
        return schedule;
    }
}

