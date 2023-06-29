package decisionstatement;

import java.util.Scanner;

public class CharInputExample {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character" );
		
		ch = sc.next().charAt(0);
		
		int ascii = ch;
		
		System.out.println("Ascii value of character is :" +ascii);
		
		
	

	}

}
