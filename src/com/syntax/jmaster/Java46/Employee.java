package com.syntax.jmaster.Java46;

public class Employee extends Person{
    private int so_nam_kinh_nghiem ;

    public Employee(String name, int so_nam_kinh_nghiem) {
        super(name);
        this.so_nam_kinh_nghiem = so_nam_kinh_nghiem;
    }

    public int getSo_nam_kinh_nghiem() {
        return so_nam_kinh_nghiem;
    }

    public void setSo_nam_kinh_nghiem(int so_nam_kinh_nghiem) {
        this.so_nam_kinh_nghiem = so_nam_kinh_nghiem;
    }
    @Override
    public double luong()
        {
            return LUONG_CO_BAN*so_nam_kinh_nghiem;
        }
}
