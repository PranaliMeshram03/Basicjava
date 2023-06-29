 
public class TypeCastExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 10; // implicit typecast
		
		System.out.println(f);
		
		int a;
		
		a =(int)4.9; //explicit type cast
		
		System.out.println(a);
		
		
		char ch=' '; //ascii  a=97 b=98 c=100..... A =65 B=66 C=67.... 0-48 1-49 2-50 -1
		
		int b =ch;//ascii value stored in b char->int
		
		System.out.println("Ascii value: " +b);
		
		// int -> char
		
		int x =100;
		char c=(char)x;
		System.out.println("Character is: " +c);
		
		
		

	}

}
