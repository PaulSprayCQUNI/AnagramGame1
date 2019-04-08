/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w9assignmentshell;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public abstract class Request {
    
    private int requestNumber;
    private String requestId;
    private boolean requestStatus;
    private double requestCharge;
    private Task requestTask;

    public Request(int rnum, String rid, int rtype) {
        this.requestNumber = rnum;
        this.requestId = rid;
        // TODO
    }

    /**
     * Get the value of task
     *
     * @return the value of task
     */
    public Task getTask() {
        return requestTask;
    }

    /**
     * Set the value of task
     *
     * @param task new value of task
     */
    public void setTask(Task task) {
        this.requestTask = task;
    }


    /**
     * Get the value of requestCharge
     *
     * @return the value of requestCharge
     */
    public double getRequestCharge() {
        return requestCharge;
    }

    /**
     * Set the value of requestCharge
     *
     * @param requestCharge new value of requestCharge
     */
    public void setRequestCharge(double rcharge) {
        this.requestCharge = rcharge;
    }


    /**
     * Set the value of requestStatus
     *
     * @param requestStatus new value of requestStatus
     */
    public void setRequestStatus(boolean s) {
        this.requestStatus = s;
    }


    /**
     * Get the value of requestId
     *
     * @return the value of requestId
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Set the value of requestId
     *
     * @param requestId new value of requestId
     */
    public void setRequestId(String rid) {
        this.requestId = rid;
    }


    /**
     * Get the value of requestNumber
     *
     * @return the value of requestNumber
     */
    public int getRequestNumber() {
        return requestNumber;
    }

    /**
     * Set the value of requestNumber
     *
     * @param requestNumber new value of requestNumber
     */
    public void setRequestNumber(int n) {
        this.requestNumber = n;
    }

    
    public void calculateCharge() {
        System.out.println("TODO???");        
    }
    
    public String getRequestStatusString() {
        return "TODO";
    }

}
