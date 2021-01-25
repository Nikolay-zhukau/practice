import java.util.*;
import java.util.Random;

public class Task6{
	public static void main(String[]args){
//    Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//    являются простыми числами.

		Random random = new Random();
		double[] arrayD = new double[20];		
        for(int i = 0; i<arrayD.length;i++){
			arrayD[i] = (random.nextDouble()*200)-100;
		}		
		int serialNumber = 0;
		double sumOfPrimeSerialNumbers = 0;
		for(int i = 0; i<arrayD.length;i++){
		    serialNumber = i;		
		
		for(int a = 2;a <=serialNumber/2 ;a++){
			    boolean prime = true;				
				if((serialNumber % a) == 0){
					prime = false;
					break;
				}
                if(prime){
					sumOfPrimeSerialNumbers += arrayD[i];
					System.out.println(serialNumber);
				} 								
			}
		}
		System.out.println("the sum of serial numbers is : " + sumOfPrimeSerialNumbers);
        System.out.println(Arrays.toString(arrayD));		
	}
}