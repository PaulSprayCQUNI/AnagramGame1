/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileops2;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
import java.io.*;

public class MyFormatException extends IOException {

    public MyFormatException() {
    }

    public MyFormatException(String message) {
        super("Something wrong " + message);
    }
}
