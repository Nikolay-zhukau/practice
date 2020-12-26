import java.util.*;

public class ModulusE{
	public static void main(String[]args){
		System.out.println("enter number \"e\" > 0");
		Scanner scr = new Scanner(System.in).useLocale(Locale.US);		
		double e = scr.nextDouble();	
		double sum =0;
		double n = 0;
        
		while (sum <= e){
        if(e >= 1.5){
			n--;
		}else{
			n++;
		}  					
			double commonTerm = (1/Math.pow(2, n))+(1/Math.pow(3, n));			
			sum = sum + commonTerm;
			System.out.println("Sum common tern is " + sum + " n : " + n);
		}
	}
}