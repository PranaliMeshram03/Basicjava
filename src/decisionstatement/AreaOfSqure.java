package decisionstatement;

import java.util.Scanner;

public class AreaOfSqure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float area;
		System.out.println("Ernter a number");
		Scanner sc = new Scanner(System.in);
		area = sc.nextFloat();
		area = area * area;
		System.out.println("area of squre is:" + area);

	}

}
