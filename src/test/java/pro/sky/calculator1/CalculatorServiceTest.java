package pro.sky.calculator1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static pro.sky.calculator1.CalculatorServiceTestConstants.*;

class CalculatorServiceTest {

    private final CalculatorService out = new CalculatorService();

    @Test
    void shouldDefaultMassageStartPage() {
        String result = out.calculator();
        Assertions.assertEquals(GREETING, result);
    }

    @Test
    void correctAddition() {
        String result = out.addition(NUM1, NUM2);
        Assertions.assertEquals(RESULT_ADDITION, result);
    }

    @Test
    void correctSubtraction() {
        String result = out.subtraction(NUM1, NUM2);
        Assertions.assertEquals(RESULT_SUBTRACTION, result);
    }

    @Test
    void correctMultiplication() {
        String result = out.multiplication(NUM1, NUM2);
        Assertions.assertEquals(RESULT_MULTIPLICATION, result);
    }

    @Test
    void correctDivision() {
        String result = out.division(NUM1, NUM2);
        Assertions.assertEquals(RESULT_DIVISION_CORRECT, result);
    }

    @Test
    void divisionZero() {
        Throwable exeption = Assertions.assertThrows(IllegalArgumentException.class,
                () -> out.division(NUM1, NUM2_ZERO));
        Assertions.assertEquals("Делить на 0 нельзя!",
                exeption.getMessage());
    }
}