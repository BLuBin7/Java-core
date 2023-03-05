package com.syntax.TITV.Java62;

import java.lang.reflect.Array;
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

        Stack<String> stack = new Stack<String>();

//        Ví dụ : chuyển sang chuỗi đảo ngược
        String chuoi = null;
        System.out.println("nhap chuoi" + ":");
        chuoi = input.nextLine();

        for (int i = 0; i < chuoi.length(); i++) {
//            chartAt() nó sẽ lấy ra từng kí tự + với "" để nó biến thành dạng String
                stack.push(chuoi.charAt(i) +"");
            }
            System.out.println("chuoi dao nguoc ");
        for (int i = 0; i < chuoi.length(); i++) {
            System.out.print(stack.pop());
            }

//        Ví dụ : chuyển từ thập phân sang nhị phân
//        Stack<Integer> stacksodu = new Stack<Integer>();
//        System.out.println("nhap so thap phan");
//        int a = input.nextInt();
//        while (a > 0 ){
//            int sodu = a%2;
//            stacksodu.push(sodu);
//            a=a/2;
//        }
//        đặt n = stacksodu.size là do trong vòng lặp for thì size sẽ nhỏ dần, nhỏ dần nên sẽ bị sai số
//        int n = stacksodu.size();
//        for (int i = 0; i < n; i++) {
//            System.out.println(stacksodu.pop());
//        }


//        cách 2
        int[] sodu1 = new int[100];
        int i = 0;
        System.out.println("nhap so thap phan");
        int sochia = input.nextInt();

        while ( sochia > 0) {
            sodu1[i] = sochia % 2;
            sochia= sochia/2;
            i++;
        }

        for (i = i-1; i >= sochia; i--) {
            System.out.println(sodu1[i]);
        }
    }
        }



