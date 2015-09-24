/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number? 
 */

public class problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int counter = 1;	    	//set to 1, as we aren't checking 2 which we know is the first prime.
		long fac = 3;		      	//set to 3, so we can add 2 each time. even numbers aren't primes.
		boolean found = false;
		
		while(!found){
			boolean prime = true;
			for(long i = 2 ; i <= fac/2 ; i++){		      //loop to check if a number divides into our fac variable
				if((fac % i == 0) && (fac != i)){	        //if it divides it's not a prime = false
					prime = false;
					break;
				}
			}
			if(prime){						    //if no divisor found it is a prime,raise our counter until it gets to 10001
				counter++;
			}
			if(counter == 10001){			//prime we are looking for
				found = true;
				System.out.println(fac);
			}
			fac += 2;
		}
		
	}

}
