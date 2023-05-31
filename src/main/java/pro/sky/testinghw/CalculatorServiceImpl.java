package pro.sky.testinghw;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String welcomeCalculator() {
        return "Welcome to the <b>calculator</b>";
    }


    public Integer add(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public Integer subtract(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public Integer multiply(Integer num1, Integer num2) {
        return num1*num2;
    }

    public Integer divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Dividing by 0 is not allowed");
        }
        return num1/num2;
    }

}