package pro.sky.testinghw;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String welcomeCalculator() {
        return "Welcome to the <b>calculator</b>";
    }


    public String calculatorPlus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Please input two parameters";
        }
        Integer result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    public String calculatorMinus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Please input two parameters";
        }
        Integer result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    public String calculatorMultiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Please input two parameters";
        }

        Integer result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    public String calculatorDivide (Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Please input two parameters";
        }
        if (num2 == 0) {
            throw new IllegalArgumentException("Dividing by 0 is not allowed");
        }
        Integer result = num1 / num2;
        return num1 + "/" + num2 + " = " + result;
    }

}