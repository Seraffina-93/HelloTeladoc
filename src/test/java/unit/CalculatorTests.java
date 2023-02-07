package unit;

import com.helloteladoc.api.util.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTests {

    @Test
    public void testAddNumbers_validInput_returnsCorrectResult() {
        String a = "123456789";
        String b = "987654321";
        String expectedResult = "1111111110";
        String actualResult = Calculator.addNumbers(a, b);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAddNumbers_oneInputIsInvalid_returnsErrorMessage() {
        String a = "";
        String b = "987654321";
        String expectedResult = "Error: Invalid input";
        String actualResult = Calculator.addNumbers(a, b);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAddNumbers_bothInputsHaveLeadingZeros_returnsCorrectResult() {
        String a = "000123456";
        String b = "000987654";
        String expectedResult = "1111110";
        String actualResult = Calculator.addNumbers(a, b);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAddNumbers_inputsHaveDifferentLengths_returnsCorrectResult() {
        String a = "12345";
        String b = "987654321";
        String expectedResult = "987666666";
        String actualResult = Calculator.addNumbers(a, b);
        assertEquals(expectedResult, actualResult);
    }
}

