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
public class Student extends Person {

    private int id;
    private String degree;

    public Student() {
        super();
        this.id = 0;
        this.degree = "";
    }

    public Student(String name, int id, String degree) {
        super(name);
        this.id = id;
        this.degree = degree;
    }

    /**
     * Get the value of degree
     *
     * @return the value of degree
     */
    public String getDegree() {
        return degree;
    }

    /**
     * Set the value of degree
     *
     * @param degree new value of degree
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }

         public String getDescription() {
             return "student " + super.getName() + " is studying " + this.getDegree();
          }

    
}
