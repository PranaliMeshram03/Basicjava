package forlooping;

import java.util.Scanner;

public class FactorialNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a num");
		int num = sc.nextInt();
		int i , fact =1 ;
		for( i=1;i<=num;i++)  
		
		{
			fact =fact*i;
		}
			System.out.print("Factorial of " + num+"="  +fact);
		}  

	}


