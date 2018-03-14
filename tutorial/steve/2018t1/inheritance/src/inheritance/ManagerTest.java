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
package inheritance;

import java.time.LocalDate;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class ManagerTest {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Steve", 100000.0, 2018, 3, 14);
        Employee e3 = new Employee("Jamie", 150000.0, 2018, 3, 13);
        Manager m1 = new Manager("Ray", 200000.0, 2017, 1, 1);
        e1.setName("Colin");
        e1.setSalary(90000.0);
        e1.setHireDay(LocalDate.now());
        m1.setBonus(15000.0);
        
        System.out.println("Name=" + e1.getName());
        System.out.println("Name=" + e1.getName() + " Salary=" + e1.getSalary());
        System.out.println(e1);
        System.out.println(m1);

    }
}
