package pro.sky.calculator1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String calculator() {
        return calculatorService.calculator();
    }

    @GetMapping("/plus")
    public String addition(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return calculatorService.addition(num1, num2);
    }

    @GetMapping("/minus")
    public String subtraction(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return calculatorService.subtraction(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiplication(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return calculatorService.multiplication(num1, num2);
    }

    @GetMapping("/divide")
    public String division(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return calculatorService.division(num1, num2);
    }
}