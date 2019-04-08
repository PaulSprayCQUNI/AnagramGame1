
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SIERP1
 */
public class AllExpense<T extends Needable> {
    private ArrayList<T> allList;//

    public AllExpense() {

    }

    public AllExpense(ArrayList<T> aList) {
        this.allList = aList;
    }

    /**
     *
     * @return total of all tour expenses
     */
    public double findTotal(){
        double total = 0;
        for(T x: allList)
            total = x.getCost() + total;
        return total;

    }
    public static void main( String [] args)
    {
        Tour tour1  =  new Tour("Sydney", 250);
        Tour tour2  =  new Tour("National Parks", 110.75);

        ArrayList<Tour> allTours = new ArrayList<Tour>();
        allTours.add(tour1);
        allTours.add(tour2);

        AllExpense<Tour> te = new AllExpense<Tour>(allTours);
        System.out.println( "Total of Tour Expenses : $"+te.findTotal());

        Study study1  =  new Study("COIT29222", "Programming", 2500);
        Study study2  =  new Study("COIT20247", "Database", 2300.50);

        ArrayList<Study> allStudy = new ArrayList<Study>();
        allStudy.add(study1);
        allStudy.add(study2);

        AllExpense<Study> se = new AllExpense<Study>(allStudy);
        System.out.println( "Total of Study Expenses : $"+se.findTotal());

         System.out.println( "Total of Study and tour Expenses : $"+(se.findTotal() + te.findTotal()) );


    }
}
