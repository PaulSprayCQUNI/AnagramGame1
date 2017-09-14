/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *
 * @param <T extends Number>
 */

public class Tour  implements Needable {

    String name;
    double price;

    /**
     *
     * @param name
     * @param price
     */
    public Tour( String name, double price) {
        this.name = name;
        this.price = price;
    }


    public double getPrice() {
        return price;
    }

    @Override
    public String toString()  {
        return "Name =  "  +  name +  ", price =  $" +  price +   '\n';
    }

    @Override
    public double getCost() {
        return getPrice();
    }




}// end of class Tour



