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
public class Student extends Person {
    
    private String major;

    public Student() {
    }

    public Student(String major, String name, int yearOfBirth) {
        super(name, yearOfBirth);
        this.major = major;
    }
    

    /**
     * Get the value of major
     *
     * @return the value of major
     */
    public String getMajor() {
        return major;
    }

    /**
     * Set the value of major
     *
     * @param major new value of major
     */
    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" + "major=" + major + '}';
    }

}
