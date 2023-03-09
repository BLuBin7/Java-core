package com.syntax.TITV.Java68;

import java.io.*;
import java.util.Scanner;


/**
 * Created by Binh
 * Date : 3/9/2023 - 11:12 AM
 * Description :
 */
public class ViduFile {
    File file;

    public ViduFile(String tenfile) {
        this.file = new File(tenfile);
    }

    public boolean cotheExecute() {
        return this.file.canExecute();
    }

    public boolean cotheRead() {
        return this.file.canRead();
    }

    public boolean cotheWrite() {
        return this.file.canWrite();
    }

    public String induongdan() {
        return this.file.getPath();
    }

    public void checkfile() {
        if (this.file.isFile()) {
            System.out.println("day la tap tin");
        } else if (this.file.isDirectory()) {
            System.out.println("day la thu muc");
        }
    }

    public void danhsach() {
        if (file.isDirectory()) {
            File[] mangcon = this.file.listFiles();
            for (File file :
                    mangcon) {
                System.out.println(file.getAbsolutePath());
            }
        } else {
            System.err.println("Khong phai la thu muc");
        }
    }

    public void incaythumuc() {
        this.inChitietcaythumuc(this.file,1);
    }

    public void inChitietcaythumuc(File f, int bac){
       for(int i = 0; i < bac; i++){
           System.out.print("\t");
       }
       System.out.print("|__");
       System.out.println(f.getName());
       if(f.canRead()&&f.isDirectory()){
            File[] mangcon = f.listFiles();
           for (File fx:
                mangcon) {
               inChitietcaythumuc(fx,bac +1);
           }
       }
    }

    public void Taofile() {
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
        ViduFile file ;
        String url = "C://Intellij-Utimately//project//Java-core//Java-core//src//com//syntax//TITV//Java68//";

        Scanner input = new Scanner(System.in);

        int choice = 0;
        do{
            System.out.println("Menu");
            System.out.println("1. Kiem tra file co thuc thi");
            System.out.println("2. Kiem tra file co the doc");
            System.out.println("3. Kiem tra file co the ghi");
            System.out.println("4. In duong dan ");
            System.out.println("5. In ten file");
            System.out.println("6. Kiem tra file la thu muc hay tap tin ");
            System.out.println("7. In ra danh sach cac file con");
            System.out.println("8. In ra cay thu muc");
            System.out.println("9. Tao thu muc");
            System.out.println("10. Ghi file");
            System.out.println("11. Doc file");
            System.out.println("0. Exit");

            System.out.println("nhap lua chon");
            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.println("nhap ten file co the thuc thi");
                String suburl = input.nextLine();

                file = new ViduFile(url + suburl);

                System.out.println(file.cotheExecute());
            }

            else if (choice == 2) {
                System.out.println("nhap ten file co the doc");
                String suburl = input.nextLine();

                file = new ViduFile(url + suburl);

                System.out.println(file.cotheRead());
            }

            else if(choice == 3){
                System.out.println("nhap ten file co the ghi");
                String suburl = input.nextLine();

                file = new ViduFile(url + suburl);
                System.out.println(file.cotheWrite());

            }

            else if (choice == 4) {
                System.out.println("nhap ten file co the thuc thi");
                String suburl = input.nextLine();

                file = new ViduFile(url + suburl);
                System.out.println(file.induongdan());

            }

            else if (choice == 5) {
                System.out.println("nhap ten file co the thuc thi");
                String suburl = input.nextLine();
                System.out.println(suburl);

            }

            else if (choice == 6) {
                System.out.println("nhap ten file kiem tra");
                String suburl = input.nextLine();

                file = new ViduFile(url + suburl);
                file.checkfile();
            }
            else if (choice == 7) {
                System.out.println("Nhap ten thu muc ");
                String suburl = input.nextLine();
                file = new ViduFile(url+suburl);
                file.danhsach();

            }
            else if (choice == 8) {
                String url1 = "C://Intellij-Utimately//project//Java-core//Java-core//src//com//syntax//TITV//";

                System.out.println("Nhap ten thu muc ");
                String suburl = input.nextLine();

                file = new ViduFile(url1+suburl);
                file.incaythumuc();
            }
            else if (choice == 9) {
                System.out.println("Nhap ten thu muc can tao");
                String suburl = input.nextLine();
                file = new ViduFile(url+suburl);
                file.Taofile();
                System.out.println("Success");
            }
            else if (choice == 10) {
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
            else if (choice == 11) {
                System.out.println("nhap ten file");
                String suburl = input.nextLine();
                try {
                    File reader = new File(url+suburl);
                    BufferedReader file1 = new BufferedReader(new FileReader(reader));

                    String line = file1.readLine();
                    while (line != null) {
                        System.out.println(line);
                        line = file1.readLine();
                    }
                }catch (Exception e) {
                    System.out.println(e);
                }
            }
        }while(choice!=0);



//        Cách 2
//        do{
//            System.out.println("Nhap lua chon");
//            choice = input.nextInt();
//
//            System.out.println("===MENU===");
//            System.out.println("1. Tao thu muc ");
//            System.out.println("2. Tao file");
//            System.out.println("3. Ghi file ");
//            System.out.println("4. Doc file ");
//            input.nextLine();
//            if(choice == 1){
//                System.out.println("nhap ten file");
//                String tenpackage = input.nextLine();
//                File file = new File("C://Intellij-Utimately//project//Java-core//Java-core//src//com//syntax//TITV//Java68//" + tenpackage);
//                file.mkdir();
//                System.out.println("Tao file thanh cong ");
//            }
//            else if (choice == 2) {
//                System.out.println("nhap ten file");
//                String tenfile = input.nextLine();
//                File file = new File("C://Intellij-Utimately//project//Java-core//Java-core//src//com//syntax//TITV//Java68//" + tenfile);
//
//                try {
//                    file.createNewFile();
//                    System.out.println("Tao file thanh cong ");
//                } catch (IOException e) {
////            không có quyền tạo tập tin
////            ổ cứng bị đầy
////            đường dẫn sai
//                    e.printStackTrace();
//                }
//            }
//            else if(choice == 3){
//                System.out.println("nhap ten file");
//                String tenfile = input.nextLine();
//                try {
//                    FileWriter fw = new FileWriter("C://Intellij-Utimately//project//Java-core//Java-core//src//com//syntax//TITV//Java68//" + tenfile);
//                    System.out.println("nhap tu muon ghi : ");
//                    String ghi = input.nextLine();
//                    fw.write(ghi);
//                    fw.close();
//                } catch (Exception e) {
//                    System.out.println(e);
//                }
//                System.out.println("Success...");
//            }
//
//            else if (choice == 4) {
//                System.out.println("nhap ten file");
//                String tenfile = input.nextLine();
//                try {
//                    String url = "C://Intellij-Utimately//project//Java-core//Java-core//src//com//syntax//TITV//Java68//" +tenfile ;
//                    File reader = new File(url);
//                    BufferedReader file = new BufferedReader(new FileReader(reader));
//
//                    String line = file.readLine();
//                    while (line != null) {
//                        System.out.println(line);
//                        line = file.readLine();
//                    }
//                }catch (Exception e) {
//                    System.out.println(e);
//                }
//            }
//        }while(choice != 0 );
    }
}
