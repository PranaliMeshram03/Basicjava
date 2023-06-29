package classobject;
import java.util.Scanner;
public class Pattern {
	
	// returntpe methodname(){}
	Scanner sc= new Scanner(System.in);
	
	void upwardStartLeftPattern()
	{
		
		System.out.println("Enter a row number:");
		
		int r=sc.nextInt();
		for(int i=1;i<=r;i++)
		{
		 for(int j=1;j<=i;j++)
		 {
			 System.out.print("*");
		 }
		 System.out.println();
		}
	}
	
	void dowwarLeftStarPatter()
	{
		
		System.out.println("Enter a row number:");
		
		
		
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void starPyamidPattern()
	{
		
		System.out.println("Enter a row number:");
		
		int r=sc.nextInt();
		
		for(int i=1;i<=r;i++)
		{
			for(int k=1;k<=r-1;k++)
			{
				System.out.println(" ");
			}
		}
	}
        
	

}
