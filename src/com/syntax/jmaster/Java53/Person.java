package com.syntax.jmaster.Java53;

public abstract class Person {
//    hàm bình thường
    public double nhan()
    {
        return 0;
    }

//    hàm abstract : không có nội dung bên trong
//    các class con bắt buộc phải override hàm abstract này, hàm bình thường có thể không cần
    public abstract double luong();
}
