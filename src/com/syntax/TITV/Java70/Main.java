package com.syntax.TITV.Java70;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

/**
 * Created by Binh
 * Date : 3/11/2023 - 10:21 AM
 * Description : Java 70. Cách đổi tên, di chuyển và copy file trong lập trình Java
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String url = "C://Intellij-Utimately//project//Java-core//Java-core//src//com//syntax//TITV//Java70//";

//        System.out.println("nhap thu muc muon doi ten");
//        String suburl = input.nextLine();
//
//        File f = new File(url + suburl);
//
//        System.out.println("nhap ten file muon doi  ");
//        String renameurl = input.nextLine();
//
//        File frename = new File(url + renameurl);

//      ĐỔI TÊN FILE

//      cách 1 : sử dụng File để đổi tên
//        f.renameTo(frename);

//        cách 2 : sử dụng Files để đổi tên
//        cách này phải có try catch IOException
//        try {
//            Files.move(f.toPath(), frename.toPath(), StandardCopyOption.REPLACE_EXISTING);
//        }catch(IOException e){
//            e.printStackTrace();
//        }

//        DI CHUYỂN FILE
        System.out.println("nhap thu muc muon chuyen");
        String suburl = input.nextLine();

        File f = new File(url + suburl);

        System.out.println("nhap ten thu muc muon chuyen vao ");
        String newsuburl = input.nextLine();

        File fnew = new File(url  + "//" + newsuburl + suburl);
        try {
            Files.move(f.toPath(),fnew.toPath(),StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
