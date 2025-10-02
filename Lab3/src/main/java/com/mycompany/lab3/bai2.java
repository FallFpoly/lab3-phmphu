/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab3;

/**
 *
 * @author ICT
 */
public class bai2 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { // số bảng 9 chương
            System.out.println("= Bang " + i + " =");
            for (int j = 1; j <= 10; j++) { // số nhân
                System.out.printf("%d x %d = %d%n", i, j, i * j);
            }
            System.out.println(); //làm màu cho đẹp
        }
    }
}
