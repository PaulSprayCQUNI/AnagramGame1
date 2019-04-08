
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s0287181
 */
public class Person {
    
    private String name;
    
    private LocalDate yearOfBirth;

    public Person(String name, LocalDate yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }
    public Person() {
        this.name = "";
        this.yearOfBirth = LocalDate.of(0, 0, 0);
    }

    /**
     * Get the value of yearOfBirth
     *
     * @return the value of yearOfBirth
     */
    public LocalDate getYearOfBirth() {
        return yearOfBirth;
    }

    /**
     * Set the value of yearOfBirth
     *
     * @param yearOfBirth new value of yearOfBirth
     */
    public void setYearOfBirth(LocalDate yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
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
        return "Person{" + "name=" + name + ", yearOfBirth=" + yearOfBirth + '}';
    }

    
}
