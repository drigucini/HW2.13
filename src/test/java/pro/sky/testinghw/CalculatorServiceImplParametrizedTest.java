package pro.sky.testinghw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceImplParametrizedTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> argumentsForAddition() {
        return Stream.of(
                Arguments.of(1, 1, 2),
                Arguments.of(-1, 1, 0),
                Arguments.of(0, 0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsForAddition")
    public void checkAddition(Integer num1, Integer num2, Integer expectedResult) {
        Assertions.assertEquals(expectedResult, calculatorService.add(num1, num2));
    }

    public static Stream<Arguments> argumentsForSubtraction() {
        return Stream.of(
                Arguments.of(1, 1, 0),
                Arguments.of(-1, 1, -2),
                Arguments.of(1, 5, -4),
                Arguments.of(0, 0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsForSubtraction")
    public void checkSubtraction(Integer num1, Integer num2, Integer expectedResult) {
        Assertions.assertEquals(expectedResult, calculatorService.subtract(num1, num2));
    }

    public static Stream<Arguments> argumentsForMultiplication() {
        return Stream.of(
                Arguments.of(1, 1, 1),
                Arguments.of(-1, 1, -1),
                Arguments.of(1, 10, 10),
                Arguments.of(0, 0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsForMultiplication")
    public void checkMultiplication(Integer num1, Integer num2, Integer expectedResult) {
        Assertions.assertEquals(expectedResult, calculatorService.multiply(num1, num2));
    }

    public static Stream<Arguments> argumentsForDivision() {
        return Stream.of(
                Arguments.of(1, 1, 1),
                Arguments.of(-1, 1, -1),
                Arguments.of(1, 10, 0),
                Arguments.of(100, 10, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsForDivision")
    public void checkDivision(Integer num1, Integer num2, Integer expectedResult) {
        Assertions.assertEquals(expectedResult, calculatorService.divide(num1, num2));
    }
}
