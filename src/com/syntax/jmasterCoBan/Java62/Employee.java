package com.syntax.jmasterCoBan.Java62;

/**
 * The type Employee.
 */
public class Employee {
    /**
     * Luong.
     */
    public void luong()
    {
// 1 class trong 1 phương thức, chỉ gọi được class đó BÊN TRONG PHƯƠNG THỨC ĐÓ THÔI
        class Worker{
            private String ten;

            public void luong() {
                System.out.println("luong");
            }
        }
        Worker w = new Worker();
        w.luong();
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Employee e = new Employee();
        e.luong();
    }
}
