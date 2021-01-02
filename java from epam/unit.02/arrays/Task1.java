import java.util.*;

public class Task1{
	public static void main(String[]args){
//  В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.	

		int kNumber = (int)(Math.random()*10);
		System.out.println("K : " + kNumber);
		int sumOfNumbersMultiplesK = 0;
		int[] arrayN = new int[10];
		for (int i=0;i< arrayN.length;i++){
			arrayN[i]=((int)(Math.random()*100));
			System.out.println(Arrays.toString(arrayN));
			if(arrayN[i]% kNumber ==0){
				sumOfNumbersMultiplesK += arrayN[i];
			}
		}
		System.out.println("sum of number multiplers by : " + kNumber + " is " + sumOfNumbersMultiplesK);
	}
}