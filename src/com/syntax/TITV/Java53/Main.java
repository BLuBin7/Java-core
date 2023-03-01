package com.syntax.TITV.Java53;

import java.util.Arrays;

/**
 * Created by Binh
 * Date : 3/2/2023 - 8:01 PM
 * Description : Java 53. Mảng và cách copy mảng trong lập trình Java
 */
public class Main {
//     cách khai báo mảng
    public static void main(String[] args) {
        String name[] = new String[3];
//        cách 1
        name[0] = "Hello";
        name[1] = "How are you";
//        cách 2
        String name1[] = {"Hello","How are you"};
//        cách 3
        String name2[] = new String[]{"Hello","How are you"};

//        Lưu ý: Trong mảng : array.length (do length là thuộc tính của mảng rồi)
//                 Trong chuỗi : String.length()

//        SAO CHÉP DỮ LIỆU TRÊN MẢNG
//        cách 1
        Integer[] orange, apple, apple1; // phải khai báo kiểu Integer mới dùng được hàm deepT0String
        orange = new Integer[]{1,2,3};
        apple = orange;
        apple[0]++;
//        System.out.println(Arrays.deepToString(apple));

//       cách 2
         apple1 = new Integer[orange.length];



    }
}
