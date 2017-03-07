public class RectangleTest
{
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle(4.0,5.0);
		System.out.println(Double.toString(r.calcArea()));
	}
	
}

class Rectangle
{
	private double length;
	private double width;

	// Constructor
	public Rectangle()
	{
		this.setLength(1.0);
		this.setWidth(1.0);
	}

	public Rectangle(double length, double width)
	{
		this.setLength(length);
		this.setWidth(width);
	}

	// Getters and setters
	public double getLength()
	{
		return this.length;
	}
	
	public void setLength(double length)
	{
		if (length < 0.0 || length > 20.0)
		{
			System.out.println("length is wrong");
			System.exit(0);
		} 
		this.length = length;		
	}

	public double getWidth()
	{
		return this.width;
	}
	
	public void setWidth(double width)
	{
		if (width < 0.0 || width > 20.0)
		{
			System.out.println("width is wrong");
			System.exit(0);
		} 
		this.width = width;		
	}

	public double calcPerimeter()
	{
		double perimeter = 2 * (this.length + this.width);
		return perimeter;
	}

	public double calcArea()
	{
		double area = this.length * this.width;
		return area;
	}

	
}
