package classobject;

import java.util.Scanner;

public class OddDigit {

	///int n = 20;

	public void OddNumber(int i,int n) {
		while (i <= n) {
			if (i % 2 == 1) {
				System.out.print(i + "  ");
			}
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter a strat position");
		 int i=sc.nextInt();
		 System.out.println("Enter End position");
		 int n =sc.nextInt();
		OddDigit p1 = new OddDigit();
		p1.OddNumber(1,n);

	}

}
