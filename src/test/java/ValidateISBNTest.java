import org.example.isbntools.ValidateISBN;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidateISBNTest {
    @Test
    public void checkInValid10DigitISBN() {
        ValidateISBN validateISBN = new ValidateISBN();
        boolean result = validateISBN.checkISBN("0109853453");
        assertFalse(result);
    }

    @Test
    public void ISBNNumberDigitEndingX() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("012000030X");
        assertTrue(result);
    }

    @Test
    public void checkValidISBN10Digit() {
        ValidateISBN validateISBN = new ValidateISBN();
        boolean result = validateISBN.checkISBN("0140449116");
        assertTrue(result);
    }

    @Test(expected = NumberFormatException.class)
    public void iSBNNotAllow_01() {
        ValidateISBN validateISBN = new ValidateISBN();
        validateISBN.checkISBN("014044911");
    }

    @Test(expected = NumberFormatException.class)
    public void iSBNNotAllow_02() {
        ValidateISBN validateISBN = new ValidateISBN();
        validateISBN.checkISBN("helloworld");
    }

    @Test
    public void checkAvalid13DigitISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("9781853260087");
        assertTrue(result);
        result = validator.checkISBN("9781853267338");
        assertTrue(result);
    }

}
