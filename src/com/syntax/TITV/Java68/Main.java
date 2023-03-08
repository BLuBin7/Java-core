package com.syntax.TITV.Java68;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Binh
 * Date : 3/9/2023 - 11:12 AM
 * Description :
 */
public class Main {
    File file = new File("C:\\Intellij-Utimately\\project\\Java-core\\Java-core\\src\\com\\syntax\\TITV\\Java68\\gf");
        public void Taofile(){
            try {
                file.createNewFile();
            } catch (IOException e) {
//            không có quyền tạo tập tin
//            ổ cứng bị đầy
//            đường dẫn sai
                e.printStackTrace();
            }
        }

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int choice = 0;
        do{
            System.out.println("Nhap lua chon");
            choice = input.nextInt();

            System.out.println("===MENU===");
            System.out.println("1. Tao thu muc ");
            System.out.println("2. Tao file");
            System.out.println("3. Ghi file ");
            System.out.println("4. Doc file ");
            input.nextLine();
            if(choice == 1){
                System.out.println("nhap ten file");
                String tenpackage = input.nextLine();
                File file = new File("C://Intellij-Utimately//project//Java-core//Java-core//src//com//syntax//TITV//Java68//" + tenpackage);
                file.mkdir();
                System.out.println("Tao file thanh cong ");
            }
            if (choice == 2) {
                System.out.println("nhap ten file");
                String tenfile = input.nextLine();
                File file = new File("C://Intellij-Utimately//project//Java-core//Java-core//src//com//syntax//TITV//Java68//" + tenfile);

                try {
                    file.createNewFile();
                    System.out.println("Tao file thanh cong ");
                } catch (IOException e) {
//            không có quyền tạo tập tin
//            ổ cứng bị đầy
//            đường dẫn sai
                    e.printStackTrace();
                }
            }
            if(choice == 3){
                System.out.println("nhap ten file");
                String tenfile = input.nextLine();
                try {
                    FileWriter fw = new FileWriter("C://Intellij-Utimately//project//Java-core//Java-core//src//com//syntax//TITV//Java68//" + tenfile);
                    System.out.println("nhap tu muon ghi : ");
                    String ghi = input.nextLine();
                    fw.write(ghi);
                    fw.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("Success...");
            }

            if (choice == 4) {
                System.out.println("nhap ten file");
                String tenfile = input.nextLine();
                try {
                    String url = "C://Intellij-Utimately//project//Java-core//Java-core//src//com//syntax//TITV//Java68//" +tenfile ;
                    File reader = new File(url);
                    BufferedReader file = new BufferedReader(new FileReader(reader));

                    String line = file.readLine();
                    while (line != null) {
                        System.out.println(line);
                        line = file.readLine();
                    }
                }catch (Exception e) {
                    System.out.println(e);
                }
            }
        }while(choice != 0 );
    }
}
