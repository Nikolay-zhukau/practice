import java.util.*;

public class SumTwo{
	public static void main(String[]args){
		double sum =0;
		for(double i = 0; i <=100;i++){
			sum = sum + (Math.pow(i, 2));
		}
    	System.out.println("the sum of the squares of the first hundred numbers is " + sum);	
	}
}
