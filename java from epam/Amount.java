import java.util.*;

public class Amount{
	public static void main(String[]args){
		Scanner scrN = new Scanner(System.in);
		System.out.println("enter value N");
		int valueN = scrN.nextInt();
		int sum = 0;
		for(int i = 1; i <= valueN; i++){
			sum = sum + i;
		}
		System.out.println("The sum of the numbers is " + sum);
	}
}