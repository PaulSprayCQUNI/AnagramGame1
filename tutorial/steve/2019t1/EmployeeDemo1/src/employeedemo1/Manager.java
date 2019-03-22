/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedemo1;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class Manager extends Employee {
    
    private double bonus;

    public Manager() {
        super();
        this.bonus = 0;
    }

    public Manager(String firstName, String lastName, double salary, double bonus) {
        super(firstName, lastName, salary);
        this.bonus = bonus;
    }
    
    
    /**
     * Get the value of bonus
     *
     * @return the value of bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * Set the value of bonus
     *
     * @param bonus new value of bonus
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Manager{" + super.getFirstName() + ", " + super.getLastName() + ", " + getSalary() + "}";
    }

    
    
}
