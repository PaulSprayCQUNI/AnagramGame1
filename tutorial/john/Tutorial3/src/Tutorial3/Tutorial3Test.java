/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial3;

/**
 *
 * @author John Barber <john.barber@cqumail.com>
 */
public class Tutorial3Test
{
    public static void main(String[] args)
    {
        Employee[] pWorkers = new Employee[5];
        
        pWorkers[0] = new PieceWorker("Alex", "Kuchas","450480",50,2);
        pWorkers[1] = new PieceWorker("Thomas", "Jefferson", "124506", 100, 1);
        pWorkers[2] = new PieceWorker("Harold", "Holt", "687098709", 60, 3);
        pWorkers[3] = new SalariedWorker("John", "Barber", "3098098", 50000);
        pWorkers[4] = new SalariedWorker("Robert", "Menzies", "90909", 97000);
        
        for (Employee pw : pWorkers)
            System.out.println(pw.toString());
    }
}
