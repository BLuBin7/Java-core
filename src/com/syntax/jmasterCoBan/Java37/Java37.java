package com.syntax.jmasterCoBan.Java37;

/**
 * The type Java 37.
 */
//Java Cơ Bản 37 Bộ nhớ Stack và Heap trong Java
public class Java37 {

    /**
     * Chuvi.
     */
    public void Chuvi()
    {
        System.out.println("chu vi");
    }


    /**
     * Xinchao.
     *
     * @param jv37 the jv 37
     */
//    truyền class trong class được
    public static void Xinchao(Java37 jv37)

    {
        String s = "xin chao";
        System.out.println(s);
        jv37.Chuvi();
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int x =10;
        System.out.println(x);
//      phải khai báo Java37 là do class Xinchao có dữ liệu truyền vào là Java37
//      do biến jv37 là 1 đối tượng nên phải khởi tạo nó bằng hàm new
        Java37 jv37 = new Java37();
        Xinchao(jv37);
//    Kết luận : String và Java37 là 1 đổi tượng, có biến tham chiếu lần lươt là :"s" và "jv37"
//              nên nó được lưu trong bộ nhớ stack
//       Lưu ý : int là loại cơ bản. String là loại đối tượng
    }
}
