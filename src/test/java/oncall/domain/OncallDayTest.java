package oncall.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OncallDayTest {

    @Test
    void testGetters() {
        Employee employee = new Employee("JaneDoe");
        OncallDay oncallDay = new OncallDay("2023-05-01", employee);
        assertEquals("2023-05-01", oncallDay.getDate());
        assertEquals(employee, oncallDay.getEmployee());
    }
}
