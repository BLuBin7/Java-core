package com.syntax.jmasterCoBan.Java58;

/**
 * The type Main.
 */
//Java Cơ Bản - So sánh StringBuilder và StringBuffer
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
//        Cách khai báo String thứ 1
//        String sa = new String("a");
//        Cách khai báo String thứ 2
        String s = "Hello";
        s = s + "BLuBin";
// --> cả 2 cách này đều khá tốn bộ nhớ Heap nên mới có StringBuilder và StringBuffer

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append(" BLuBin");
//----> StringBuilder chỉ tạo 1 đối tượng duy nhất và nối lại với nhau bằng hàm append
        // đổi các dạng chuỗi thành String
        String s2 = stringBuilder.toString();
        System.out.println(s2);

        StringBuffer sb = new StringBuffer("Hello");
        sb.append("BLuBin");
        String s3 = sb.toString();
        System.out.println(s3);


    }
}
