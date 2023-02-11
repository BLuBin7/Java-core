package com.syntax.jmasterCoBan.Java53;

/**
 * The type Person.
 */
public abstract class Person {
    /**
     * Nhan double.
     *
     * @return the double
     */
//    hàm bình thường
    public double nhan()
    {
        return 0;
    }

    /**
     * Luong double.
     *
     * @return the double
     */
//    hàm abstract : không có nội dung bên trong
//    các class con bắt buộc phải override hàm abstract này, hàm bình thường có thể không cần
    public abstract double luong();
}
