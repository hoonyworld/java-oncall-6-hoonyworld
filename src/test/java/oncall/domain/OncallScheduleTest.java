package oncall.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OncallScheduleTest {

    @Test
    void testAddAndGetSchedule() {
        OncallSchedule schedule = new OncallSchedule();
        Employee employee = new Employee("JohnDoe");
        OncallDay oncallDay = new OncallDay("2023-05-01", employee);

        schedule.addOncallDay(oncallDay);
        assertFalse(schedule.getSchedule().isEmpty());
        assertEquals(1, schedule.getSchedule().size());
        assertEquals(oncallDay, schedule.getSchedule().get(0));
    }
}

