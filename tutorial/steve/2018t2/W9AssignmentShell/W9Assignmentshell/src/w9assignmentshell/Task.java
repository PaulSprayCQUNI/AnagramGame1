/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w9assignmentshell;

import java.util.Date;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class Task {
    
    // Instance variables
    private Date openDate;
    private Date closeDate;
    private int taskType;

    public Task(int type) {
        this.taskType = type;
    }

    /**
     * Get the value of taskType
     *
     * @return the value of taskType
     */
    public int getTaskType() {
        return taskType;
    }

    /**
     * Set the value of taskType
     *
     * @param taskType new value of taskType
     */
    public void setTaskType(int t) {
        this.taskType = t;
    }


    /**
     * Get the value of closeDate
     *
     * @return the value of closeDate
     */
    public Date getCloseDate() {
        return closeDate;
    }

    /**
     * Set the value of closeDate
     *
     * @param closeDate new value of closeDate
     */
    public void setCloseDate(Date d) {
        this.closeDate = d;
    }


    /**
     * Get the value of openDate
     *
     * @return the value of openDate
     */
    public Date getOpenDate() {
        return openDate;
    }

    /**
     * Set the value of openDate
     *
     * @param openDate new value of openDate
     */
    public void setOpenDate(Date d) {
        this.openDate = d;
    }

    public String getTaskTypeString() {
        return "I will write this later";
    }
}
