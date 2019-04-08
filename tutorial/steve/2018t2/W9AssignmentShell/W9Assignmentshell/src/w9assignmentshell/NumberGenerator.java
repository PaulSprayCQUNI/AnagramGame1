/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w9assignmentshell;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class NumberGenerator {
    
    private static int counter = 1000;

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
        NumberGenerator.counter = counter;
    }
    
    public static void increment() {
        counter++;
    }

    
    
    
}
