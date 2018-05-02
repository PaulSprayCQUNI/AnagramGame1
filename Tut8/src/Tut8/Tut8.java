/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tut8;

/**
 *
 * @author John Barber (john.barber@cqumail.com)
 */
public class Tut8
{
    private static <T extends Comparable> boolean isEqualTo(T test1, T test2)
    {
        boolean check = false;
        if (test1.equals(test2))
            check = true;
        
        return check;
    }
    private static <T> void printArray(T[] array) throws InvalidSubscriptException
    {
        printArray(array, 0, array.length);
    }
    
    private static <T> void printArray(T[] array, int fromIndex, int toIndex) throws InvalidSubscriptException
    {
        if (array == null || array.length == 0)
            return;
        
        if (fromIndex < 0 || toIndex > array.length)
            throw new InvalidSubscriptException();
        else
        {
            
            for (int i = fromIndex; i  < toIndex; i++)
            System.out.print(array[i] + " ");
            
        }
        
        System.out.println("");
    }
    
    
    public static void main(String[] args)
    {
        Double[] a1 = {4.00, 5.00};
        Double[] a2 = {6.00, 6.00};
        
        Integer[] a3 = {12, 12};
        
        Integer a4 = 6;
        
        if (Tut8.isEqualTo(a1[0], a1[1]) == true)
          System.out.println("true");
        else
          System.out.println("false");
        
        if (Tut8.isEqualTo(a2[0], a2[1]))
            System.out.println("true");
        else
            System.out.println("false");
        
        if (Tut8.isEqualTo(a4, a2[0]))
            System.out.println("yep");
        else
            System.out.println("nah");
     
        
        System.out.println("Q3 test:");
        Integer[] ints = {2,7,3,9};
        Double[] dbls = {6.00, 3.23, 8.00 ,1.00, 45.00};
        Character[] chrs = {'b', 'z', '3', 'f'};
        String[] str = {"Hello", "there", "my", "name", "is", "mac"};
        
        try
        {
            Tut8.printArray(ints);
            Tut8.printArray(dbls);
            Tut8.printArray(chrs);
            Tut8.printArray(str);

            Tut8.printArray(str,1,4);
        }
        catch (InvalidSubscriptException e)
        {
            System.out.println("ruh roh");
        }
        
        try
        {
            Tut8.printArray(str, 0,7);
        }
        catch (InvalidSubscriptException e)
        {
            System.out.println("Should throw an...");
        }
        
    }
    
    
}

