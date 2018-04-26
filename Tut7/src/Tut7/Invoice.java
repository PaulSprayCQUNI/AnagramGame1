/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tut7;

/**
 *
 * @author John Barber (john.barber@cqumail.com)
 */
public class Invoice implements Payable
{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    Invoice(String partNumber, String partDescription, int quantity, double pricePerItem)
    {
        setPartNumber(partNumber);
        setPartDescription(partDescription);
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
        
    }
    
    public String getPartNumber()
    {
        return partNumber;
    }

    public void setPartNumber(String partNumber)
    {
        this.partNumber = partNumber;
    }

    public String getPartDescription()
    {
        return partDescription;
    }

    public void setPartDescription(String partDescription)
    {
        this.partDescription = partDescription;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int count)
    {
        
        this.quantity = ( count < 0 ) ? 0 : quantity;
    }

    public double getPricePerItem()
    {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePItem)
    {
        this.pricePerItem = ( pricePItem < 0 ) ? 0 : pricePerItem;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s: \n%s: %s (%s) \n%s; %d \n%s: $%.2f",
                            "invoice", "part number", getPartNumber(), getPartDescription(),
                            "quantity", getQuantity(), "price per item", getPricePerItem());
    }
    
    @Override
    public double getPayableAmount()
    {
        return getQuantity() * getPricePerItem();
    }
}
