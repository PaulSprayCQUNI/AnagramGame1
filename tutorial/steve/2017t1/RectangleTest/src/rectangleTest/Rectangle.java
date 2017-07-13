/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangleTest;

/**
 *
 * @author sgordon
 */
public class Rectangle {
    private Double length;
    private Double width;
    
    public Rectangle() {
        setLength(1.0);
        setWidth(1.0);
        
    }


    /**
     * @return the length
     */
    public Double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(Double length) {
        if (length < 0.0 && length > 20.0) {
            length = 1.0;
        }
        this.length = length;
    }

    /**
     * @return the width
     */
    public Double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(Double width) {
        if (width < 0.0 && width > 20.0) {
            width = 1.0;
        }
        this.width = width;
    }
    
    public Double getArea() {
        return getLength() * getWidth();
    }
    
    public Double getPerimeter() {
        return 2 * getLength() + 2 * getWidth();
    }
}
