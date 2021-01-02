import java.util.*;

public class Task3{
	public static void main(String[]args){
//  Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//  положительных и нулевых элементов.	

		double N = 10;
		double [] array = new double [10];
		int countNegativeNum = 0;
		int countPositiveNum = 0;
		int countNumZero = 0;
        for (int i = 0; i< array.length;i++){
			array [i] = (Math.random()*31)- 15;
			if(array[i]< 0){
				countNegativeNum++;
			}
			if(array[i]>0){
				countPositiveNum++;				
			}
			if(array[i]==0){
				countNumZero++;
			}
		}
        System.out.println(Arrays.toString(array));
        System.out.println("Negarive number = " +countNegativeNum+ " Positive number = " +countPositiveNum+ " Zero number = "+ countNumZero);		
	}
}