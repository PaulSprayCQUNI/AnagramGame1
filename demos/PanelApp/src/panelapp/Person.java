/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelapp;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class Person {
    
    private String name;

    public Person() {
        this.name = "Steve";
    }

    public Person(String name) {
        this.name = name;
    }

    
    
    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + '}';
    }

}
