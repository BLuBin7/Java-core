package com.syntax.TITV.Java72;

import java.io.BufferedReader;
import java.io.File;
import java.nio.file.Files;
import java.util.List;

/**
 * Created by Binh
 * Date : 3/14/2023 - 9:09 PM
 * Description : ava 72. Cách đọc dữ liệu văn bản text từ file trong lập trình Java
 */
public class Main {
    public static void main(String[] args) {
//        cách đọc 1 : dung BufferReader

//        File f1 = new File("dictionary.txt");
//        try {
//            BufferedReader read = Files.newBufferedReader(f1.toPath());
//            String line = null;
//            while (true) {
//                line = read.readLine();
//                if(line == null){
//                    break;
//                }else{
//                    System.out.println(line);
//                }
//            }
//        }catch (Exception e) {
//            e.printStackTrace();
//        }

//       Cách 2: dùng Files

        File f2 = new File("dictionary.txt");
        try {
            List<String> reader2 = Files.readAllLines(f2.toPath());
            for (String line : reader2) {
                System.out.println(line);
            }
//            ko phải Input hoặc Output thì dùng Exception e
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
