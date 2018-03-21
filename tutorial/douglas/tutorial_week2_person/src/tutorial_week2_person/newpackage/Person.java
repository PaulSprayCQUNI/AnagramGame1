/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial_week2_person.newpackage;

/**
 *
 * @author Douglas Wheatley <douglas.wheatley@cqumail.com>
 */
public class Person {

    private String name;

    private int Day;
    
    private int Month;
    
    private int Year;

    public Person(String name, int Day, int Month, int Year) {
        this.name = name;
        this.Day = Day;
        this.Month = Month;
        this.Year = Year;
    }

    public Person() {
        this.name = "Jeff";
        this.Day = 24;
        this.Month = 11;
        this.Year = 1996;
    }
                
   
    
    

    /**
     * Get the value of Year
     *
     * @return the value of Year
     */
    public int getYear() {
        return Year;
    }

    /**
     * Set the value of Year
     *
     * @param Year new value of Year
     */
    public void setYear(int Year) {
        this.Year = Year;
    }


    /**
     * Get the value of Month
     *
     * @return the value of Month
     */
    public int getMonth() {
        return Month;
    }

    /**
     * Set the value of Month
     *
     * @param Month new value of Month
     */
    public void setMonth(int Month) {
        this.Month = Month;
    }


    /**
     * Get the value of Day
     *
     * @return the value of Day
     */
    public int getDay() {
        return Day;
    }

    /**
     * Set the value of Day
     *
     * @param Day new value of Day
     */
    public void setDay(int Day) {
        this.Day = Day;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", Day=" + Day + ", Month=" + Month + ", Year=" + Year + '}';
    }

    
    
}
