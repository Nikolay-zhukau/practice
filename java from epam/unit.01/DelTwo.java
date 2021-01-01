import java.util.Scanner;

public class DelTwo {
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number \"m\"");
        int numM = sc.nextInt();
	    System.out.println("Enter number \"n\"");
	    int numN = sc.nextInt();
	    for(int i = numM;i< numN; i++){     
            for(int e = 2; e<i; e++){
                if(i % e == 0) {
                    System.out.println(" "+e);
                }
			}
		}	
	}
}