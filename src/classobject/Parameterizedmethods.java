package classobject;
import java.util.Scanner;


public class Parameterizedmethods {
	
	void add(int a, int b)
	{
		System.out.println("Adition is: " +(a+b));
	}
	
	void mutiply(int a, int b)
	{
		System.out.println("Multiplication is:" +(a*b));
	}
	void divide (int a, int b)
	{
		Scanner sc= new Scanner(System.in);
		while(b==0 || b<0)
		{ 
			System.out.println("Enter a valid non zero positive number:");
			b =sc.nextInt();
		}
		System.out.println("Division is:"+(a/b));
	}
	void subtraction(int a,int b)
	{
		System.out.println("subtraction is:" +(a-b));
	}

	}


