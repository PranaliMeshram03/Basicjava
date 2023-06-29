package decisionstatement;

import java.util.Scanner;

public class VowelConsonantExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character:");
		ch = sc.next().charAt(0);
		
		if(ch=='a' || ch == 'A')
			System.out.println("Character is a vowel");
		else if(ch=='e' || ch=='E')
			System.out.println("Character is a vowel");
		else if(ch=='i' || ch=='I')
			System.out.println("Character is a vowel");
		else if(ch=='o' || ch=='O')
			System.out.println("Character is a vowel");
		else if(ch=='u' || ch=='U')
			System.out.println("Character is a vowel");
		else
			System.out.println("Character is a consonant");
		sc.close();
	

	}

}
