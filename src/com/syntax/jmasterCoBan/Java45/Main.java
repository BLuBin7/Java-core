package com.syntax.jmasterCoBan.Java45;

import java.util.Scanner;

//Java Cơ Bản 45 Thực hành quan hệ OOP danh sách nhân viên

public class Main {
    public static void main(String[] args) {
        Employee[] e = new Employee[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin nhan vien ");
//tại sao không khai báo Scanner mà dùng thẳng lại bị lỗi ??
        for (int i = 0; i < e.length ; i++) {
            String streetname = sc.nextLine();

            String name = sc.nextLine();

            double salary = sc.nextDouble();

//            truyền vào constructor
            Address addr = new Address(streetname);
            Employee employee = new Employee(name, salary);

//           xuất dữ liệu ra (cấu trúc HAS-A)
//            truyền địa chỉ vào employee, do địa chỉ bên class Address
            employee.setAddress(addr);
//            gán phần tử trong mảng
            e[i] = employee;
//           xóa bộ nhớ đệm
            sc.nextLine();
        }

        for(Employee ep : e)
        {
//            chạy hết mảng e nên phải xài class của e
            System.out.println(ep.getName() + ep.getAddress().getstreetname()+ ep.getSalary());
        }
    }
    }

