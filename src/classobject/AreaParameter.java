package classobject;

import java.util.Scanner;

public class AreaParameter {
	
	Scanner sc = new Scanner(System.in);
	
	
	void areaOfCircle()
	{
double radius, area;
System.out.println("Enter a radius");
     radius =sc.nextDouble();
		
		area = 3.14 *radius * radius;
		
		
	}
	void areaOfSquare()
	{
		
		System.out.print("Enter side: ");
		double s = sc.nextDouble();
		double sa = s * s;
		System.out.println("Area of square = " + sa);
		
		}
	
	void areaOfrightAngledTriangle()
	{
	
			System.out.print("Enter base : ");
			double b = sc.nextDouble();
			System.out.print("Enter heigth: ");
			double h = sc.nextDouble();
			double ra = 0.2 * b * h;
			System.out.println("Area of rigth angle triangle = " + ra);
			
		}
	
	void areaOfRectangle()
	{

		
			System.out.print("Enter lenth: ");
			double l = sc.nextDouble();
			System.out.print("Enter width: ");
			double w = sc.nextDouble();
			double ma = l * w;
			System.out.println("Area of circle = " + ma);
		
	}

	

}
