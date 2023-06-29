
public class Operator_03 {
	
	public static void main(String[]args)
	{
		int a=10,b=20,c,d;
		
		
		a++; // increment a by one  postfix incremention
		  
		  ++a; // prefix increment
		   System.out.println(a);
		  
		  b--; // decrement b by one 
		  
		  System.out.println(b);
		  
		  
		  c=a++; // postfix  c=a; a++; c=10; a=11
		  
		  d=++b;  // prefix   ++b; d=b; b=21 d=b; b=21 d=b
		  
		  System.out.println(b);
		  
		
		
		
       c=a++; //postfix  c=a; a++;  c=10 a=11
		
		d=++b;  //prefix    ++b; d=b;  b=21  d=b
		
		System.out.println(c+" "+d);
		
		int e=++a;  //a++=11  e=11
		
		int f=b++; //f=20
		  
		  
		 
		 
		 
	}

}
