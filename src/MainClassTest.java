import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainClassTest extends MainClass{

    @Test
    public void testGetLocalNumber() {
        int expected = 14;
        int actual = MainClass.getLocalNumber();

        assertEquals(expected, actual, "LocalNumber != 14");
    }

    @Test
    public void testGetClassNumber() {
        assertTrue(this.getClassNumber() > 45, "class_number is not greater than 45");
    }
}
