package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // khai báo biến size, nhập kích thước mảng
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhập size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("size không quá 20");
            }
        } while (size > 20);
        //Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter phần tử mảng" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("mảng gồm ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        // tìm max trong mảng
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("số lớn nhất trong mảng là: "+max);
    }
}
