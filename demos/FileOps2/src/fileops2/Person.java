/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileops2;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class Person {

    private String firstName;
    private String lastName;
    private Integer yearOfBirth;

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.yearOfBirth = 0;
    }

    public Person(String firstName, String lastName, Integer yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + yearOfBirth;
    }
}
