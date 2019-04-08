/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloadtest;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class OverloadTest {

    private static void printMarks(Integer a1, Integer a2) {
        System.out.println("\tAssignment 1 = " + a1+"\n\tAssignment 2 = "+a2);
    }
    
    private static void printMarks(Float a1, Float a2) {
        System.out.println("\tAssignment 1 = " + a1+"\n\tAssignment 2 = "+a2);
    }

    private static void printMarks(Double a1, Double a2) {
        System.out.println("\tAssignment 1 = " + a1+"\n\tAssignment 2 = "+a2);
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer subject1Assignment1Mark = 12;
        Integer subject1Assignment2Mark = 15;
        Float subject2Assignment1Mark =   12.51234567890123456789f;
        Float subject2Assignment2Mark =   15.999999999999999f;
        Double subject3Assignment1Mark =  12.51234567890123456789;
        Double subject3Assignment2Mark =  15.999999999999999;
        
        System.out.println("Marks scored in Subject 1");
        printMarks(subject1Assignment1Mark, subject1Assignment2Mark);

        System.out.println("Marks scored in Subject 2");
        printMarks(subject2Assignment1Mark, subject2Assignment2Mark);

        System.out.println("Marks scored in Subject 3");
        printMarks(subject3Assignment1Mark, subject3Assignment2Mark);
        
    }
    
}
