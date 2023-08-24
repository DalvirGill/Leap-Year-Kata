import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.katas.LeapYear;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest {
    @Test
    public void IsLeapYearShouldReturnFalseFor1967() {
        assertFalse(LeapYear.IsLeapYear(1967));
    }
}
