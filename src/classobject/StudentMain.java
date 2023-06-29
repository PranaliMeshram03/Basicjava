package classobject;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		System.out.println("enter the id, name,email,dept,mark");
		int i = sc.nextInt();
		String n = sc.next();
		String e = sc.next();
		String d = sc.next();
		double m = sc.nextDouble();
		s1.setData(i, n, e, d, m);

		Student s2 = new Student();

		System.out.println("enter the id, name,email,dept,mark");
		i = sc.nextInt();
		n = sc.next();
		e = sc.next();
		d = sc.next();
		m = sc.nextDouble();
		s2.setData(i, n, e, d, m);

		Student s3 = new Student();

		System.out.println("enter the id, name,email,dept,mark");
		i = sc.nextInt();
		n = sc.next();
		e = sc.next();
		d = sc.next();
		m = sc.nextDouble();
		s3.setData(i, n, e, d, m);

		s1.dispaly();
		s2.dispaly();
		s3.dispaly();
	}

}
