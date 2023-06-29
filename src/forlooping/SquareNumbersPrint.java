package forlooping;

import java.util.Scanner;

public class SquareNumbersPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a num");
		int a = sc.nextInt();
		for(int i=1; i<=a;i++)
		{
			int sq=i*i;
			System.out.println( sq+" ");
		}

	}

}
