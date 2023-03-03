package com.syntax.TITV.Java59.test;

import java.time.MonthDay;

/**
 * Created by Binh
 * Date : 3/3/2023 - 7:20 PM
 * Description :
 */
public class Test {
    public static void main(String[] args) {
    TKB tkb = new TKB(Day.Thursday,"toan");
    System.out. println(tkb);

//    ENUM giúp tiết kiệm code hơn với những obj so hữu hạn
//    cách 1
    System.out.println(tkb.getThu().getSoTiet());

//    cách 2
    System.out.println(Day.Thursday.getSoTiet());
    }


}
