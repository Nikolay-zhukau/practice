import java.util.*;

public class Maxv{
	public static void main(String[]args){
		Scanner scr = new Scanner(System.in);
		    System.out.println("enter a");
		int a = scr.nextInt();
		    System.out.println("enter b");
		int b = scr.nextInt();
		if(a > b){
		    System.out.printf("Between %d and %d, maximum is %d %n" , a, b, a);
		}else {
			System.out.printf("Between %d and %d, maximum number is %d %n" , a, b, b);
		}
		int max = Math.max(a, b);
		    System.out.printf("Maximum value of %d and %d using Math.max() is %d %n", a, b, max);
	    int c = scr.nextInt();
	    int x = scr.nextInt();
		if(c < x){
			System.out.printf("Between %d and %d, Minimum Number is %d %n", c, x, c );			
		}else {
			System.out.printf("Between %d and %d, Minimum is %d %n", c, x, x);
		}
		int min = Math.min(c, x);
		System.out.printf("Maximum value if %d and %d using Math.min() is %d %n", c, x, min);
	}
}