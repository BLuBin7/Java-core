package com.syntax.jmasterCoBan.Java49;
//Java Cơ Bản 49 Ép kiểu đối tượng trong Đa hình Java
public class Main {
    public static void main(String[] args) {
        long x = 10;
        int i = (int) x;
//   éo kiểu khi mà kiểu đó có kiểu dữ liệu nhỏ hơn kiểu muốn ép
//    vd : ép từ int sang float , nếu từ float sang int thì không cần ép (do float > int)
//    float a =10;
//    int j = (float)a;

//    worker -> employee->person ->object
        Worker worker = new Worker();
        Employee employee = new Worker();
        Person person = new Worker();
        Object object = new Worker();
// ở đây do nó da hình nên phải ép kiểu
        worker.luong();
//      Employee không gọi đến luong() được do compliletime nên phải đổi kiểu về Worker
//        cách ép kiểu 1
        Worker k1 = (Worker) employee;
        k1.luong();
//        cách éo kiểu 2
        ((Worker) person).luong();
        ((Worker) object).luong();

    }
}
