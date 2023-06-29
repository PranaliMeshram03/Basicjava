package decisionstatement;

import java.util.Scanner;

public class NumberConvertWordSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Write a Java program to enter number between 1to 5 and print it in word
		
		Scanner input  =new Scanner(System.in);
		System.out.println("enter a number");
		int num = 0, word;
		 word = input.nextInt();
		 switch(word){
		 case 1:
			 System.out.println("one");
			 break;
		 case 2:
			 System.out.println("two");
			 break;
		 case 3:
			 System.out.println("three");
			 break;
		 case 4:
			 System.out.println("four");
			 break;
		 case 5:
			 System.out.println("five");
			 break;
		
			 
		 }

	}

}
