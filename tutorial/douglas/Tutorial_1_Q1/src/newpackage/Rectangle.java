/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Douglas Wheatley <douglas.wheatley@cqumail.com>
 */
public class Rectangle {

    private double length;
    private double width;

    public Rectangle() {
        this.length = 1;//creates value of one
        this.width = 1;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Get the value of width
     *
     * @return the value of width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Set the value of width
     *
     * @param width new value of width
     */
    public void setWidth(double width) {
        this.width = width;

        if (width < 0.0) {
            System.out.println("Wrong value");
        }
        if (width > 20.0) {
            System.out.println("Wrong value");
        }

    }

    /**
     * Get the value of length
     *
     * @return the value of length
     */
    public double getLength() {
        return length;
    }

    /**
     * Set the value of length
     *
     * @param length new value of length
     */
    public void setLength(double length) {
        this.length = length;

        if (length < 0.0) {
            System.out.println("Wrong value");
        }
        if (length > 20.0) {
            System.out.println("Wrong value");
        }

    }
    
    public double calculatePerimeter(){
       return 2 * (length + width);
    }
    
    public double calculateArea(){
        return length * width; 
    }
    
    

}
