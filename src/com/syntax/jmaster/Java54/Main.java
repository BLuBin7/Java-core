package com.syntax.jmaster.Java54;
//Java Cơ Bản 54 Interface trong java
//interface là bản nâng cấp của abstract, các hàm con bắt buộc phải Override lại mọi hàm trong inteface
//interface chỉ bao gồm các hàm abstract và hằng số( không có Attribute , Constructor, hàm bình thường)
// trong interface mặc định mọi hàm là public và abstract
//có thể dùng tính đa hình
//interface dùng để đa kế thừa
public class Main {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.sua();

        AnimalService dog = new Dog(); // vẫn có thể đa hình

    }

}
