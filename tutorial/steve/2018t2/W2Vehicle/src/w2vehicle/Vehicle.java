/*
 * The MIT License
 *
 * Copyright 2018 Steven Gordon <s.d.gordon@cqu.edu.au>.
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
package w2vehicle;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class Vehicle {

    private String model;
    private String monthYear;
    private double economy;

    // Default constructor with no parameters
    public Vehicle() {
        this.model = "";
        this.monthYear = "Jul2018";
        this.economy = 0.0;
    }

    // Parameterised constructor WITHOUT shadowing
    // Ok to understand variables
    public Vehicle(String m, String my, double e) {
        this.model = m;
        this.monthYear = my;
        this.economy = e;
    }

    // Parameters constructor with SHADOWING
    // Better, but more confusing
    public Vehicle(String model, String monthYear) {
        this.model = model;
        this.monthYear = monthYear;
        this.economy = 0.0;
    }

    // Getters
    public String getModel() {
        return this.model;
    }

    public String getMonthYear() {
        return this.monthYear;
    }

    public double getEconomy() {
        return this.economy;
    }

    // Setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setMonthYear(String monthYear) {
        this.monthYear = monthYear;
    }

    public void setEconomy(double economy) {
        this.economy = economy;
    }

    // toString
    @Override
    public String toString() {
        return "Vehicle: model=" + this.model + ", monthYear=" + this.monthYear + ", economy=" + this.economy;
    }

}
