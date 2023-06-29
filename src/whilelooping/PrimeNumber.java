package whilelooping;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prime ,num=1,count;
		  
		  

		  while (num <= 50)
		  {
		   count = 0;
		   prime  = 2;
		   while (prime  <= num / 2) {
		    if (num % prime  == 0) 
		    {
		   count++;
		     break;
		    }
		    prime++;
		   }
		   if (count == 0 && num != 1) {
		    System.out.print(num + " ");
		   }
		   num++;
		  }
		
		
		
	/*int	num=14 ,c=2;                // 2->num -1        2-12       2-1008int mid = num/2;   //5
		boolean  flag = true;
		
		while(c<=num-1)
		{
			if(num%c==0)
			{
			//	 System.out.println("Not a prime number");
				flag = false;
				break;
			}
			c++;
		}
          if (flag==true)
        	  System.out.println("prime number");
          else
        	  System.out.println("Not prime number");
		 }  */
		
		
		
	/*	int num =11,c=2,mid=0;
		
		while(c<=mid)
		{
			if(num%c==0)
			{
				System.out.println("prime number");
				
			}
			c++;
		}
		 if(c>mid)
			 System.out.println("not prime number");*/
	}


	}

