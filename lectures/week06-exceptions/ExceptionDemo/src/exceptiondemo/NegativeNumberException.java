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

import java.io.*;

public class NegativeNumberException extends IOException {

    public NegativeNumberException() {
    }

    public NegativeNumberException(String message) {
        super("Cannot have a negative answer: " + message);
    }
}
