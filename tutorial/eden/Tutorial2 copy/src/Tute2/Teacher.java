/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tute2;

/**
 *
 * @author Eden Thornbury Hemming e.thornburyhemming@cqumail.com
 */
public class Teacher extends Person {
    
    private double salary;

    public Teacher() {
    }

    public Teacher(double salary, String name, int yearOfBirth) {
        super(name, yearOfBirth);
        this.salary = salary;
    }
    

    /**
     * Get the value of salary
     *
     * @return the value of salary
     */
    public double getSalery() {
        return salary;
    }

    /**
     * Set the value of salary
     *
     * @param salary new value of salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "Teacher{" + "salary=" + salary + '}';
    }

}
