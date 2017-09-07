/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericequalstest;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class GenericEqualsTest {

    private static <T> boolean isEqualTo(T a, T b) {
        return a.equals(b);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i1 = 1;
        int i2 = 2;
        int i3 = 2;
        double d1 = 1.0;
        double d2 = 2.1;
        double d3 = 2.1;
        if (isEqualTo(d1, i1)) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");            
        }
    }
}
