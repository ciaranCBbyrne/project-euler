package problem23;

import java.math.BigInteger;
import java.util.ArrayList;

public class problem23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit = 28123;
		ArrayList<Integer> abundant = new ArrayList<>();
		abundant = findAbundant(limit);
		
		sum2Abundant(abundant, limit);
	}
	
	private static void sum2Abundant(ArrayList<Integer> abundant, int limit) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		BigInteger totalSum = BigInteger.valueOf(0);
		long i = limit;
		//add all numbers together below limit
		while(i > 0){
			BigInteger sw = BigInteger.valueOf(i);
			totalSum = totalSum.add(sw);
			i--;
		}
		System.out.println("SubTotal: " + totalSum);
		BigInteger add = BigInteger.valueOf(0);
		//subtract numbers that can be written as the sum of 2 abundant nums
		for(int x = 0 ; x < abundant.size() ; x++){
			for(int y = x ; y < abundant.size() ; y++){
				int sum = abundant.get(x) + abundant.get(y);
				if(sum <= limit){
					if(!list.contains(sum)){
						list.add(sum);
					}
				}
			}
		}
		for(int j = 0 ; j < list.size() ; j ++){
			BigInteger minus = BigInteger.valueOf(list.get(j));
			add = add.subtract(minus);
		}
		System.out.println("Minus: " + add);
		System.out.println("Final: " + (totalSum.subtract(add)));
	}

	//check for abundant and add abundant nums to list and return
	private static ArrayList findAbundant(int number){
		ArrayList<Integer> abund = new ArrayList<>();
		
		for(int i = number ; i > 0 ; i--){
			int compare = sumDivisors(i);
			if(compare > i){
				abund.add(i);
			}
		}
		return abund;
	}
	
	//find divisors of number and return sum
	private static Integer sumDivisors(int number){
		int sum = 0;
		for(int i = 1 ; i <= number/2 ; i++){
			if(number % i == 0){
				sum += i;
			}
		}
		return sum;
	}
}
