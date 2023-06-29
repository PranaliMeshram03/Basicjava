package whilelooping;

public class DigitAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =543,sum=0;
		while(num>0)        //   num =543        num=54        num=5        num=0
		{                   //    T               t             t             f
			int r = num%10; //    sum=0+3=3      sum=3+4=7    sum=7+5=12
			sum =sum+r;     //   num=543/10=54   num=54/10=5   num=5/10=0
			num=num/10;
		}
            System.out.println("Addition is: "+sum);
	}

}
