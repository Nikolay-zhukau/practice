import java.util.*;

public class Graf{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		     System.out.println("enter coordinate x");
		int x = in.nextInt();
		     System.out.println("enter coordinate y");		
		int y = in.nextInt();		
		if(x <= 4 && x >= -4 && y <= 0 && y >= -3 || x <= 2 && x >= -2 && y <=4 && y >= 0)
		     System.out.println("dot in");
		else 
		     System.out.println("dot outside");
	}
}