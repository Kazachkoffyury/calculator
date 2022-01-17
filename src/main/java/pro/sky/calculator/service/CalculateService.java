package pro.sky.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {



    public int plus(int num, int num1) {
        int result;
        result = num + num1;
        return result;
    }

    public int minus(int num, int num1) {
        int result;
        result = num - num1;
        return result;
    }

    public int multiply(int num, int num1) {
        int result;
        result = num * num1;
        return result;
    }

    public  int divide(int num, int num1) {
        if(num1 == 0) {
            throw new IllegalArgumentException("на ноль делить нельзя !!");
        }
        int result;
        result = num/num1;
        return result;
    }
}
