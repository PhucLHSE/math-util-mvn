/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.phuc.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Phuc
 */
public class MathUtilityTest {
    //Cấu trúc Test Case: ID | Desc | Steps/Procedures | Expected Result | Status
    //Test Case #1: - Verify getFactorial (with n = 0) 
    //Steps:
    //      1. Given n = 0
    //      2. Call/invoke getFactorial (n = 0)
    //Expected Result:
    //          the method must return 1 as the result of 0!
    //Status: PASSED | FAILED đoán xem, chờ code xong, chạy mới biết đc
    @Test
    public void verifyFactorialGivenRightArgument0ReturnsOK(){
        assertEquals(1, MathUtility.getFactorial(0));
    }
    @Test
    public void verifyFactorialGivenRightArgument1ReturnsOK(){
        assertEquals(1, MathUtility.getFactorial(1));
    }
    @Test
    public void verifyFactorialGivenRightArgument2ReturnsOK(){
        assertEquals(2, MathUtility.getFactorial(2));
    }
    @Test
    public void verifyFactorialGivenRightArgument3ReturnsOK(){
        assertEquals(6, MathUtility.getFactorial(3));
    }
    @Test
    public void verifyFactorialGivenRightArgument4ReturnsOK(){
        assertEquals(24, MathUtility.getFactorial(4));
    }
    @Test
    public void verifyFactorialGivenRightArgument5ReturnsOK(){
        assertEquals(120, MathUtility.getFactorial(5));
    }
    @Test
    public void verifyFactorialGivenRightArgument6ReturnsOK(){
        assertEquals(720, MathUtility.getFactorial(6));
    }
    @Test
    public void verifyFactorialGivenRightArgument7ReturnsOK(){
        assertEquals(5040, MathUtility.getFactorial(7));
    }
    @Test
    public void verifyFactorialGivenRightArgument8ReturnsOK(){
        assertEquals(40320, MathUtility.getFactorial(8));
    }
    @Test
    public void verifyFactorialGivenRightArgument9ReturnsOK(){
        assertEquals(362880, MathUtility.getFactorial(9));
    }
}
