/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc
 */

public class problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//nested loop up to 500
		for(int i = 1 ; i < 500 ; i++){
			for(int j = i+1 ; j < 500 ; j++){
				
				double root = Math.sqrt((i*i) + (j*j));  	          //get root of i squared plus j squared
				
				if(root == (int)root){						                  //check that root doesn't contain decimals
					int pyth = (int) Math.sqrt((i*i) + (j*j));			  //convert root to integer

					if((i + j + pyth == 1000) && (i<j) && (j<pyth)){	//check for pythagorean triplet and sum equals 1000
						int product = i*j*pyth;                         //find product of numbers

						System.out.println(product);
					}
				}
			}
		}
	}

}
