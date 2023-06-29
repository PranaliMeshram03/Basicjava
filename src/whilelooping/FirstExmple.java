package whilelooping;

import java.util.Scanner;

public class FirstExmple {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 2 3 4 5 
		
		int s =1;   // initialization start
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the end point");
		int end = sc.nextInt();  //5
		// condition
		while(s<=end)                                
			
		{ //                                       s =1   s=2   s=3  s=4 s=5  s=6
			
			System.out.println(s+" ");  //          t     t     t     t   t    f 
			s++;  //iteration(incre/decre)//        1     2     3     4    5   done
			
		}
		// s++
		System.out.println("done");
	
		

	}

}
