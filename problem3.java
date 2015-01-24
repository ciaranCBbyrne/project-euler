/*The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */
import java.util.ArrayList;

public class problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		ArrayList<Long> primes = new ArrayList<Long>();		//array list to store prime numbers

		//loop to put all prime numbers below 10000 in array list
		
		long fac = 2;
		while(fac < 10000){
			boolean found = false;					        //no prime found at the beginning
			for(long i=2 ; i<=fac/2 ; i++){			    //start at 2, as 1 will always divide in. Finish at half of fac as any above will not divide in
				if((fac%i == 0) && (i != fac)){		    //see if number divides in equally and is not the same number
					found = true;					              //if it divides, then it's not prime and found is true
					break;							                //go to next number.
				}
			}
			if(!found){								  //if no divisor found above found will still be false
				primes.add(fac);					//add number to array list of primes 
			}
			fac++;									    //increment fac
		}

		long num = 600851475143L;					//declare number to look for
		
		/*for loop to divide prime numbers in array list from smallest to largest 
		into num to break it down to smaller piece */
		
		for(int j = 0 ; j < primes.size(); j++){
			if(num % primes.get(j) == 0){			      //if the prime divides into our number divide it and print out the prime to console
				num = num/primes.get(j);
				System.out.println(primes.get(j));
				
			}
		}
	}
}
