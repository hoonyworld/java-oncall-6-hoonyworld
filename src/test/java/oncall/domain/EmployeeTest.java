package oncall.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testGetNickname() {
        Employee employee = new Employee("JohnDoe");
        assertEquals("JohnDoe", employee.getNickname());
    }
}

