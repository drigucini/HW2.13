package pro.sky.testinghw;

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

    @GetMapping()
    public String welcomeCalculator() {
        return calculatorService.welcomeCalculator();
    }

    @GetMapping(path = "/plus")
    public String add(@RequestParam(value = "num1", required = false) Integer num1,
                      @RequestParam(value = "num2", required = false) Integer num2) {
        return num1 + " + " + num2 + " = " + calculatorService.add(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String subtract(@RequestParam(value = "num1", required = false) Integer num1,
                           @RequestParam(value = "num2", required = false) Integer num2) {
        return num1 + " - " + num2 + " = " + calculatorService.subtract(num1, num2);

    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer num1,
                           @RequestParam(value = "num2", required = false) Integer num2) {
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);

    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1", required = false) Integer num1,
                         @RequestParam(value = "num2", required = false) Integer num2) {
        return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
    }
}