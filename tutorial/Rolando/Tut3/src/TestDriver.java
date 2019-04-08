/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s0287181
 */
public class TestDriver {

    public static void main(String[] args) {
        Employee[] staff = new Employee[4];

        staff[0] = new PieceWorker(30.0, 100, "Alex", "Temmingh", 123456);
        staff[1] = new PieceWorker(20.0, 70, "Louis", "Smith", 123678);
        staff[2] = new PieceWorker(23.0, 133, "Jarrod", "Edwards", 123098);
        staff[3] = new SalariedEmployee (1400.00, "Alex", "De Roma", 124789);

        for (Employee e : staff) {
            System.out.println("Employee " + e.getFirstName() + " " + e.getLastName() + " has an earning of " + e.earnings());
        }
    }
}