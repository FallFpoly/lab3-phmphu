/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab3;

import java.util.Scanner;
//phu
/**
 *
 * @author ICT
 */
public class bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nguyen N: ");
        int n = sc.nextInt();

        boolean ok = true;
        if (n < 2) {
            ok = false;
        } else {
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    ok = false;
                    break;
                }
                i++;
            }

        }
        if (ok) {
            System.out.println(n + " la so nguyen to.");
        } else {
            System.out.println(n + " khong phai la so nguyen to.");
        }
    }
}
