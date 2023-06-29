package classobject;

import java.util.Scanner;

public class AreaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		AreaParameter A1 = new  AreaParameter();
		A1.areaOfCircle();
		
		System.out.println("--------------");
		
		AreaParameter A2 = new  AreaParameter();
		A2.areaOfSquare();
		
		 System.out.println("1. Area of circle");
		 System.out.println("2.Area of Square ");
		 System.out.println("3. Area of right Angled Triangle ");
		 System.out.println("3. Area Of Rectangle ");
		 System.out.println("Enter your choice");
		 
		 AreaParameter obj = new  AreaParameter();
		
		 int ch = sc.nextInt();
		switch(ch)
		 {
		
		 case 1:
			 obj.areaOfCircle(); 
			 break;
		 case 2:
			 obj.areaOfSquare(); 
			 break;
		 case 3:
			 obj.areaOfrightAngledTriangle(); 
			 break;
		 case 4:
			 obj.areaOfRectangle(); 
			 break;
		 default:
			 System.out.println("Enter valid option...!!!");
		 } 
	}

}
