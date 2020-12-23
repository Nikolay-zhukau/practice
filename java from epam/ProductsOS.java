import java.util.*;
import java.math.BigInteger;

public class ProductsOS{
	public static void main(String[]args){
		BigInteger product = BigInteger.valueOf(1);
		for(int i = 1; i<= 200;i++){
			product = product.multiply(BigInteger.valueOf((long)i*i));			
		}
		System.out.println("products of the squares of the first two hundred numbers is " + product);
	}
}