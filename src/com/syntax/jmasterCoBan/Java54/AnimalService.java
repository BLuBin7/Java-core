package com.syntax.jmasterCoBan.Java54;

public interface AnimalService {
//    hằng số
    public static int HANG_SO = 10;
//    hàm abstract
    public abstract void them();
    abstract void sua(); // mặc định là public nên khai báo hay không cũng như nhau
    void xoa(); //  mặc định là public và abstarct rồi nên khai báo hay không cũng như nhau
}
