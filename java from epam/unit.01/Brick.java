import java.util.*;

public class Brick{
	public static void main(String[]args){
		Scanner sizes = new Scanner(System.in);
		System.out.println("enter the dimensions of the sizes of the hole");
		System.out.println("enter the first hole size");
		int sizeA = sizes.nextInt();
		System.out.println("enter the second hole size");
		int sizeB = sizes.nextInt();
		System.out.println("enter the dimensions of the sizes of the brick");
		System.out.println("enter height dimension");
		int heightX = sizes.nextInt();
		System.out.println("enter width dimension");
		int widthY = sizes.nextInt();
		System.out.println("enter length size");
		int lengthZ = sizes.nextInt();
		if(((sizeA >= heightX)&& (sizeB >= widthY))|| ((sizeA >= widthY)&&(sizeB >= heightX))||((sizeA >= lengthZ)&&(sizeB >= heightX))|| ((sizeA >= heightX)&& (sizeB >= lengthZ))|| ((sizeA >= widthY)&&(sizeB >= lengthZ))|| ((sizeA >= lengthZ)&&(sizeB >= widthY))){
			System.out.println("will pass");
		}else {
			System.out.println("will not pass");
		}
		
	}
}