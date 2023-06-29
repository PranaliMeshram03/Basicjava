package classobject;

public class FindPrimeNumber {

	public void checkPrime(int n)
	{
		// boolen is prime = true;
		int count =0;
		
		for(int i=2; i<n;i++)
		{
			if(n%i==0)
			{
				// is prime = false;
			count=1;
			break;
			}
		}
		if (count ==0)  //if(is prime = true)
		{
			System.out.println("prime");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
