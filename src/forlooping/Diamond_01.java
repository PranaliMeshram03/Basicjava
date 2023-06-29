package forlooping;

public class Diamond_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=4;
		for(int i=1;i<=r;i++)
		{
		 for(int k=1; k<=r-i;k++)
		 {
			 System.out.print(" ");
		 }
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=r-1;i>=1;i--)
			
			
		{
	      for(int k=1;k<=r-i;k++)
	      {
	    	  System.out.print(" ");
	      }
	      for(int j=1;j<=i;j++)
	      {
	    	  System.out.print("* ");
	      }
	      System.out.println();
	      {
	    	
	      }
		}
	}
		
	}
	

