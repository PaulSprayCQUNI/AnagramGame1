/*
 * The MIT License
 *
 * Copyright 2018 Steven Gordon <s.d.gordon@cqu.edu.au>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package personabstraction;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class EmployeeTester {

    public static void main(String[] args) {
        
        /* 1st approach - variables */
        Employee e1;
        e1 = new Employee("Steve", 100000.0);

        Employee e2;
        e2 = new Employee("Jamie", 120000.0, 2016, 1, 31);
        
        Manager m1;
        m1 = new Manager("Col", 200000.0, 1981, 12, 25, 35000.0);
        
        System.out.println(e1.getName() + " " + e1.getSalary());
        System.out.println(e2.getName() + " " + e2.getSalary());
        System.out.println(m1.getName() + " " + m1.getSalary() + " " + m1.getBonus());
        
        Student s1 = new Student("Del", 1, "Bachelor of IT");
        System.out.println(s1.getName());

        // Cannot create a Person object since it is abstract class
        //Person p1 = new Person("Mark");
        //System.out.println(p1.getName());
        
        System.out.println(s1.getDescription());
       
        
        /* 2nd approach - array */
        Employee[] staffList = new Employee[3];
        staffList[0] = new Employee("Steve", 100000.0);
        staffList[1] = new Employee("Jamie", 120000.0, 2016, 1, 31);
        staffList[2] = new Manager("Col", 200000.0, 1981, 12, 25, 35000.0);

        for (Employee emp : staffList) {
            System.out.println(emp.getName() + " " + emp.getSalary());
        }

        for (Employee emp : staffList) {
            System.out.println(emp.getDescription());

        }

        

    }

}
