
public class Circle {

	private double radius;
	public Circle(double radius)
	{
		this.radius=radius;
	}
	String getShapeName()
	{
		return "Circle";
	}
	double computeArea()
	{
		return (22/7)*radius*radius;
	}
	void printDetails()
	{
		System.out.println("the radius of the circle is "+this.radius+" area of the circle is "+computeArea());
	}
	boolean checkRadius()
	{
		if(radius<0.5)
			return false;
		return true;
	}
}
