/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author 84346
 */
public class DanhSach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu: ");
        int n = sc.nextInt();
        Random rd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int ngaunhien = rd.nextInt(101);
            list.add(ngaunhien);
        }
        System.out.println(list);
    }
}
