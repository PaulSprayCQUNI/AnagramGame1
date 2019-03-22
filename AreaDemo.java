//Tester class for overloaded static methods
//Tutorial - week 1 - Q4

public class AreaDemo
{
	public static void main(String[] args)
	{
		// Get the area of a circle with a radius of 20.0.
		System.out.printf("The area of a circle with a radius of 20.0 is %.2f \n", Area.getArea(20.0));

		// Get the area of a rectangle with a length of 10
		// and a width of 20.
		System.out.printf("The area of a rectangle with length of 10 and a width of 20 is %.2f \n",Area.getArea(10, 20));

	}
}
