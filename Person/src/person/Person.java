/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author 12084819
 */
public class Person {

    private String name;

    private String yearofBirth;

    public Person() {
        this.name = "";
        this.yearofBirth = "";

    }

    public Person(String name, String yearofBirth) {
        this.name = name;
        this.yearofBirth = yearofBirth;
    }

    /**
     * Get the value of yearofBirth
     *
     * @return the value of yearofBirth
     */
    public String getYearofBirth() {
        return yearofBirth;
    }

    /**
     * Set the value of yearofBirth
     *
     * @param yearofBirth new value of yearofBirth
     */
    public void setYearofBirth(String yearofBirth) {
        this.yearofBirth = yearofBirth;
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
        return "Person{" + "name=" + name + ", yearofBirth=" + yearofBirth + '}';
    }

}
