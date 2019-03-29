/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialwk3.pkg3;

/**
 *
 * @author 12084819
 */
public class EmployeeTest {

    public static void main(String[] args) {

        Employee[] worker = new Employee[4];

        worker[0] = new PieceWorker("Igor", "Slave", 7589, 10.0, 7.0);
        worker[1] = new SalariedEmployee("Paul", "Spray", 8000, 200.0);
        worker[2] = new SalariedEmployee("Oliver", "Spray", 8003, 300.0);
        worker[3] = new PieceWorker("Lesser", "Slave", 7778, 2.0, 3.0);

        for (Employee w : worker) {
            System.out.println(w);
        }
    }
}
