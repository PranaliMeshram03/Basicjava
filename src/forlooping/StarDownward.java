package forlooping;

public class StarDownward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row =5;
		for(int i=row-1;i>0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
