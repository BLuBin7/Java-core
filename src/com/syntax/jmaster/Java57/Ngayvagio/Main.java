package com.syntax.jmaster.Java57.Ngayvagio;


import java.util.Calendar;
import java.util.Date;
//Java Cơ Bản - Sư dụng Ngày và Giờ trong Java
public class Main {
    public static void main(String[] args) {
        Date now = new Date();
//        in ra ngày hiện tại
        System.out.println(now);

//        thử so sánh 2 ngày thì thấy ko bằng nhau, do now khai báo trươc now2 nên nó bị delay
        Date now2 = new Date();
        if(now.equals(now2))
        {
            System.out.println("bang nhau");
        }
//        so sánh now2 trước
        if(now.before(now2))
        {
            System.out.println("now 2 before");
        }
//        so sanh now2 sau
        if(now.after(now2))
        {
            System.out.println("now 2 after");
        }
//        now sang mili giây
        now.getTime();

        Calendar calendar = Calendar.getInstance();


//        setup time
        calendar.add(Calendar.HOUR,-1); // trừ 1 giờ
        calendar.add(Calendar.DATE, -1); // trừ 1 ngày

        System.out.println(calendar.getTime());
    }
}
