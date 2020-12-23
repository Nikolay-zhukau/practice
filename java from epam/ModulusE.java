import java.util.*;

public class ModulusE{
	public static void main(String[]args){
		Scanner scr = new Scanner(System.in);
		System.out.println("enter number \"e\"");
		double e = scr.nextDouble();	
		double Sum =0;
		double an = 0;		
		for (int n = 1;n <= e; n++){
			double commonTerm = (1/Math.pow(2, n))+(1/Math.pow(3, n));
			an = an + commonTerm;
			Sum = an;
			System.out.println("Sum common tern is " + Sum);
		}
	}
}