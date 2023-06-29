package decisionstatement;

import java.util.Scanner;


public class MarkAverageExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		double a,b,c,d,avg;
		Scanner input = new Scanner(System.in);  
		
		System.out.println("Enter 5 subject mark :");
		
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		d=input.nextInt();
		
		avg = (a+b+c+d)/5;
		
		System.out.println("The student Grade is:");
		if(avg >=80){
			System.out.println("A");
		}
		else if(avg>=60 && avg<80)
		{
			System.out.println("B");
		}
		else if(avg>35 && avg<60)
		{
			System.out.println("C");
		}
		else if(avg>0 && avg<35)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("Valid data");
		}
		input.close();

		
	

	}

}
