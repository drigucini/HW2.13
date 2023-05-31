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
    public String calculatorPlus(@RequestParam(value = "num1", required = false) Integer num1,
                                 @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorService.calculatorPlus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String calculatorMinus(@RequestParam(value = "num1", required = false) Integer num1,
                                  @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorService.calculatorMinus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String calculatorMultiply(@RequestParam(value = "num1", required = false) Integer num1,
                                     @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorService.calculatorMultiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String calculatorDivide (@RequestParam(value = "num1", required = false) Integer num1,
                                    @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorService.calculatorDivide(num1, num2);
    }
}