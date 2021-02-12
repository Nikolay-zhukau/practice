import java.util.*;

public class Task9{
/**	В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них.*/
	private static Random random = new Random();
	private static int[] arrayA(int length){
		int [] array = new int[length];
		for(int i = 0; i < length; i++){
			array[i] = (random.nextInt(10));
		}
		return array;
	}
	public static void main(String[]args){
		Scanner arraySize = new Scanner(System.in);
		System.out.println("enter number \"N\"");
		int n = arraySize.nextInt();
		int count = 0;
		int theMostPopularNumber = 0;
		int number = 0;
		int[] arrays = arrayA(n);
		for(int i = 0; i < arrays.length; i++){
			int value = arrays[i];
			int counts = 1;			
			for(int a = 0; a < arrays.length; a++){
				if(arrays[a] == value){
					counts++;
				}
			}	
				if(counts > count){
					theMostPopularNumber = value;
					count = counts;
					number = theMostPopularNumber;
				}else{
					number = (counts == count)?(number > value)? value: number: number;
				}			
		}
		System.out.println(Arrays.toString(arrays));
		System.out.println("The most popular number is " + number);
	}
}