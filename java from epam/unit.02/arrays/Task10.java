import java.util.*;

public class Task10{
/**	Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
    элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.*/
	private static Random random = new Random();
	private static int[] arrayA(int length){
		int [] array = new int[length];
		for(int i = 0; i < length;i++){
			array[i] = random.nextInt(100);
		}
		return array;
	}
	private static int[] halfArrayA(int[] arrayA, int r){
        int[] n	= {0};	
	    return Arrays.stream(arrayA).filter(i -> n[0]++ % r == 0).toArray();
	}
	public static void main(String[]args){
		int[] arrays = arrayA(10);
		int[] newArray = halfArrayA(arrays, 2);
		System.out.println(Arrays.toString(arrays));
		System.out.println(Arrays.toString(newArray));
	}
}