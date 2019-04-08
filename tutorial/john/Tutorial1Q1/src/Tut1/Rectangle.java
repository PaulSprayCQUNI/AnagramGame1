/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tut1;

/**
 *
 * @author John Barber <john.barber@cqumail.com>
 */
public class Rectangle {

    private double length;
    private double width;

    public double calculateArea() {
        return (length * width);
    }

    public double calculatePerimeter(){
        return ( 2 * ( length + width ) );
    }

    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

    //this is a comment
    public Rectangle() 
    {
        this.length = 1;
        this.width = 1;
    }

    /**
     * Get the value of width
     *
     * @return the value of width
     */
    public double getWidth() 
    {
        return width;
    }

    /**
     * Set the value of width
     *
     * @param width new value of width
     */
    public void setWidth(double width) 
    {
        if (width > 0 || width < 20.0) 
        {
            this.width = width;
        } else 
        {
            this.width = 1;
        }
    }

    /**
     * Get the value of length
     *
     * @return the value of length
     */
    public double getLength() 
    {
        return length;
    }

    /**
     * Set the value of length
     *
     * @param length new value of length
     */
    public void setLength(double length) 
    {
        if (length > 0 || length < 20.0) 
        {
            this.length = length;
        } else 
        {
            this.length = 1;
        }
    }

}
