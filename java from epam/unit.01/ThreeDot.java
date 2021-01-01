import java.util.*;

public class ThreeDot{
	public static void main(String[]args){
		Scanner coorDot = new Scanner(System.in);
		System.out.println("add coordinate dot one");
		System.out.println("enter coordinates along the x-axis");
		int x1 = coorDot.nextInt();
		System.out.println("enter coordinates along the y-axis");
		int y1 = coorDot.nextInt();
		System.out.println("add coordinate dot two");
		System.out.println("enter coordinates along the x-axis");
        int x2 = coorDot.nextInt();
        System.out.println("enter coordinates along the y-axis");
        int y2 = coorDot.nextInt();
		System.out.println("add coordinate dot three");
		System.out.println("enter coordinates along the x-axis");
		int x3 = coorDot.nextInt();
		System.out.println("enter coordinates along the y-axis");
		int y3 = coorDot.nextInt();
        if(x1*y2+x3*y1+x2*y3-x3*y2-x2*y1-x1*y3 == 0){
			System.out.println("dot are located on one straight line");
		} else {
			System.out.println("dot are not located on one straight line");
		}  				
	}
}