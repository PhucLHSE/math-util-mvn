/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.phuc.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Phuc
 */
public class MathUtilityDDTTest {
    
    //chuẩn bị bộ data, sẽ nhồi vào hàm assert()
    //hàm trả về mảng 2 chiều, sẽ dùng để so sánh n! có = ? hay ko
    public static Object[][] initData(){
        //int [] a ={5, 10, 15, 20, 25, 30};
        Object[][] testData = {{0, 1}, 
                               {1, 1}, 
                               {2, 2}, 
                               {3, 6}, 
                               {4, 24}, 
                               {5, 120}
                              };
        return testData;
    }
    
    //nhồi data vào hàm kiểm thử
    @ParameterizedTest
    @MethodSource("initData")
    public void FactorialGivenRightArgumentReturnsOk(int n, long expected) {    
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
