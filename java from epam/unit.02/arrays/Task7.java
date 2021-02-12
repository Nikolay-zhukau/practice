import java.util.*;

public class Task7{
	public static void main(String[]args){
//		
		double [] array = new double[10];		
		for(int i = 0; i<array.length;i++){
			array[i]= (Math.random()*200)-100;
		}			
		double maxSum = array[0] + array[array.length-1];
		for(int i = 0, j = array.length-1; i < j; i++, j--){
		    if((array[i] + array[j]) > maxSum){
				maxSum = array[i] + array[j];
			}	
		}
		System.out.println(maxSum);
	}
}