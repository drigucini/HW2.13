package pro.sky.testinghw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceImplTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void checkAddition() {
        int n1 = 10;
        int n2 = 20;
        int expectedResult = n1 + n2;


        Assertions.assertEquals(expectedResult, calculatorService.add(n1, n2));
    }

    @Test
    public void checkAdditionNegative() {
        int n1 = -10;
        int n2 = -20;
        int expectedResult = n1 + n2;


        Assertions.assertEquals(expectedResult, calculatorService.add(n1, n2));
    }

    @Test
    public void checkSubtractionNegative() {
        int n1 = -10;
        int n2 = -20;
        int expectedResult = n1 - n2;


        Assertions.assertEquals(expectedResult, calculatorService.subtract(n1, n2));
    }

    @Test
    public void checkSubtraction() {
        int n1 = 0;
        int n2 = 15;
        int expectedResult = n1 - n2;


        Assertions.assertEquals(expectedResult, calculatorService.subtract(n1, n2));
    }

    @Test
    public void checkMultiplication() {
        int n1 = 1;
        int n2 = 15;
        int expectedResult = n1 * n2;


        Assertions.assertEquals(expectedResult, calculatorService.multiply(n1, n2));
    }
    @Test
    public void checkDivision() {
        int n1 = 35;
        int n2 = 15;
        int expectedResult = n1 / n2;


        Assertions.assertEquals(expectedResult, calculatorService.divide(n1, n2));
    }

    @Test
    public void checkDivisionBy0Exception() {
        int n1 = 10;
        int n2 = 0;

        Assertions.assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(n1, n2));
    }

}
