package pro.sky.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculator.service.CalculateService;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;


public class CalculatorServiceParameterizedTest {
    private final CalculateService out = new CalculateService();

    @ParameterizedTest
    @MethodSource("provideParamsForTestsForPlus")
    public void shouldResultPlus(int expected, int num1,int num2) {

        assertEquals(expected,out.plus(num1,num2));

    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestsForMinus")
    public void  shouldResultMinus(int expected, int num1, int num2) {
        assertEquals(expected,out.minus(num1,num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestsForMultiply")
    public void  shouldResultMultiply(int expected, int num1, int num2) {
        assertEquals(expected,out.multiply(num1,num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestsForDivide")
    public void  shouldResultDivide(int expected, int num1, int num2) {
        assertEquals(expected,out.divide(num1,num2));
    }




    public static Stream<Arguments> provideParamsForTestsForPlus() {
        return Stream.of(arguments(3,2,1),
                         arguments(5,3,2));
    }

    public static Stream<Arguments> provideParamsForTestsForMinus() {
        return Stream.of(arguments(5,8,3),
                         arguments(3,10,7));
    }

    public static Stream<Arguments> provideParamsForTestsForMultiply() {
        return Stream.of(arguments(18,6,3),
                arguments(70,10,7));
    }

    public static Stream<Arguments> provideParamsForTestsForDivide() {
        return Stream.of(arguments(4,16,4),
                arguments(4,28,7));
    }
}


