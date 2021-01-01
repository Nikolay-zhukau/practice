import java.util.*;

public class Tri{
	public static void main(String[]args){
	Scanner angle = new Scanner(System.in);
		System.out.println("enter the degree of the first angle");
	int a = angle.nextInt();
		System.out.println("enter the degree of the second angle");
	int b = angle.nextInt();
        	
		if(a + b < 180){
		    System.out.println("triangle exsist");
	        if((a + b) == 90 || a == 90 || b == 90){
		        System.out.println("the triangle is right-angled");	
		    }
		}
        else{
		    System.out.println("triangle do not exsist");
		}
		
	
        

		
   			
	
//	else 
//	System.out.println("the triangle");	
	}
}