import java.util.*;

public class Two {
	public static void main(String[]args){
		double r = 123.345;
		double i = (r * 1000) % 1000 + (int)r / 1000.0;
		System.out.println(i);
	}
}