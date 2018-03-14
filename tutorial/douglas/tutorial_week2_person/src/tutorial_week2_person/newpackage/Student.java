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
public class Student extends Person {
    
        private String major;

    public Student(String name, int Day, int Month, int Year,String major) {
        super(name, Day, Month, Year);
        this.major = major;
    }

    public Student(String major) {
        this.major = major;
    }

    public Student() {
        
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

    
    
}
