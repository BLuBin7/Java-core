package com.syntax.TITV.Java59.test;

/**
 * Created by Binh
 * Date : 3/3/2023 - 7:12 PM
 * Description :
 */
//Enum được sử dụng khi sử dụng các thuộc tính giới hạn giá trị
public enum Day {
    Monday(1),
    Tuesday(5),
    Wednesday(3),
    Thursday(6),
    Friday(7),
    Saturday(9),
    Sunday(8);

    private final int soTiet;
// Tổng hợp các operation chung cho enum
    Day(int soTiet) {
        this.soTiet = soTiet;
    }

    public int getSoTiet() {
        return soTiet;
    }
}
