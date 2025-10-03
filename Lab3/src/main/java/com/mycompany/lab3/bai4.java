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
public class bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nhập số lượng sinh viên
        System.out.print("Nhap so luong sinh vien: ");
        int n;
        n = sc.nextInt();
        sc.nextLine();
        // khai báo mảng họ tên điểm
        String hoTen[] = new String[n];
        double diem[] = new double[n];
        // nhập họ tên và điểm
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ho ten sinh vien thu " + (i + 1) + ": ");
            hoTen[i] = sc.nextLine();
            System.out.print("Nhap diem sinh vien thu " + (i + 1) + ": ");
            diem[i] = sc.nextDouble();
            sc.nextLine();
        }
        // xuất danh sách sinh viên
        System.out.println("\nDanh sach sinh vien:");
        for (int i = 0; i < n; i++) {
            System.out.println("Ho ten: " + hoTen[i]);
            System.out.println("Diem: " + diem[i]);
            System.out.println("Hoc luc: " + xepLoai(diem[i]));
        }
        // sắp xếp danh sách tăng dần theo điểm
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] > diem[j]) {
                    // hoán đổi điểm
                    double tempDiem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tempDiem;
                    // hoán đổi họ tên
                    String tempHoTen = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tempHoTen;
                }
            }
        }
        // xuất danh sách sinh viên sau khi sắp xếp
        System.out.println("\nDS sinh vien sau khi sap xep theo diem tang dan:");
        for (int i = 0; i < n; i++) {
            System.out.println("Ho ten: " + hoTen[i]);
            System.out.println("Diem: " + diem[i]);
            System.out.println("Hoc luc: " + xepLoai(diem[i]));
        }
    }

    // hàm xếp loại học lực
    public static String xepLoai(double diem) {
        if (diem >= 9) {
            System.out.println("OK Vjp pro player"); //trình là gì? và trình ai chấm?
        } else if (diem >= 7.5 && diem < 9) {
            System.out.println("Gioi");
        } else if (diem >= 6.5 && diem < 7.5) {
            System.out.println("Kha");
        } else if (diem >= 5 && diem < 6.5) {
            System.out.println("TB");
        } else {
            System.out.println("Ngu");
        }
        return null;
    }
}
