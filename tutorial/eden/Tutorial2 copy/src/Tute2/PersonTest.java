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
public class PersonTest {
    public static void main(String[] args) {
        Person[] Per = new Person[3];
        
        Per[0] = new Teacher(50000.0, "Sarah", 1970);
        Per[1] = new Student("Geology", "John", 1997);
        Per[2] = new Student("Vet Science", "Sally", 1995);
        
        for(Person p: Per){
            System.out.println(p);
        }
        
        
    }
}
