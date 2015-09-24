/*A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers
*/
public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare variables
		int reversed = 0;		//to hold inverse of product to compare
		int product = 0;		//to hold product of 3 digit numbers to compare
		int compare = 0;		//to hold highest product achieved
		
		//nested loop to compare 3 digit numbers, highest to lowest
		for(int i = 999 ; i > 100 ; i--){
			for(int j = 999 ; j > 100 ; j--){
				product = i*j;							                          //multiply i*j
				reversed = change(product);				                    //pass product to reverse method
				if((product == reversed) && (product >= compare)){		//compare product and reversed and see if product is higher than previous
					compare = product;
					System.out.println(product + " = " + reversed);
					System.out.println(i + " + " + j + " are highest");
				}
			}
		}
	}

	//reverse number method
	private static int change(int product) {
		// TODO Auto-generated method stub
		
		int reversed = 0;							            //declare variable
		while(product != 0){						
			int remainder = product % 10;			      //mod 10 will leave a remainder of the last digit
			reversed = reversed * 10 + remainder ;	//adds remainder digit to reversed

			product /= 10;		            					//divide product by 10 to get to next digit in line
		}
		return reversed;							            //return to reversed to main method
	}

}
