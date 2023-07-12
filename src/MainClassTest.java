import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainClassTest extends MainClass {

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

    @Test
    public void testGetClassString() {
        String classString = this.getClassString();
        String expectedString = "Hello";
        String expectedStringOptimized = expectedString.replace(expectedString.substring(0, 1), "h");

        assertTrue(classString.toLowerCase().contains(expectedStringOptimized),
                "String \"" + classString + "\" not contains \"" + expectedString + "\"");
    }
}
