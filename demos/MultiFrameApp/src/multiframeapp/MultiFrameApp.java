/*
 * The MIT License
 *
 * Copyright 2019 Steven Gordon <s.d.gordon@cqu.edu.au>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package multiframeapp;

import java.awt.*;
import javax.swing.*;

/**
 * This is a multiple frame app, where there is a main (Welcome) frame opened 
 * and when clicking buttons other frames are opened. It is implemented so that
 * only one frame is open at a time.
 * 
 * The idea is that:
 *  - the MultiFrameApp constructs a WelcomeFrame
 *  - WelcomeFrame has buttons for functionality, specifically a Edit button
 *    to open the EditFrame and Display button to open the DisplayFrame. There 
 *    is also Exit.
 *  - when the Edit button is pressed the current WindowFrame is disposed 
 *    (hidden) while a new Edit Frame is constructed and set visible. This 
 *    implements the switching between frames.
 *  - EditFrame allows the user to edit details. In this demo it is simple
 *    a Person.
 * 
 * While there are other ways to implement similar functionality (e.g. tabs,
 * Dialog boxes) this demonstrates the Frame based approach. Using multiple
 * frames is generally not the best approach but for simplicity here it is.
 * 
 * 
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class MultiFrameApp {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            WelcomeFrame frame = new WelcomeFrame();
            frame.setTitle("Welcome Frame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 300);
            frame.setVisible(true);
        });
    }

}
