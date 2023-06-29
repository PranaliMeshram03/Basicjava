package decisionstatement;

import java.util.Scanner;

public class TernayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: " );
		
		a = sc.nextInt();
		
		/*if (a%2==0)
		System.out.println(" even  number ");
	
	else
		System.out.println("odd  number ");  */
		
		String s = a%2==0?"Even number":"odd number";
		System.out.println(s);
		
		String s1 = a%2==0?"postive number":"negevtive number";
		System.out.println(s1);
		

	}

}
