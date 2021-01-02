import java.util.*;
import java.util.Random;

public class Task4{
//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
    
	
	public static void main(String[]args){
		Random randNum = new Random();
		double[] arrayNum = new double[10];
		for (int i = 0; i < arrayNum.length; i++){
			arrayNum[i] = (randNum.nextDouble()*31) - 15;
		}
		double min;
		min = arrayNum[0];
		int minIndex = 0;
		for(int i = 1; i < arrayNum.length; i++){			
			if(arrayNum[i] < min){
				min = arrayNum[i];
				minIndex = i;
			}
		}
		double max;
		max = arrayNum[0];
		int maxIndex = 0;
		for(int i = 1; i < arrayNum.length;i++){
			if(arrayNum[i] > max){
				max = arrayNum[i];
				maxIndex = i;
			}			
		}
		System.out.println("Min number : " + minIndex);
		System.out.println("Max number : " + maxIndex);
		System.out.println(Arrays.toString(arrayNum));
		double replace = arrayNum[minIndex];
		arrayNum[minIndex] = arrayNum[maxIndex];
		arrayNum[maxIndex] = replace;
		System.out.println(Arrays.toString(arrayNum));
	}
}