/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractClasses;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public abstract class Person {

    public abstract String getDescription();
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
