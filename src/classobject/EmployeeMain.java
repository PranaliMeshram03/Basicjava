package classobject;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1= new Employee();
		e1.display();
		
		
		e1.id=101;
        e1.name="Raj";
        e1.dept="Techincal";
        e1.contact="9876543213";
        e1.salary=70000;
        
        e1.display();
        
        System.out.println("-----------------------");
        
		// e1.SetData();
		
		
		// initialize global variables
		// reference varibles
		//method 
		//constructor
		
		e1.id=101;
        e1.name="Raj";
        e1.dept="Techincal";
        e1.contact="9876543213";
        e1.salary=70000;
        
       // e1.SetData();
        //e1.display();
        
     //   System.out.println("-----------------------");
        
        Employee e2= new Employee();
		e2.display();
		
	//	e2.SetData();
		e2.id=101;
        e2.name="Ajay";
        e2.dept="Techincal";
        e2.contact="9876543213";
        e2.salary=90000;
		
		e2.display();
		
		
	/*	Employee e1=new Employee();
		e1.SetData();
		System.out.println("-----------------");
		
		Employee e2=new Employee();
		e2.SetData();
		System.out.println("-----------------");
		
		e1.display();
		e2.display();*/

	}

}
