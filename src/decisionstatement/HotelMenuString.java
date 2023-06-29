package decisionstatement;

import java.util.Scanner;

public class HotelMenuString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a menu name ");
		System.out.println("Enter a quntity ");
		System.out.println("Enter a bill");
		
		
		String menu = sc.nextLine();
		switch(menu){
		case "maharashra thali":
			System.out.println("150");
			break;
		case "rajsthani thali":
			System.out.println("200");
			break;
		case "veg thali":
			System.out.println("100");
		
			break;
	
			
		
		}
		
	
		

	}

}
