/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/

public class problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long sum = 2;			//sum of primes. 2 is the first
		int inc = 3;			//start at 3. even numbers aren't primes
		
		while(inc < 2000000){			//increment to less than 2 million
			
			boolean found = false;
			
			for(int i = 2 ; i <= inc/2 ; i++){			//check if prime by dividing
				if((inc % i == 0) && (inc != i)){		
					found = true;
					break;
				}
			}
			if(!found){			//if prime add to sum
				sum += inc;
			}
			inc += 2;			//increment by 2
		}
		System.out.print(sum);
		
	}

}
