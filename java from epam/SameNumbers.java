import java.util.*;

public class SameNumbers{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
        System.out.println("enter number \"a\"");
		int a = in.nextInt();
		System.out.println("enter number \"b\"");
		int b = in.nextInt();
		int[] arr = new int[10];
		System.out.println(Arrays.toString(arr));
		int iterNum = 0;		
		while(a!=0){
			System.out.println("iterNum = " + iterNum + ", arr element number =" + a%10);
			arr[a%10]++;
			a/=10;//a = a /10
            System.out.println("iterNum = " + iterNum + ", a =" + a);
			System.out.println(Arrays.toString(arr));
            iterNum++;            			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("compare");
		int iterNum2=0;
		while(b!=0){
			System.out.println("iterNum2 = " + iterNum2 + ", arr element number =" + b %10);
			if(arr[b%10] !=0){
			    System.out.println(b%10 + " same number");
			}
            b/=10;//b= b / 10
			System.out.println("iterNum2 = " + iterNum2 + ", b =" + b);
            iterNum2++;
			
		}		
	}
}