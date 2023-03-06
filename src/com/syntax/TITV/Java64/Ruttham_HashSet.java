package com.syntax.TITV.Java64;

import java.util.*;

/**
 * Created by Binh
 * Date : 3/6/2023 - 8:01 PM
 * Description :
 */
public class Ruttham_HashSet {
//    cấu trúc : sẽ có 1 phiếu, mà mỗi 1 phiếu sẽ có những mã khác nhau
//        Tạo tập hợp chứa phiếu dự thưởng
Set<String> taphopphieu = new HashSet<String>();

    public Ruttham_HashSet() {
    }

    public void In(){
//        cách 1
//        System.out.println(Arrays.toString(this.taphopphieu.toArray()));

//        cách 2
          System.out.println(this.taphopphieu);

    }

    public boolean Them(String giatri){
        return this.taphopphieu.add(giatri);
    }

    public boolean Xoa(String giatri){
        return this.taphopphieu.remove(giatri);
    }

    public boolean Kiemtra(String giatri) {
        return this.taphopphieu.contains(giatri);
    }

    public void XoaAll(){
        this.taphopphieu.clear();
    }

    public int SoLuong(){
        return this.taphopphieu.size();
    }

    public String ruttham(){
        String ketqua = "";
//        Tạo class Random để lấy ra giá trị random
        Random rd = new Random();
//        tức là lấy tới max là trong khoảng tập hợp phiếu
        int Vitri = rd.nextInt(this.taphopphieu.size());
//        lấy ra giá trị tại Vitri dưới dạng mảng, sau đó đổi dạng mảng về thành String
        ketqua = (String)this.taphopphieu.toArray()[Vitri];
        return ketqua;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Ruttham_HashSet ruttham = new Ruttham_HashSet();


        int choice = 0;
        do{
            System.out.println("----------------------");
            System.out.println("Menu");
            System.out.println("1. Them");
            System.out.println("2. Xoa");
            System.out.println("3. Kiem tra co bi trung");
            System.out.println("4. Xoa tat ca cac phieu ");
            System.out.println("5. So luong phieu du thuong");
            System.out.println("6. Rut tham");


            System.out.println("Nhap lua chon : ");
            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.println("nhap phieu can them : ");
                String giatri = input.nextLine();

//            Lưu ý: phải khai báo class với tên ruttham thì mới trỏ tới được
                System.out.println(ruttham.Them(giatri));
                ruttham.In();
            }
            else if (choice == 2) {
                System.out.println("nhap phieu can xoa : ");
                String giatri = input.nextLine();

//            Lưu ý: phải khai báo class với tên ruttham thì mới trỏ tới được
                System.out.println(ruttham.Xoa(giatri));
                ruttham.In();
            }
            else if (choice == 3) {
                System.out.println("nhap phieu can kiem tra : ");
                String giatri = input.nextLine();

//            Lưu ý: phải khai báo class với tên ruttham thì mới trỏ tới được
                System.out.println(ruttham.Kiemtra(giatri));
                ruttham.In();
            }
            else if (choice == 4) {
                ruttham.XoaAll();
                System.out.println("So phieu hien tai");
                ruttham.In();
            }
            else if (choice == 5) {
                System.out.println("so luong phieu co trong du thuong : " + ruttham.SoLuong());
            }
            else if (choice == 6) {
                System.out.println("phieu rut la : " + ruttham.ruttham());
                ruttham.In();
            }

        }while(choice != 0);
    }


}
