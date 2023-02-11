package com.syntax.jmasterCoBan.Java45;

/**
 * The type Employee.
 */
public class Employee extends Person {
    private double salary;


    /**
     * Instantiates a new Employee.
     *
     * @param name   the name
     * @param salary the salary
     */
//    Constructor 1
//    super() là gọi constructor mặc đinh của class cha
//    ở đây nó mặc định là super (do class con kế thừa class cha)
//    Nên việc super ở constructor rỗng CÓ HAY KHÔNG CŨNG ĐƯỢC
//    public Employee() {
//        super();
//    }
////  Constructor 2
//    public Employee(String name) {
//        super(name);
//    }
//  Constructor 3
    public Employee(String name ,double salary) {
        super(name);
        this.salary = salary;
    }

    /**
     * Gets salary.
     *
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets salary.
     *
     * @param salary the salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

}

