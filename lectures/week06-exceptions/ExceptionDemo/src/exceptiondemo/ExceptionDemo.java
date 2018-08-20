/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiondemo;

import java.io.*;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class ExceptionDemo {

    private int a;
    private int b;

    public ExceptionDemo() {
        a = 0;
        b = 0;
    }

    public ExceptionDemo(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
   
    /**
     * Get the value of b
     *
     * @return the value of b
     */
    public int getB() {
        return b;
    }

    /**
     * Set the value of b
     *
     * @param b new value of b
     */
    public void setB(int b) {
        this.b = b;
    }


    /**
     * Get the value of a
     *
     * @return the value of a
     */
    public int getA() {
        return a;
    }

    /**
     * Set the value of a
     *
     * @param a new value of a
     */
    public void setA(int a) {
        this.a = a;
    }

    
    public int subtract() throws IOException {
        if (a - b < 0) {
            throw new IOException();
            
            //throw new NegativeNumberException("subtract()");
        }
        else {
            return a-b;
        }
    }
    
    @Override
    public String toString() {
        return "ExceptionDemo{" + "a=" + a + ", b=" + b + '}';
    }

    
}
