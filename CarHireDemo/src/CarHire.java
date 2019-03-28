// Programmer: Paul Spray S1208419
// File: CarHire.java
// Date: September 28 2018
// Purpose: COIT11222 assignment two T2-18
// Step One of Assignment

public class CarHire
{

//add three private instance variables, declared within the class, not any methods


	private String customerName;
	private String licenseNumber;
	private int daysHired;


// default constructor with no parameters >>> used to call to parametised constructor to return instances of the variables
	public CarHire()
	{
		customerName ="";
		licenseNumber ="";
		daysHired =0;
	}

//constructor creation - use UpperCaseCamel

	public CarHire (String name, String license, int days)
	{
		//within the constructor - intialise the three instance variables, using different but related names
		customerName = name;
		licenseNumber = license;
		daysHired = days;
		// this is a parametised constructor
	}


	// this is where the 3 set methods go, followed by where the 3 get methods go

   //Mutator method

   		public void setCustomerName(String name)
   	    {
   			customerName = name;
		}

		public String getCustomerName()
		{
			return customerName;
		}

		public void setLicenseNumber(String license)
		{
			licenseNumber = license;
		}

		public String getLicenseNumber()
		{
			return licenseNumber;
		}

		public void setDaysHired(int days)
		{
			daysHired = days;
		}

		public int getDaysHired()
		{
		return daysHired;
		}

    //computational CONSTANTS and method
	public double calculateHireRental()
			{
				double rental =0.00;

				final double HIGH_RATE = 34.50;
				final double MID_RATE = 30.50;
				final double BEST_RATE = 22.50;

				if (daysHired < 4)
					rental = daysHired * HIGH_RATE;
						else if (daysHired >= 4 && daysHired <=7)
							rental = 3 * HIGH_RATE + (daysHired - 3)*MID_RATE;
								else
									rental = 3 * HIGH_RATE + (8 - 4) * MID_RATE + (daysHired - 7) * BEST_RATE;

				return rental;
			}

}
