package decisionstatement;

import java.util.Scanner;

public class StateAndCApital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the state name: ");
		String state = sc.nextLine();  // single word   // uttar pradesh
		
		state = state.toLowerCase();  //uttar pradesh
		// state.toUpperCase()
		
		switch(state)
		{
		case "maharashra":
			System.out.println("Mubai");
			break;
		case "karnataka":
			System.out.println("Bangalore");
			break;
		case "Gujurat":
			System.out.println("Gandihinagae");
			break;
		case "uttar pradesh":
			System.out.println("Lucknow");
			break;
		case "goa":
			System.out.println("Panaji");
			break;
		
		
		}
		

	}

}
