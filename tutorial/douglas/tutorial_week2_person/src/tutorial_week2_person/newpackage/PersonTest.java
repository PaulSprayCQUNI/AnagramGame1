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
public class PersonTest{
    
    
    public static void main(String[] args) {
        //Vehicle v1 = new Vehicle("Holden",2005,4);

                
        Person p1 = new Person ("douglas",24,11,1996);
        Student s1 = new Student();
        s1.setName("timbo");
        s1.setDay(4);
        s1.setMonth(8);
        s1.setYear(12);
        Lecturer l1 = new Lecturer ("sancho",4,6,1992,988.99);
                
        System.out.println(p1);
        System.out.println(s1);
        System.out.println(l1);
        
    }
    
    
    
            
           
    
    
}
