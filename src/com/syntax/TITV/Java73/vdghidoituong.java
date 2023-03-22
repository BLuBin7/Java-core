package com.syntax.TITV.Java73;



import com.syntax.TITV.Java73.controller.SinhVien;

import java.io.*;

/**
 * Created by Binh
 * Date : 3/18/2023 - 11:09 AM
 * Description :
 */
public class vdghidoituong {
    public static void main(String[] args) {

    try
    {
        File f = new File("C:\\Intellij-Utimately\\project\\Java-core\\Java-core\\src\\com\\syntax\\TITV\\Java73\\data.txt");
        OutputStream os = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(os);

        SinhVien st = new SinhVien("sdsd","32",212,3);

        oos.writeObject(st);

        oos.flush();
        oos.close();
    }
    catch(Exception e) {

    }
    }


}
