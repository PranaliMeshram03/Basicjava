package forlooping;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a num");
		
		int a =sc.nextInt();
		for(int c=1;c<=10; c++)  
		{
			System.out.println(c+" *" +a+ "="+c*a);
		}  

	}

}
