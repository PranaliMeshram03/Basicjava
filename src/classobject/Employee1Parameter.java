package classobject;

import java.util.Scanner;

public class Employee1Parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee01 e1 = new Employee01();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id,name,contact,Dept,salary:");
		int i = sc.nextInt();
		String n = sc.next();
		String c = sc.next();
		String d = sc.next();
		double s = sc.nextDouble();

		e1.setData(i, n, c, d, s);

		Employee01 e2 = new Employee01();

		System.out.println("enter the id,name,contact,Dept,salary:");
		i = sc.nextInt();
		n = sc.next();
		c = sc.next();
		d = sc.next();
		s = sc.nextDouble();
		e2.setData(i, n, c, d, s);

		Employee01 e3 = new Employee01();

		System.out.println("enter the id,name,contact,Dept,salary:");
		i = sc.nextInt();
		n = sc.next();
		c = sc.next();
		d = sc.next();
		s = sc.nextDouble();
		e3.setData(i, n, c, d, s);

		e1.display();
		e2.display();
		e3.display();

	}

}
