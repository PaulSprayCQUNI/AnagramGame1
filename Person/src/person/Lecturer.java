/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author 12084819 
 * paul.spray@cqumail.com
 */
public class Lecturer extends Person{
    
        private double salary;

    public Lecturer(double salary) {
        this.salary = 0.0;
    }

    public Lecturer(String name, String yearofBirth, double salary) {
        super(name, yearofBirth);
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

    @Override
    public String toString() {
        return super.toString() + "Lecturer{" + "salary=" + salary + '}';
    }

    
}
