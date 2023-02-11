package com.syntax.jmasterCoBan.Java50.ex.main;

import com.syntax.jmasterCoBan.Java50.ex.model.Person;
import com.syntax.jmasterCoBan.Java50.ex.model.Student;
import com.syntax.jmasterCoBan.Java50.ex.model.Teacher;
import java.util.Scanner;

/**
 * The type Main.
 */
//Java Cơ Bản - Ứng dụng đa hình Java
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Student st = new Student();
        Teacher tc = new Teacher();
        Person p =new Person();

        input(st);
        infor(st);

        input(tc);
        infor(tc);
    }

    /**
     * Infor.
     *
     * @param p the p
     */
    public static void infor(Person p) {
        System.out.println(p.getName());
        System.out.println(p.getAge());
        if(p instanceof Student)
        {
            System.out.println(((Student) p).getClazz());
        }
        if (p instanceof Teacher) {
            System.out.println(((Teacher) p).getFaculty());
        }
    }

    /**
     * Input.
     *
     * @param p the p
     */
    public static void input(Person p)
    {
        System.out.println("Nhap ten : ");
        String a = new Scanner(System.in).nextLine();
//        tại sao không được dùng cách này ?
//        p.setName(new Scanner(System.in).nextLine());
//        không được dùng cách này là do mục đích muốn lưu gái trị mới nhập vào class person


        System.out.println("Nhap tuoi: ");
        int  b = new Scanner(System.in).nextInt();
//        tại sao không được dùng cách này ?
//        p.setAge(new Scanner(System.in).nextInt());
//        không được dùng cách này là do mục đích muốn lưu gái trị mới nhập vào class person


        if(p instanceof Student)
        {
            System.out.println("Nhap class");
            ((Student) p).setClazz(new Scanner(System.in).nextLine());
//          == p.setClazz(String ..)
        }
        if (p instanceof Teacher) {
            System.out.println("Nhap faculty");
            ((Teacher) p).setFaculty(new Scanner(System.in).nextLine());
//          == p.setClazz(String ..)
        }

    }
}
