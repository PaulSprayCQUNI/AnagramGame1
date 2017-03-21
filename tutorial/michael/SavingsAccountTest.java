public class SavingsAccountTest
{
	public static void main(String [] args)
	{
		double firstBalance;
		double secondBalance;
		double annualInterest;
		double firstMonthlyInterest = 0;
		double secondMonthlyInterest = 0;

		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();

		saver1.setSavingBalance(2000.00);
		saver2.setSavingBalance(3000.00);

		firstBalance = saver1.getSavingBalance();
		secondBalance = saver2.getSavingBalance();

		saver1.setAnnualInterestRate(0.04);
		annualInterest = saver1.getAnnualInterestRate();

		//System.out.printf("The final balance for saver1 is $%.2f\n", firstBalance);



		for(int i = 0; i < 12; i++)
		{
			firstMonthlyInterest = saver1.calcMonthlyInterest(firstBalance, annualInterest);
			secondMonthlyInterest = saver2.calcMonthlyInterest(secondBalance, annualInterest);
			//System.out.printf("The final balance for saver1 is $%.2f\n", firstBalance);
		}

		System.out.printf("The final balance for saver1 is $%.2f\n", saver1.getSavingBalance());
		System.out.printf("The final balance for saver2 is $%.2f\n", saver2.getSavingBalance());

	}


}

class SavingsAccount
{
	private double savingBalance;
	private static double annualInterest;

	public void setSavingBalance(double savingBalance)
	{
		this.savingBalance = savingBalance;
	}

	public double getSavingBalance()
	{
		return savingBalance;
	}

	public void setAnnualInterestRate(double annualInterest)
	{
		this.annualInterest = annualInterest;
	}

	public static double getAnnualInterestRate()
	{
		return annualInterest;
	}

	public double calcMonthlyInterest(double savingBalance, double annualInterest)
	{
		double monthlyInterest = this.savingBalance * annualInterest / 12;
		this.savingBalance = monthlyInterest + this.savingBalance;
		return savingBalance;
	}

	public static void modifyInterestRate(double modifyInterest)
	{
		if(annualInterest < 0.0 || annualInterest > 1.0)
		{
			System.exit(0);
		}
		else
		{
			annualInterest = modifyInterest;
		}

	}

}
