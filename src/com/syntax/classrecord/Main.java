package com.syntax.classrecord;

/**
 * Created by Binh
 * Date : 2/11/2023 - 9:40 PM
 * Description :
 */

// class record có thể inplements nhưng không thể extends được
// các hàm đều ở dạng final ( tức là không thể thay đổi được)
// class record có sẵn toString,equals, hashCode
public class Main {
    public static void main(String[] args) {
        Record record = new Record("A",2);
        System.out.println(record);
    }
}
