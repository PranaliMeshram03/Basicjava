package classobject;

import java.util.Scanner;


public class SpyNumber {
	int product =1,sum=0,digit;
	
	public void SpyNumber(int n)
	{
		while(n>0)
		{
			digit =n%10;
			sum=sum+digit;
			product =product*digit;
			n=n/10;
	
		}
		if(sum==product)
			System.out.println("is a spy number");
		
		else
			System.out.println("is not spy number");
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		
		 SpyNumber S = new  SpyNumber();
		 S.SpyNumber(n);

	}

}
