package classobject;

import java.util.Scanner;

public class DigitPattern {
	
	Scanner sc= new Scanner(System.in);
	
	
void digitPattern1(int r)
	{
		 
			for(int i=1;i<=r;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(j%2 + " ");
				}
				System.out.println();
			}
	}
	void digitPattern(int r)
	{
		for( int i=1;i<=r;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(j%2+ " ");
			}
			System.out.println();
		}
	} 
	
	void digitPattern2()
	{
		 System.out.println("How many rows you want in this pattern?");
		 
	        int rows = sc.nextInt();
	 
	        System.out.println("Here is your pattern....!!!");
	 
	        for (int i = 0; i <= rows; i++)
	        {
	            int num = i;
	 
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(num+" ");
	 
	             //   num = num+rows-j;
	                num= j+2;
	            }
	 
	            System.out.println();
	        }
	}
	

}
