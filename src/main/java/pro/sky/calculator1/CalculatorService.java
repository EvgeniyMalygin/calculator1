package pro.sky.calculator1;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String addition(double num1, double num2) {
        double sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }

    public String subtraction(double num1, double num2) {
        double sum = num1 - num2;
        return num1 + " - " + num2 + " = " + sum;
    }

    public String multiplication(double num1, double num2) {
        double sum = num1 * num2;
        return num1 + " * " + num2 + " = " + sum;
    }

    public String division(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException();
        }
        double sum = num1 / num2;
        return num1 + " / " + num2 + " = " + sum;
    }

}
