import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Task8{
	private static Random random = new Random(47);
	public static double[] arrayD(int length){
		double[] array = new double[length];
		for(int i = 0; i < array.length; i++){
			array[i] = (random.nextDouble()*31)-15;           			
		}
		return array;
	}
	private static double[] removeMin(double[] arrayD, double r){
		return Arrays.stream(arrayD).filter(i -> i != r).toArray();
	}
/*	private static double[] arrayD(int length){
		return ThreadLocalRandom.current().doubles().toArray();
	}**/
	public static double min(double[] arrayD){
		return Arrays.stream(arrayD).min().orElse(Double.MIN_VALUE);
	}
	public static void main(String[]args){
		double[] arrayF = arrayD(10);
		double min = min(arrayF);
		double[] newArray = removeMin(arrayF, min);
		System.out.println(Arrays.toString(arrayF));
		System.out.println(Arrays.toString(newArray));
						
	}
}