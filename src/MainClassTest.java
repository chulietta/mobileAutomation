import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainClassTest {

    @Test
    public void testGetLocalNumber() {
        int expected = 14;
        int actual = MainClass.getLocalNumber();

        assertEquals(expected, actual, "LocalNumber != 14");
    }
}
