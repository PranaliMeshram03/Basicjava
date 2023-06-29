package forlooping;

public class BasicSries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*
		
		//1 4 9 16 25 36 49 64 81 100
		
		for(int i =1;i<=10;i++)
		{
			System.out.print((i*i)+" ");
			
		}
		System.out.println("\n"); */
		
	/*	//1 3  7 13 21 31 43 
		//2 4  6 8 10 12 
		int c=1 ,x =2;
		for(int i=1;i<=7;i++)
		{
			System.out.print(c+" ");
			c=c+(i*2);
		//	c=c+x;
		//	x=x+2:
			
		}
		System.out.println("\n");  */
		
		//1 5 14 30 55  91 
		// 4 9  16 25  36
		//2 3  4  5  6
		
	/*	int s=1,b=2;
		for(int i=1;i<=6;i++);
		{
			System.out.print(s+" ");
		//	s=s+(i+1)*(i+1);
			 s=s+(b*b);
			//b=b+1;
		}  */
			 // 0 1 1 2 3 5 8 13 21
		int r=0,k=1;
		for(int i=2;i<=9;i++);
		{
			int m=r+k;
			System.out.print(m+" ");
			r=k;
			k=m;
			
		}
		

	}

}
