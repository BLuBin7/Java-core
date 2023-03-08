package com.syntax.TITV.Java67;

import java.io.File;
import java.io.IOException;

/**
 * Created by Binh
 * Date : 3/8/2023 - 6:40 PM
 * Description : Java 67. Cách lập trình tạo tập tin và thư mục trong Java
 */
public class Main {
    public static void main(String[] args) {
        File fl = new File("C:\\Intellij-Utimately\\project\\Java-core\\Java-core\\src\\com\\syntax\\TITV\\Java67");

        System.out.println("Kiem tra folder 1 co ton tai hay khong : " +fl.exists());
//      tạo thư mục
        File folder1 = new File("C:\\Intellij-Utimately\\project\\Java-core\\Java-core\\src\\com\\syntax\\TITV\\Java67\\dir1");

        folder1.mkdirs();

//        tạo ra nhiều thư mục cùng lúc
//        File folder2 = new File("C:\\Intellij-Utimately\\project\\Java-core\\Java-core\\src\\com\\syntax\\TITV\\Java67\\dir1\\dir2\\dir3\\dir4");
//        folder2.mkdirs();

//        Tạo tập tin
        File file1 = new File("C:\\Intellij-Utimately\\project\\Java-core\\Java-core\\src\\com\\syntax\\TITV\\Java67\\dir1\\");

//      phải có try catch khi tạo tập tin
        try {
            file1.createNewFile();
        } catch (IOException e) {
//            không có quyền tạo tập tin
//            ổ cứng bị đầy
//            đường dẫn sai
            e.printStackTrace();
        }

    }

}
