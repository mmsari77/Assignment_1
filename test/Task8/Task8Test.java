package Task8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task8Test {
    @Test
    public void testEmptyString() {
        assertTrue(Task8.checkDigits(""), "Empty string should return true");
    }

    @Test
    public void testAllDigits() {
        assertTrue(Task8.checkDigits("123"), "String '123' should return true");
        assertTrue(Task8.checkDigits("0"), "String '0' should return true");
    }

    @Test
    public void testNonDigits() {
        assertFalse(Task8.checkDigits("12a3"), "String '12a3' should return false");
        assertFalse(Task8.checkDigits("abc"), "String 'abc' should return false");
        assertFalse(Task8.checkDigits("123 "), "String '123 ' should return false");
    }

    @Test
    public void testNullString() {
        assertThrows(IllegalArgumentException.class, () -> Task8.checkDigits(null), "Null string should throw exception");
    }
}