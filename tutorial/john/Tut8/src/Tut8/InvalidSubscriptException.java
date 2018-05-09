/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tut8;

import java.io.IOException;

/**
 *
 * @author John Barber (john.barber@cqumail.com)
 */
public class InvalidSubscriptException extends IOException
{
    InvalidSubscriptException()
    {
        System.out.println("Exception!");
    }
    
    void printDetails()
    {
        super.toString();
    }
}
