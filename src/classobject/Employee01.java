package classobject;

import java.util.Scanner;

public class Employee01 {

	int id;
	String name, dept, contact;
	double salary;

	void setData(int i, String n, String c, String d, double s) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id,name,contact,Dept,salary:");

		id = i;
		name = n;
		contact = c;
		dept = d;
		salary = s;

	}
	void display()
	{
	
		System.out.println(id +" "+ name+" "+dept+" "+contact+" "+salary);
	}
	

}
