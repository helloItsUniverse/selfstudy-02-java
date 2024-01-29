package com.ohgiraffers.assertions.section01.jupiter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JupiterAssertionsTests {

    /* 수업목표. Junit5 에서 제공하는 Assertions 에서 제공하는 메소드에 대해 이해하고 활용할 수 있다. */

    @Test
    public void testAssertEquals() {

        /* 설명. 1. given */
        int firstNum = 10;
        int secondNum = 20;
        int expected = 30;

        /* 설명. 2. when */
        Calculator calculator = new Calculator();
        int result = calculator.plusTwoNumbers(firstNum, secondNum);

        /* 설명. 3. then */
        Assertions.assertEquals(expected, result);
    }
}
