/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericminalg;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class GenericMinAlg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] a1 = {5, 7, 3, 8};
        Integer smalla1 = ArrayAlg.min(a1);
        System.out.println(smalla1);
        
        Double[] a2 = {5.44, 5.34, 5.37, 5.81};
        Double smalla2 = ArrayAlg.min(a2);
        System.out.println(smalla2);

    }
    
}

class ArrayAlg 
{
    public static <T> T min(T[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return null;
        }
        T smallest = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (smallest.compareTo(inputArray[i]) > 0) {
                smallest = inputArray[i];
            }
        }
        return smallest;
    }
           
}