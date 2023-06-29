package classobject;

import java.util.Scanner;

public class MainStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//obj.methodname();
		
		Pattern p1=new Pattern();
		p1.upwardStartLeftPattern();
		
		System.out.println("--------------");
		
		Pattern p2= new Pattern();
		p2.dowwarLeftStarPatter();
		 System.out.println("1. Star Pyarmid Pattern");
		 System.out.println("2. Upward Left Star Pattern");
		 System.out.println("3. Downdard Left Star Pattern ");
		 System.out.println("Enter your choice");
		 int ch= sc.nextInt();
		 
		 Pattern obj =new Pattern();
		 
		 switch(ch)
		 {
		 case 1:
			 obj.starPyamidPattern();
			 break;
		 case 2:
			 obj.upwardStartLeftPattern();
			 break;
		 case 3:
			 obj.dowwarLeftStarPatter();
			 break;
			 default:
				 System.out.println("Enter valid option...!!!");
		 }

	}

}
