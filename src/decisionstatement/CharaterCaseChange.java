package decisionstatement;

import java.util.Scanner;

public class CharaterCaseChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character:");
		ch = sc.next().charAt(0);
		
		if(ch>='a' && ch<'z')  // a=97 b=98 A= 65 B= 66
		{
			int i = ch -32;  // implicit
			System.out.println((char)i);
		
		}
		else if(ch>='A' && ch<='z') //A=65 a=97
		{
			int i = ch+32;
			System.out.println((char)i);
		}
		else 
			System.out.println("Enter valid Alphavet");
	}

}
