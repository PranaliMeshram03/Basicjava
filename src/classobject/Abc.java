package classobject;

import java.util.Scanner;

public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int digit = sc.nextInt();
		int product = 1;
		int sum = 0;

		while (n > 0) {
			digit = n % 10;
			sum = sum + digit;
			product = product * digit;
			n = n / 10;

		}
		if(product==sum )
		{
			System.out.println("spy number");
		}
		else
		{
			System.out.println("Not spy number");
		}
	}
}
