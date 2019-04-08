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
package simpleemployeedemo;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class EmployeeTester {
    public static void main(String[] args) {
        Employee e1;
        e1 = new Employee();
        e1.setName("Jamie");
        
        Employee e2 = new Employee("Steve", 50000.0, 2018, 3, 3);
        
        System.out.println(e1.getName());
        System.out.println(e2.getName() + " " + e2.getSalary());
        
        Employee[] staff = new Employee[3];
        
        staff[0] = new Employee("Mark",100000.0);
        staff[1] = new Employee("Del",150000.0);
        staff[2] = new Employee("Stewart",70000.0);

        for (int i=0; i < 3; i++) {
            System.out.println(staff[i].getName());
        }
        
        for (Employee emp: staff) {
            System.out.println(emp.getSalary());
            
        }
    }
    
}
