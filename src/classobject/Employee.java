package classobject;

import java.util.Scanner;

public class Employee {
	
	// compile will intialize global variable with default value
	
	int id;
	String name,dept,contact;
	double salary;
	
	void display()
	{
	/*	int a;
		System.out.println(a);*/
		System.out.println(id +" "+ name+" "+dept+" "+contact+" "+salary);
	}
  
/*	void SetData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the id,name,contact,Dept,salary:");
		int i=sc.nextInt();
		String n=sc.next();
		String c=sc.next();
		String d=sc.next();
		double s=sc.nextDouble();
		
		id=i;
		name=n;
		contact=c;
		dept=d;
		salary=s;
		
	}*/

}
