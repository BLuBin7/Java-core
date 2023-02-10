package com.syntax.jmasterCoBan.Java47;
//Java Cơ Bản 47 Đa hình trong Java
// Đa hình : 1 đối tượng tồn tại nhiều hình thức khác nhau
//mục đích : Mục đich thiết kế . Bây giờ viết 1 hàm truyền vào 1 đối tượng cha,
//thì có thể dùng các đối tượng con truyền vào hàm đó đc. Đặc biệt dùng viết interface và abstract class.
public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        Person p = new Employee();

        e.setTen("â");
        e.setLuong(98);

        p.setTen("b");
//        lưu ý : p.setLuong() không được, do trong thời gian đang gõ code gọi là compliletime
//        p.setluong()

//      class p tại sao ko gọi hàm Thongtin() trong class cha ?
//       do trong lúc chạy chương trình là thời gian runtime, nó sẽ gọi hàm trong đối tượng EMPLOYEE
//        trong thời gian runtime ở đây là @Override
        p.Thongtin(); // -> class con
        e.Thongtin();

//     KẾT LUẬN:
//     - Trong thời gian compliletime : nó chỉ gọi dược hàm trong class con
//     - Trong thời gian runtime : nó sẽ chạy hàm trên đối tượng thật thụ của nó ( nên mới có vụ in ra "class con" như ở trên)
//        Ví dụ :
//        Person p = new Employee() : đối tượng thật thụ là Enployee()

    }
}
