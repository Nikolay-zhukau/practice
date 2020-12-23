import java.util.*;

public class Line{	
	public static void main(String[]args){
		Scanner scr = new Scanner(System.in);
		double a = scr.nextDouble();
		double b = scr.nextDouble();	
		double h = scr.nextDouble();
//		if((h < a) || (h > b)){
//			System.out.println("value \"h\" cannot accept these value");					  		    
//		}
        for(double x = a; x<=b; x+=h){
			if(x <= 2){
			    double y = -x;
				System.out.println(y);
				
			}else{
				double y = x;
				System.out.println(y);
			}
		}		
	}
}