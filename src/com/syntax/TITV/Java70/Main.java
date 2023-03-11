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
    public static void CopyAll(File f1, File f2){
        try {
//          copy f1 tạo thành thư mục f2
            Files.copy(f1.toPath(),f2.toPath(),StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e){
            e.printStackTrace();
        }
        if(f1.isDirectory()){
//          lấy danh sách ra
            File mangcon[] = f1.listFiles();

//          xét tất cả file trong f1
            for (File file:
                 mangcon) {
//              tạo 1 file mới
                File fnew = new File(f2.getAbsolutePath()+"//"+file.getName());
//                đệ quy khi trong thư mục có thư mục khác
                CopyAll(file,fnew);
            }
        }
    }
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
//        System.out.println("nhap thu muc muon chuyen");
//        String suburl = input.nextLine();
//
//        File f = new File(url + suburl);
//
//        System.out.println("nhap ten thu muc muon chuyen vao ");
//        String newsuburl = input.nextLine();
//
//        File fnew = new File(url  + newsuburl + "//"+ suburl );
//        try {
//            Files.move(f.toPath(),fnew.toPath(),StandardCopyOption.REPLACE_EXISTING);
//        }catch (IOException e) {
//            e.printStackTrace();
//    }

//            COPY FILE
        System.out.println("nhap thu muc muon copy");
        String suburl = input.nextLine();

        File f = new File(url + suburl);

        System.out.println("nhap ten moi cua thu muc vua copy ");
        String copysuburl = input.nextLine();
        File fcopy = new File(url+copysuburl);

//        CopyAll(f,fcopy);
            CopyAll(f,fcopy);
//            try {
//            }catch(IOException e){
//                e.printStackTrace();
//            }
            
        }
    }

