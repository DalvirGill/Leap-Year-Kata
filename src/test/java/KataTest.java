import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.katas.LeapYear;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest {
    @Test
    public void IsLeapYearShouldReturnFalseFor1997() {
        assertFalse(LeapYear.IsLeapYear(1997));
    }
}
