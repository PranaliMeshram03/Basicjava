package classobject;

import java.util.Scanner;

public class PaliandromNumber {

	public void PalindromeExmple(int n) {
		int sum = 0, r;
		int temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum) {

			System.out.println("Is not a plaindrome number" + sum);

		} 
		else
		{
			System.out.println("Is a plaindrome number" + sum);
		}
			
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		int n = sc.nextInt();
		PaliandromNumber p = new PaliandromNumber();

		p.PalindromeExmple(n);

	}

}
