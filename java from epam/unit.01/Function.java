import java.util.*;

public class Function{
	public static void main(String[]args){
		Scanner variableX = new Scanner(System.in);
		System.out.println("enter value variable x");
		int fx = variableX.nextInt();
		if (fx<=3){
		    double y = (fx)*(fx)- 3*(fx) + 9;
			System.out.println("F(x)= " + y);
		} else {
			double y = 1 / (((fx)*(fx)*(fx))+6);
			System.out.println("F(x)= " + y);
		} 
	}
}