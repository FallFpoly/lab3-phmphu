/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab3;

import java.util.Arrays;
import java.util.Scanner;
//phu
/**
 *
 * @author ICT
 */
public class bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nhập số phần tử
        int n;
        int a[];
        n = sc.nextInt();
        a = new int[n];
        System.out.println("nhap so phan tu: ");
        // Nhập mảng
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap pt a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
        //Sắp xếp mảng
        Arrays.sort(a);
        System.out.println("------------------------------");
        System.out.println("\nMang sau khi sap xep:");
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
        //phần tử nhỏ nhất
        int min = a[0]; // sau khi sort thì phần tử đầu tiên là nhỏ nhất
        System.out.println("Pt min: " + min);
        //Tính trung bình cộng các phần tử chia hết cho 3
        int tong = 0, count = 0;
        for (int x : a) {
            if (x % 3 == 0) {
                tong += x;
                count++;
            }
        }

        if (count > 0) {
            double TB = (double) tong / count;//ép kiểu double
            System.out.println("TB cac pt chia het cho 3: " + TB);
        } else {
            System.out.println("Khong co pt nao chia het cho 3");
        }
            System.out.println("------------------------------");
    }
}
