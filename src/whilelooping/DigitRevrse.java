package whilelooping;

public class DigitRevrse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =543,mul=1;
		while(num>0)
		{                                               //     num=543       num=53            num=53
			int r = num%10;                           //     t                 t
			mul =mul*10+r;                               //      mul= 10*3=30    mul= 10*30=300
			num=num/10;                               //     num=543/10=4     num=54/10=5
			 System.out.println("Multiplication is: "+mul);
		}

	}

}
