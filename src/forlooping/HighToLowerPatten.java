package forlooping;

public class HighToLowerPatten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1
		//121
		//12321
		//1234321
		
		int r=4;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		
	/*	for(int i=r-1;i>=1;i--)
		{
			for(int l=1;l<=r-i;l++)
			{
				System.out.print(" ");
			}
		
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}*/
	}

}
