/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangle;

/**
 *
 * @author Paul Spray <paul.spray@cqumail.com>
 * Create a class Rectangle with instance variables length and width with default values of 1 for both.
 * Set and get methods for accessing its instance variables.  
 * Set methods verify assigned values with if conditional test of the input needing to be larger than 0.0 and less than 20.0. 
 * Public methods to calculate the rectangle’s perimeter and area included. 
 */
public class Rectangle {
// instance variable declarations, as private so only the class Rectangle can access them
    private double length = 1.0;
    private double width = 1.0;
    
    public Rectangle(){
       this.length = 1.0;
       this.width = 1.0;
       }
    
    public Rectangle (double length, double width){
        setLength(length);
        setWidth(width);
    }
    
    public void setLength(double length) {

        if (length <= 0.0 || length >= 20.0) {
            length = 1.0;
        }
        this.length = length;

    }

    public void setWidth(double width) {

        if (width <= 0.0 || width > 20.0) {
            width = 1.0;
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calculateArea() {
        double area = this.length * this.width;
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = 2 * (this.length + this.width);
        return perimeter;
    }

    // toString() method added to output default value for length and/or width if either/both are entered as a value outside the tested range in the set methods.
   @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }

}
