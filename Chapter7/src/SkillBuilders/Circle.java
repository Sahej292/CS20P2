package SkillBuilders;

public class Circle {
	 public static final double PI = 3.14;
	 private double radius; 
	 
public Circle() { //default constructor
	radius = 1;
}
	 public double getRadius()
	 {
		 return radius;
	 }
public void setRadius(double r)
{
radius = r;

}

public double Area()
{
	double circArea = PI * radius* radius; 
	return circArea;
}
public double circumference()
{
	double circArea = 2 * PI * radius; 
	
	return circumference(); 
}
public static void displayFormula()
{
	System.out.print("The formula for the area of a " 
						+ "circle is A = PI * r* r");
}

public boolean equals(Object obj)
{
	Circle testObj = (Circle)obj; 
	//object to be compared		//our radius
	if(testObj.getRadius()== radius)
	{
		return(true);
		
	}
	
	else {
		return (false);
	}
}



public String toString() // always includes the blue variables in your class
{
	return("The radius is " + radius);
}

}
