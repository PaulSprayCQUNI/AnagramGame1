/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * @author brook
 */
public class LoginOut {
    private String location;
    private String inOut;
    private int mobile;
    private int pin;

    public LoginOut(String location, String inOut, int mobile, int pin) {
        this.location = location;
        this.inOut = inOut;
        this.mobile = mobile;
        this.pin = pin;
    }

    
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getInOut() {
        return inOut;
    }

    public void setInOut(String inOut) {
        this.inOut = inOut;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "LoginOut{" + "location=" + location + ", inOut=" + inOut + ", mobile=" + mobile + ", pin=" + pin + '}';
    }
    
    
}
