package com.example.testdemo;

// 자바버전 xunit 에서 파생된게 junit
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


/*
 * Application SRS(요구사항):
 *  1. 2가지 숫자의 정수 덧셈
 *  2. 2가지 숫자의 정수 뺄셈
 */
public class TestCalculator {
    //annotation -> 부가 설명, 기능을 코드 없이 설정
    @Test
    public void testAdd(){
        Calculator calc = new Calculator();
        int result = calc.add(10, 20);
        assertTrue(result==30);
        System.out.println(result == 30);
    }

    @Test
    public void testSubtract(){
        Calculator calc = new Calculator();
        int result = calc.subtract(20,10);
        assertTrue(result == 10);
        System.out.println(result == 10);
    }

    @Test
    public void testAddError(){
        Calculator calc = new Calculator();
        int result = calc.add(20, 10);
        assertTrue(result !=30);
    }

    @Test
    public void testSubtractError(){
        Calculator calc = new Calculator();
        int result = calc.subtract(10,20);
        assertEquals(10, result, "결과는 -10이어야 합니다.");

    }
    @Test
    public void testSubtractError11(){
        Calculator calc = new Calculator();
        int result = calc.subtract(10,20);
        assertEquals(10, result, "결과는 -10이어야 합니다.");

    }
}
