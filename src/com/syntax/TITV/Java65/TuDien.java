package com.syntax.TITV.Java65;

import java.util.*;

/**
 * Created by Binh
 * Date : 3/7/2023 - 9:56 PM
 * Description : Java 65. Hiểu rõ cấu trúc Map của Java | Viết chương trình tra từ điển Anh - Việt
 */
public class TuDien {
    private Map<String,String> slangword = new TreeMap<String,String>();

    public String Them(String tukhoa,String ynghia){
        return this.slangword.put(tukhoa,ynghia);
    }

    public String xoa(String tukhoa) {
        return this.slangword.remove(tukhoa);
    }

    public String tratu(String tukhoa){
//        hàm get giúp lấy ra value tương ứng
        String Ynghia = this.slangword.get(tukhoa);
        return Ynghia;
    }

    public void in(){
//      do từ khóa thỏa điều kiện khác nhau, khá giống với cấu trúc Set
//        keySet là lấy ra hết toàn bộ từ khóa
        Set<String> taphoptukhoa = this.slangword.keySet();
//        cách in 1
        System.out.println(Arrays.toString(taphoptukhoa.toArray()));
//        cách in 2
//        System.out.println(taphoptukhoa);
    }

    public int laysoluong(){
        return this.slangword.size();
    }

    public void xoaall() {
        this.slangword.clear();
    }


    public static  void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TuDien tudien = new TuDien();

        int choice = 0;
        do {
            System.out.println("----------------------");
            System.out.println("Menu");
            System.out.println("1. Them");
            System.out.println("2. Xoa");
            System.out.println("3. Tra tu");
            System.out.println("4. So luong ");
            System.out.println("5. Xoa tat ca  ");

            System.out.println("Nhap lua chon");
             choice = input.nextInt();
             input.nextLine();

            if (choice ==1 ) {
                System.out.println("nhap tu muon them");
                String tukhoa = input.nextLine();
                System.out.println("nhap y nghia cua tu");
                String nghia = input.nextLine();
                tudien.Them(tukhoa,nghia);

                System.out.println("Tu sau khi them");
                tudien.in();

            }
            else if (choice ==2 ) {
                System.out.println("nhap tu muon xoa");
                String tukhoa = input.nextLine();
                tudien.xoa(tukhoa);

                System.out.println("Tu sau khi xoa");
                tudien.in();
            }
            else if (choice == 3) {
                System.out.println("nhap tu muon tra");
                String tukhoa = input.nextLine();

                System.out.println("Nghia cua tu la : " + tudien.tratu(tukhoa));
            }
            else if (choice == 4) {
                System.out.println("so luong tu la : " + tudien.laysoluong());
            }
            else if (choice == 5) {
                tudien.xoaall();
                System.out.println("tu dien sau khi xoa het du lieu : ");
                tudien.in();
            }
        }while (choice !=0);

    }
}
