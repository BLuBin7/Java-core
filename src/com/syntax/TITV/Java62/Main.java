package com.syntax.TITV.Java62;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Binh
 * Date : 3/5/2023 - 8:21 PM
 * Description : Java 62. Hiểu rõ về cách sử dụng Stack trong lập trình Java
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Stack<String> stack = new Stack<>();

        String chuoi = null;
        System.out.println("nhap chuoi" + ":");
        chuoi = input.nextLine();

        for (int i = 0; i < chuoi.length(); i++) {
                stack.push(chuoi);
            }
//            System.out.println("chuoi sau khi nhap : " + stack);
        for (int i = 0; i < chuoi.length(); i++) {
            System.out.println("chuoi sau khi nhap : " + stack.pop());
        }
}
        }



