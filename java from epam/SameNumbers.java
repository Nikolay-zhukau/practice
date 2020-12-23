import java.util.*;

public class SameNumbers{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
        System.out.println("enter number \"a\"");
		int a = in.nextInt();
		System.out.println("enter number \"b\"");
		int b = in.nextInt();
		int[] arr = new int[10];
		while(a!=0){
			arr[a%10]++;
			a/=10;
		}
		while(b!=0){
			if(arr[b%10] !=0){
			    System.out.print(b%10 + " ");
			}
            b/=10;			
		}
	}
}