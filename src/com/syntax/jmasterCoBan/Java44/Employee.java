package com.syntax.jmasterCoBan.Java44;

/**
 * The type Employee.
 */
public class Employee extends Person{
    /**
     * Instantiates a new Employee.
     */
//    employee là IS-A : employee là 1 person
//    cách 1 : khai báo constructor mà không cần truyền đối số
//    nhược điểm : khai báo nhiều constructor sẽ tốn code hơn
    public Employee()
    {
        super("A");
    }

    /**
     * Instantiates a new Employee.
     *
     * @param ten the ten
     */
//  cách 2 : khai báo constructor mà cần phải truyền đối số
//  ƯU TIÊN XÀI CÁCH NÀY
    public Employee(String ten) {
        super(ten);
    }
}
