package com.augmentis.ayp.mycalculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test_1_add_1_equals_2() {
        Calculator calculator = new Calculator();
        calculator.pressNumber("1");
        calculator.pressOperator("+");
        calculator.pressNumber("1");
        calculator.pressEqual();
        int calculatorResult = calculator.getResult();

        assertEquals(2, calculatorResult);
    }

    @Test
    public void test_5_del_3_equals_2() {
        Calculator calculator = new Calculator();
        calculator.pressNumber("5");
        calculator.pressOperator("-");
        calculator.pressNumber("3");
        calculator.pressEqual();
        int calculatorResult = calculator.getResult();

        assertEquals(2, calculatorResult);
    }

    @Test
    public void test_5_x_3_equals_15() {
        Calculator calculator = new Calculator();
        calculator.pressNumber("5");
        calculator.pressOperator("*");
        calculator.pressNumber("3");
        calculator.pressEqual();
        int calculatorResult = calculator.getResult();

        assertEquals(15, calculatorResult);
    }

    @Test
    public void test_10_half_2_equals_5() {
        Calculator calculator = new Calculator();
        calculator.pressNumber("1");
        calculator.pressNumber("0");
        calculator.pressOperator("/");
        calculator.pressNumber("2");
        calculator.pressEqual();
        int calculatorResult = calculator.getResult();

        assertEquals(5, calculatorResult);
    }

//    @Test
//    public void test_100_del_10_del_10_equals_80() {
//        Calculator calculator = new Calculator();
//        calculator.pressNumber("1");
//        calculator.pressNumber("0");
//        calculator.pressNumber("0");
//        calculator.pressOperator("-");
//        calculator.pressNumber("1");
//        calculator.pressNumber("0");
//        calculator.pressOperator("-");
//        calculator.pressNumber("1");
//        calculator.pressNumber("0");
//        calculator.pressEqual();
//        int calculatorResult = calculator.getResult();
//
//        assertEquals(80, calculatorResult);
//    }
}