package problem20;

import java.math.BigInteger;

public class problem20 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 100;
		BigInteger product = BigInteger.valueOf(start);
		for(long i = start-1; i > 0 ; i--){
			product = product.multiply(BigInteger.valueOf(i));
		}
		System.out.println(product);
		
		BigInteger sum = BigInteger.valueOf(0);
		while(!product.equals(BigInteger.valueOf(0))){
			sum = sum.add(product.remainder(BigInteger.valueOf(10)));
			product = product.divide(BigInteger.valueOf(10));
		}
		System.out.println(sum);
	}

}
