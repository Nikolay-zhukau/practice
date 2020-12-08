import java.util.Scanner;

public class StartOne {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of second: ");
		int seconds = input.nextInt();
		int minutes = seconds / 60;
		int remainingMinutes = minutes % 60;
		int hours = minutes / 60;
		int remainingSeconds = seconds % 60;
		System.out.println(hours + " hours " + remainingMinutes + " minutes " + remainingSeconds + "second");
		
	} 
}