package com.syntax.TITV.Java73;



import com.syntax.TITV.Java73.controller.SinhVien;

import java.io.*;

/**
 * Created by Binh
 * Date : 3/18/2023 - 11:18 AM
 * Description :
 */
public class vddocfile {
    public static void main(String[] args) throws IOException{
        try {
            File f = new File("C:\\Intellij-Utimately\\project\\Java-core\\Java-core\\src\\com\\syntax\\TITV\\Java73\\data.txt");
            InputStream is = new FileInputStream(f);
            ObjectInputStream iis = new ObjectInputStream(is);

//            String fileName= "data.txt";
//            FileInputStream is= new FileInputStream(fileName);
//            ObjectInputStream iis = new ObjectInputStream(is);


            SinhVien st = (SinhVien) iis.readObject();

            System.out.println(st);
            iis.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
