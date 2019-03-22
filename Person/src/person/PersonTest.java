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
public class PersonTest {

    public static void main(String[] args) {
        
        Person[] people = new Person[4];
        
        people[0] = new Student("Paul", "1979","ICT");
        people[1] = new Student("Susanne", "1975","BA");
        people[2] = new Student("Oliver", "2005", "Eng");
        people[3] = new Lecturer("Seyed", "1965",75000.0);
        
        for (Person p : people){
            System.out.println(p);
        }
    }
    
}
