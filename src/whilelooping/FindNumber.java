package whilelooping;

import java.util.Scanner;

public class FindNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int magicalNumber=45;
		Scanner sc=new Scanner (System.in);
		
		while (true)
		{
			System.out.println("pls Enter the number");
			int num =sc.nextInt();
			if(num>magicalNumber)
			{
				System.out.println("Number is greater the magical pls try aganin.....");
				continue;
			}
			else if(num < magicalNumber)
			{
				System.out.println("Number is less pls try again.....");
				continue;
			}
			else
			{
				System.out.println("you find out correct number......");
				break;
			}
		}

	}

}
