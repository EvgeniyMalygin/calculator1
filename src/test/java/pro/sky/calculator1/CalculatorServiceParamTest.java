package pro.sky.calculator1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static pro.sky.calculator1.CalculatorServiceTestConstants.*;

public class CalculatorServiceParamTest {
    private final CalculatorService out = new CalculatorService();

    private static Stream<Arguments> depenciesParamForTest() {
        return Stream.of(Arguments.of(NUM1, NUM2),
                Arguments.of(NUM3, NUM4),
                Arguments.of(NUM2_ZERO, NUM4));
    }

    @ParameterizedTest
    @MethodSource("depenciesParamForTest")
    void correctAddition(Double NUM1, Double NUM2) {
        String result = out.addition(NUM1, NUM2);
        String expected = Double.toString(NUM1) + " + " + Double.toString(NUM2) + " = " + Double.toString(NUM1 + NUM2);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("depenciesParamForTest")
    void correctSubtraction(Double NUM1, Double NUM2) {
        String result = out.subtraction(NUM1, NUM2);
        String expected = Double.toString(NUM1) + " - " + Double.toString(NUM2) + " = " + Double.toString(NUM1 - NUM2);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("depenciesParamForTest")
    void correctMultiplication(Double NUM1, Double NUM2) {
        String result = out.multiplication(NUM1, NUM2);
        String expected = Double.toString(NUM1) + " * " + Double.toString(NUM2) + " = " + Double.toString(NUM1 * NUM2);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("depenciesParamForTest")
    void correctDivision(Double NUM1, Double NUM2) {
        String result = out.division(NUM1, NUM2);
        String expected = Double.toString(NUM1) + " / " + Double.toString(NUM2) + " = " + Double.toString(NUM1 / NUM2);
        Assertions.assertEquals(expected, result);
    }

}
