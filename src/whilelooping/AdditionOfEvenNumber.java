package whilelooping;

public class AdditionOfEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2,count=0 ,Sum=0;
		while(count<10)
		{
			if(i%2==0)
			{
			Sum=Sum+i;
			count++;
			
			System.out.println("\n The Sum of Even Numbers upto " + count+ "  =  " + Sum);
			}
			i++;
			
		} 	
		System.out.println("Enter numer sum is:"+Sum);
		
	}
}
		
