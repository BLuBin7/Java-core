package com.syntax.TITV.Java71;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * Created by Binh
 * Date : 3/13/2023 - 7:54 PM
 * Description : Java 71. Cách ghi dữ liệu dạng văn bản vào file trong lập trình Java
 *
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao file can ghi");
        String suburl = sc.nextLine();

        String url = "C:\\Intellij-Utimately\\project\\Java-core\\Java-core\\src\\com\\syntax\\TITV\\Java71\\";
        PrintWriter writer = new PrintWriter(url+suburl,"UTF-8");


        System.out.println("nhap ki tu can ghi");
        String wr= sc.nextLine();

//      nhập vào 1 đối tượng, nó sẽ lấy ra dạng toString
        Student st = new Student(23,"abc");
        writer.print(st);


        writer.print(wr);
        writer.flush();
        writer.close();
    }
}
