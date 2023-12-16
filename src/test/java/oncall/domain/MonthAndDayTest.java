package oncall.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MonthAndDayTest {

    @Test
    void testGetters() {
        MonthAndDay monthAndDay = new MonthAndDay(5, "월");
        assertEquals(5, monthAndDay.getMonth());
        assertEquals("월", monthAndDay.getStartDay());
    }
}
