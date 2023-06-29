package decisionstatement;

import java.util.Scanner;

public class CalcuatorMenuDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		a =sc.nextInt();
		b =sc.nextInt();
		
		System.out.println("1 addition\n2. Multiplication\n3, Substraction\n4 ,Divison");
		System.out.println("Enter the opstion");
		int option = sc.nextInt();
		
		switch(option)
		{
		case 1:
			System.out.println("addition is: " + (a+b));
			break;
		case 2:
			System.out.println("Multiplication is: " + (a*b));
			break;
		case 3:
			System.out.println("Substraction is: " + (a*b));
			break;
		case 4:
			if(b==0)
			{
				System.out.println("diviosion should not be zero please enter valid number again: ");
				b =sc.nextInt();
				System.out.println("Division is :" + (a/b));
			
			}
			else
				System.out.println("Division is :" + (a/b));
			break;
			default:
				System.out.println("enter valid option");
		}

	}

}
