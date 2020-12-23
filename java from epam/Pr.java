import java.math.BigInteger;
public class Pr{
	public static void main(String[]args){
		BigInteger one = BigInteger.valueOf(6421312);
		BigInteger two = BigInteger.valueOf(6531412);
		BigInteger a = one.multiply(two);
		System.out.println(a);
	}
}