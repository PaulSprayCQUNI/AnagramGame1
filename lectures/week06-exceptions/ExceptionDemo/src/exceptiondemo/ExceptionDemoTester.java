/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiondemo;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class ExceptionDemoTester {
    public static void main(String[] args) {
        ExceptionDemo ed1 = new ExceptionDemo(5,4);
        ExceptionDemo ed2 = new ExceptionDemo(3,4);
        
        try {
            int answer = ed1.subtract();
            System.out.println(answer);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        
        
        try {
            int answer = ed2.subtract();
            System.out.println(answer);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}
