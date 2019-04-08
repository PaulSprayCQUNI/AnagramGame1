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
public class StudentRequest extends Request {

    public StudentRequest(int rnum, String rid, int rtype) {
        super(rnum, rid, rtype);
    }

    @Override
    public void calculateCharge() {
        System.out.println("TODO NEXT WEEK???");
    }
}
