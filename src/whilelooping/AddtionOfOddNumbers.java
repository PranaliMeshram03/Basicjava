package whilelooping;

public class AddtionOfOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0,count=0,sum=0;
		while(count<10){
			if(i%2==0){
				sum=sum+i;
				count++;
				System.out.println(" The Sum of Odd Numbers upto " + count+ "  =  " + sum);
		}
			i++;

	}
		System.out.println("Enter numer sum is:"+sum);
	}
}
