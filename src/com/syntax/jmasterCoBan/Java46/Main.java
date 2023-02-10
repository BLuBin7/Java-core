package com.syntax.jmasterCoBan.Java46;

import java.util.Scanner;

//Java Cơ Bản 46 Thực hành kế thừa OOP tính lương nhân viên
public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin nhan vien ");

        for (int i = 0; i < employee.length ; i++) {
            String name  = sc.nextLine();
            int sonam = sc.nextInt();
            Person person = new Person(name);
            Employee e = new Employee(name, sonam);

//            e.setName(name);

            employee[i] = e;
            sc.nextLine();
}
        for(Employee em : employee)
        {
            System.out.println(em.getName() +"|" + em.getSo_nam_kinh_nghiem() +"|" +em.luong() );
        }
    }
}
