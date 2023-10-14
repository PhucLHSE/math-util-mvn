/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phuc.mathutil.main;

import com.phuc.mathutil.core.MathUtility;

/**
 *
 * @author Phuc
 */
public class Main {

    public static void main(String[] args) {
        //test thử hàm mình vừa viết tính giai thừa có 
        //đúng ko
        //chuẩn bị bộ data test, test case
        //Test case #1: Check if getFactorial() runs
        //              well with = 0
        //Test Procedures/Steps:
        //               Given n = 0
        //               Invoke getFactorial(n = 0)

        //Expected Result: 1; //0! == 1???
        long expected = 1; // em hy vọng 1 đc trả về
        int n = 0;           // nếu anh đưa vào !
        long actual = MathUtility.getFactorial(n);   //chạy hàm mới biết

        //in ra và tự kết luận
        System.out.println(n + "! | expected = " + expected
                + " | actual = " + actual);
        
        //Test case #2: Check if getFactorial() runs
        //              well with = 1
        //Test Procedures/Steps:
        //               Given n = 1
        //               Invoke getFactorial(n = 1)
        
        //Expected Result: 1; //1! == 1???
        System.out.println("1! | expected = 1 " + 
                " | actual = " + MathUtility.getFactorial(n));
    }
}
