package whilelooping;

public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 20;
         
	        //print all odd numbers <=n 
	        int i=1;
	        while (i<=n) {
	            if(i%2==1) {
	                System.out.print(i+"  ");
	            }
	            i++;
	        } 
		
/*		int n =40;
		int i =1;
		while (i<=n){
			if(i%2==1) {
				System.out.println("odd number is : " +i);
			}
			i++;
		} */
	/*	int n= 521,i=299;
		while(i<=n){
			if(i%2==1){
				System.out.println("odd number is:"+i);
			}
			
			i++;
		}*/
	}

}
