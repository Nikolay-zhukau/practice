import java.util.*;

public class Task5{
//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.	
	public static void main(String[]args){
		Random randInt = new Random();
		int[] arrayInt = new int[10];
		for(int i = 0; i< arrayInt.length; i++){
			arrayInt[i] = randInt.nextInt()*30;
		}
		for(int i = 0; i< arrayInt.length; i++){
			if(arrayInt[i] > i){
				System.out.println("ar[" + i + "] = " + arrayInt[i]);
			}
		}		
	}
}