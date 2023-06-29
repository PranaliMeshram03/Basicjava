package decisionstatement;

import java.util.Scanner;

public class UserinputExample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float radius, area;
		System.out.println("Enter a number:");
		Scanner sc =new Scanner(System.in);
		radius=sc.nextFloat();//3.5
		//float nrxtFloat
		//int - nextInt()
		//one word - next()
		//line - nextline()
		
		area = 3.14f * radius *radius;
		System.out.println("Arae of circle is: " +area);

	}

}
