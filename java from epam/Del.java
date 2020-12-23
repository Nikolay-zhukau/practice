import java.util.*;

public class Del{
	public static void main(String[]args){
		Scanner scr = new Scanner(System.in);
		int number = scr.nextInt();
		for(int i = 2, limit=(int)Math.ceil(Math.sqrt(number)); i<= limit;){
			if(number % i==0){
				number = number / i;
				limit = (int)Math.ceil(Math.sqrt(number));
				System.out.println(i + " ");
			}else {
				i++;
			}
		}
		if(number > 1){
			System.out.println(number);
		}
	}	
}