package decisionstatement;

import java.util.Scanner;

public class AverageMark {

	public static void main(String[] args) {
	
		
		int a,b,c,d,e,avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 number" );
		
		a = sc.nextInt();
	    b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		
		avg = (a+b+c+d+e)/5;
		System.out.println("average of mark is:"+avg);
		

	}

}
