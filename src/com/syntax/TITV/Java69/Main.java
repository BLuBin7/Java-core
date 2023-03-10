package com.syntax.TITV.Java69;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Created by Binh
 * Date : 3/10/2023 - 11:21 PM
 * Description : Java 69. Cách xóa tập tin và thư mục bằng ngôn ngữ lập trình Java
 */
public class Main {
    public static void xoaFile(File f) {
        if(f.isFile()){
            f.delete();
        }else if (f.isDirectory()) {
//          lay cac file con
            File[] fx = f.listFiles();
            for (File taptin : fx) {
//          đệ quy cho tới khi thư mục trống
                xoaFile(taptin);
            }
//          tu xoa thu muc khi xoa cac file con
            f.delete();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String url = "C://Intellij-Utimately//project//Java-core//Java-core//src//com//syntax//TITV//Java69//";
        System.out.println("Nhap thu muc can xoa");
        String suburl = input.nextLine();
        File f = new File(url+suburl);

        try{
            xoaFile(f);
//            chỉ xóa đuợc khi nó empty
          f.deleteOnExit();
            System.out.println("xoa thanh cong");
        }catch (Exception e) {
            e.printStackTrace();
        }

////        sử dụng Files để xóa file
//          Path path = FileSystems.getDefault().getPath(null,url+suburl);
//          try{
////              chỉ xóa được khi nó empty
//              Files.deleteIfExists(path);
//          }catch (Exception e) {
//              e.printStackTrace();
//          }
    }
}
