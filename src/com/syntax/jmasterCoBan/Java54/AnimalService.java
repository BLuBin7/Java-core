package com.syntax.jmasterCoBan.Java54;

/**
 * The interface Animal service.
 */
public interface AnimalService {
    /**
     * The constant HANG_SO.
     */
//    hằng số
    public static int HANG_SO = 10;

    /**
     * Them.
     */
//    hàm abstract
    public abstract void them();

    /**
     * Sua.
     */
    abstract void sua(); // mặc định là public nên khai báo hay không cũng như nhau

    /**
     * Xoa.
     */
    void xoa(); //  mặc định là public và abstarct rồi nên khai báo hay không cũng như nhau
}
