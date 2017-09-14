/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SIERP1
 */
public class Study  implements Needable {


    String courseId;
    String courseName;
    double cost;

    /**
     *
     * @param name
     * @param price
     */
    public Study() {
    }

    public Study(String courseId, String courseName, double cost) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return  "courseId = " + courseId + ", courseName = " + courseName + ", cost = $" + cost + '\n';
    }

}// end of class study

