import java.util.*;

public class Cst{
	public static void main(String[]args){
		double x = 2;
		double y = 3;
		double i = (Math.sin(x)+Math.cos(y))/ (Math.cos(x)-Math.sin(y));
		double z = Math.tan(x*y);
		System.out.println(i == z);
	}
}