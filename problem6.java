/*The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 minus 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum
*/

public class problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare variables
		int sumSquares = 0;
		int squareSums = 0;
		
		//loop through first 100 natural numbers
		for(int i = 1 ; i <= 100 ; i++){
			sumSquares += (i * i);				      //add i-squared to sumSquares
			squareSums += i;					          //add i to squareSums. Square result later
		}
		int result = (squareSums * squareSums) - sumSquares;		//result is squareSums squared minus sumSquares
		System.out.println(result);
	}

}
