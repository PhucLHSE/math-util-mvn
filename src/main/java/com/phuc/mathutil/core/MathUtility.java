/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phuc.mathutil.core;

/**
 *
 * @author Phuc
 */
//Đây là bộ thư viện chứa các hàm dùng trong tính toán
//toán học, clone giống class Math bên JDK
//Khi gọi là thư viện dùng chung mà ko cần nhớ nhung
//gì sau khi xử lí -> thư viện chứa đồ STATIC
public class MathUtility {

    public static final double PI = 3.1415;

    //hàm tính n! = 1.2.3...n
    //n < 0 n >20 ko tính do 21! tràn kiểu long
    //ko tính giai thừa âm!!!
    //0! = 1! = 1
//    public static long getFactorial(int n) {
//        long result = 1;
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid n");
//        }
//
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//
//        return result;
//    }
    //Nâng cấp hàm tính giây thừa, dừng thuật toán đệ quy
    //n! =1.2.3...n
    //5! = 1.2.3.4.5
    //5! = 4! *5
    //4! = 4*3!
    //3! = 3*2!
    //2! = 2*1!
    //1! là 1, dừng, ko đuổi bắt
    //n! = n * (n-1)!
    //đệ quy - recursion GỌI LẠI CHÍNH MÌNH VỚI 1 QUY MÔ NHỎ HƠN
    public static long getFactorial(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * getFactorial(n - 1);//n! =n*n-1
    }
    //Không xem xanh đỏ ở local
    //để github actions làm giùm xanh đỏ
    //thực tế làm dự án: anh em fixbug
    //                   anh em tối ưu hàm cho chạy nhanh hơn
    //                   việc tối ưu này đúng hay sai về chất lượng code
    //                   leader chỉ cần nhìn màu xanh là đủ
    //                   

}
