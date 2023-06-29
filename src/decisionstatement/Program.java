package decisionstatement;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 3  7 15  
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		
		int temp =0 ;
	int	n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			temp = (temp*2)+1;
			System.out.println(" "+temp);
			
		}
		

	}

}
