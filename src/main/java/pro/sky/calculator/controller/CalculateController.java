package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.CalculateService;

@RestController
@RequestMapping("/calculator")

public class CalculateController {

    private final CalculateService calculateService;

    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    private String mistake() {
        return "Ошибка - не передан один из параметров!";
    }

    @GetMapping
    public String showCalculator() {
        return "Добро Пожаловать в Калькулятор";
    }

    @GetMapping(path = "plus")
    public String plus(@RequestParam(value = "num1",required = false)Integer num,@RequestParam(value = "num2",required = false) Integer num2) {
        if (num == null || num2 == null) {
            return mistake();
        }
        int result = calculateService.plus(num,num2);
        return num + "+" + num2 +"=" + result;
    }

    @GetMapping(path = "minus")
    public  String minus(@RequestParam(value = "num1",required = false)Integer num,@RequestParam(value = "num2",required = false) Integer num2) {
        if(num == null || num2 == null) {
            return mistake();
        }
        int result =calculateService.minus(num,num2);
        return num+"-"+ num2 + "=" + result;
    }

    @GetMapping(path = "multiply")
    public String multiply(@RequestParam(value = "num1",required = false)Integer num,@RequestParam(value = "num2",required = false)Integer num2){
        if(num == null || num2 == null) {
            return mistake();
        }
        int result =calculateService.multiply(num,num2);
        return num+"*"+ num2 + "=" + result;
    }

    @GetMapping(path = "divide")
    public String divide(@RequestParam(value = "num1",required = false)Integer num,@RequestParam(value = "num2",required = false)Integer num2) {
        if (num == null || num2 == null) {
            return mistake();
        }
        if (num ==0 || num2 ==0) {
            return "Делить на 0 нельзя!!";
        }
        int result =calculateService.divide(num,num2);
        return num+"/"+ num2 + "=" + result;
    }
}
