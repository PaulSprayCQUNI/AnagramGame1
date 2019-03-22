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
public class Student extends Person {
    
        private String major;

    public Student() {
        super();
        this.major = "";
    }

    public Student(String name, String yearofBirth, String major) {
        super(name, yearofBirth);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" + "major=" + major + '}';
    }
    
    
}
