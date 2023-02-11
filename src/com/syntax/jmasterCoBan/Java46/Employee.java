package com.syntax.jmasterCoBan.Java46;

/**
 * The type Employee.
 */
public class Employee extends Person{
    private int so_nam_kinh_nghiem ;

    /**
     * Instantiates a new Employee.
     *
     * @param name               the name
     * @param so_nam_kinh_nghiem the so nam kinh nghiem
     */
    public Employee(String name, int so_nam_kinh_nghiem) {
        super(name);
        this.so_nam_kinh_nghiem = so_nam_kinh_nghiem;
    }

    /**
     * Gets so nam kinh nghiem.
     *
     * @return the so nam kinh nghiem
     */
    public int getSo_nam_kinh_nghiem() {
        return so_nam_kinh_nghiem;
    }

    /**
     * Sets so nam kinh nghiem.
     *
     * @param so_nam_kinh_nghiem the so nam kinh nghiem
     */
    public void setSo_nam_kinh_nghiem(int so_nam_kinh_nghiem) {
        this.so_nam_kinh_nghiem = so_nam_kinh_nghiem;
    }
    @Override
    public double luong()
        {
            return LUONG_CO_BAN*so_nam_kinh_nghiem;
        }
}
