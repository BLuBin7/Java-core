package com.syntax.TITV.Java74;

import com.syntax.TITV.Java74.controller.SinhVien;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by Binh
 * Date : 3/22/2023 - 9:29 PM
 * Description :
 */
public class vddocfile {
    public static void main(String[] args) throws IOException {
        try {
            String path = "C:\\Intellij-Utimately\\project\\Java-core\\Java-core\\src\\com\\syntax\\TITV\\Java74\\data.dat";
            ObjectInputStream os = new ObjectInputStream(new FileInputStream(path));

            SinhVien sv = (SinhVien)os.readObject();
            System.out.println(sv.toString());
        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
