
import java.io.FileReader;
import java.math.BigInteger;
import java.util.Scanner;

public class problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//open file with list of 50 digit numbers
			Scanner textfile = new Scanner(new FileReader("src/problem13largesum.txt"));
			//declare BigInt class. first line of file is taken
			BigInteger big = new BigInteger(textfile.nextLine());
			
			//loop through textfile line by line and
			//add to BigInt
			while(textfile.hasNextLine()){
				big = big.add(new BigInteger(textfile.nextLine()));
				
			}
			//make a divisor to help to remove last 40 digits for readability 
			BigInteger divider = new BigInteger("10000000000");
			for(int i = 0 ; i < 4 ; i++){
				big = big.divide(divider);
			}
			System.out.println(big);
			//close scanner
			textfile.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
