
package forlooping;

public class StarPatten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row =5;
		for(int i=1;i<=row;i++) //   i=1     i=2      i=3          i=4            i=5             i=6
		{                        //   t       t        t            t              t               f
			for(int j =1;j<=i;j++)// j=1,2   j=1,2,3  j=1,2,3,4    j=1,2,3,4,5     j=1,2,3,4,5,6
			{
				System.out.print("*");//*
			}                         //**
			System.out.println();    // ***
		}                           // ****
                                    // ***** 
		
		
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=2;j++)
			{
				System.out.println();
			}
		}
	}

}
