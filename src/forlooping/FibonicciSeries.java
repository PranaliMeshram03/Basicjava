package forlooping;

public class FibonicciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0 1 1 2 3 5 8 13 21
		// m n o
		//   m n o 
		//     m  n o
				int m=0,n=1;
			//	System.out.println(m+" "+n+" ");
				for(int i=2;i<9;i++);
				
				{
					int o=m+n;
					System.out.print(o+" ");
					m=n;
					n=o;
					
				}
				
				/*for(int i=1;i<=9;i++){
					int o=m+n;
					System.out.print(m+" ");
					m=n;
					n=o;
					
				}*/

	}

}
