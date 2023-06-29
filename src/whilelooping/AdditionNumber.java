package whilelooping;

public class AdditionNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s =1 ,end =5,sum = 0;
		while(s<=end)    // s=1                  s=2        s=3      s=4             s=5        s=6
		{                // t                 t                       t         t    t          f
			sum = sum +s;// sum=0+1=1     sum =1+2=3   sum =3+3=6   sum =6+4=10    sum=10+15 
			s++;
		}
		System.out.println("Addition is: "+sum);

	}

}
