package pro.sky.calculator;

import org.junit.jupiter.api.Test;
import pro.sky.calculator.service.CalculateService;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculateServiceTest {
    CalculateService out = new CalculateService();
    int num1 = 6;
    int num2 = 3;
    @Test
    public void shouldResultOfPlus() {
        int expected = out.plus(num1,num2);
        int actual = 9;
        assertEquals(expected,actual);
    }

    @Test
    public void  shouldResultOfMinus() {
       int expected = out.minus(num1,num2);
       int actual = 3;
       assertEquals(expected,actual);
    }

    @Test
    public  void shouldResultOfMultiply() {
      int expected = out.multiply(num1,num2);
      int actual = 18;
      assertEquals(expected,actual);
    }

    @Test
    public void  shouldResultOfDivide() {
      int expected = out.divide(num1,num2);
      int actual =2;
      assertEquals(expected,actual);
    }

    @Test
    public void shouldResultOfDivideWithNum2OfZero(){
      int num2=0;
      assertThrows(IllegalArgumentException.class,()->out.divide( num1, num2));

    }





}
