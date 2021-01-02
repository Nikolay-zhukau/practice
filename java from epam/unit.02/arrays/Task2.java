import java.util.*;

public class Task2{
	public static void main(String[]args){
//	Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//  числом. Подсчитать количество замен.

		double []array = new double[10];				
		for (int i=0; i < array.length; i++){
			array[i]= (Math.random()*10);
		}
		System.out.println(Arrays.toString(array));
		int countReplacements = 0;
		double z = Math.random()*4;
		System.out.println("Number Z :" + z);
        for (int i = 0; i < array.length; i++){		
			if(array[i] > z){
				array[i] = z;
				countReplacements++;
			}			
		}
		System.out.println(Arrays.toString(array));
		System.out.println("the number of replacements is : " + countReplacements);
	}
}