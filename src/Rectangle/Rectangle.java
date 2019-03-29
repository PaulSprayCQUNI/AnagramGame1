/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangle;

/**
 *
 * @author Paul Spray <paul.spray@cqumail.com>
 */
public class Rectangle {

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

        if (length <= 0.0 || length > 20.0) {
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

    private double calculateArea() {
        double area = this.length * this.width;
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = 2 * (this.length + this.width);
        return perimeter;
    }

   @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }

}
