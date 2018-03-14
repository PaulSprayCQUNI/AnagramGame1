/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial_week2_person.newpackage;

/**
 *
 * @author Douglas Wheatley <douglas.wheatley@cqumail.com>
 */
public class Lecturer extends Person {
    
       private double salary;

    public Lecturer(String name, int Day, int Month, int Year, double salary) {
        super(name, Day, Month, Year);
        this.salary = salary;
    }

    public Lecturer(double salary) {
        this.salary = salary;
    }
       

    /**
     * Get the value of salary
     *
     * @return the value of salary
     */
    public double getSalary() {
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

    
    
    
}
