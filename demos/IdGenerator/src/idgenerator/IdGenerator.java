/*
 * The MIT License
 *
 * Copyright 2019 Steven Gordon <s.d.gordon@cqu.edu.au>.
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
package idgenerator;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class IdGenerator {

    private static int counter = 1000;
    private String counterType;

    /**
     * Get the value of counterType
     *
     * @return the value of counterType
     */
    public String getCounterType() {
        return counterType;
    }

    /**
     * Set the value of counterType
     *
     * @param counterType new value of counterType
     */
    public void setCounterType(String counterType) {
        this.counterType = counterType;
    }

    /**
     * Get the value of counter
     *
     * @return the value of counter
     */
    public static int getCounter() {
        return counter;
    }

    /**
     * Set the value of counter
     *
     * @param counter new value of counter
     */
    public static void setCounter(int counter) {
        IdGenerator.counter = counter;
    }

    public static void increment() {
        counter++;
    }
    
    public static String getNextStudentId() {
        counter++;
        return "S" + counter;
    }

    public static String getNextTeacherId() {
        counter++;
        return "T" + counter;
    }    
}
