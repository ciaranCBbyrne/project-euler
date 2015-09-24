package problem21;

/*Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a != b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. 
The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.
*/
public class problem21 {
	
	static Integer divide(int divisor){
		//find divisors of number		
		int sumDivisors = 0;
		for(int i = 1 ; i <= divisor/2 ; i++){
			//if divisor found add
			if(divisor % i == 0){
				sumDivisors += i;
			}
		}
		//return sum
		return sumDivisors;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 10000;
		int sum = 0;
		
		//loop down from 9999 and pass to divide method
		for(int i = start-1 ; i > 0 ; i--){
			int natural = divide(i);
			//if d(a) = b and d(b) = a, where a != b add to final sum 
			if((divide(natural) == i) && natural != i){
				sum += i;
			}
		}		
		System.out.println(sum);
	}
}
