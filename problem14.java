
public class problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//start timer
		long timeStart = System.currentTimeMillis();
		
		//variables to store highest number and amount of terms
		int longestChain = 0;
		long chainStart = 0;
		
		//system counter variables for the loop
		long start = 999999;
		long nextNum; //the next number in the sequence each time
		int counter = 1; 
		
		//loop to check numbers from 999999 to 0
		while(start > 0){
			//first term in the sequence will be the starting number
			nextNum = start;
			
			//run loop until nextTerm is 1
			while(nextNum != 1){
				
				//if the term is achieved by 2^n the results will be the same from here on
				int countBinary = binaryCheck(nextNum);
				if(countBinary != 0){
					counter += countBinary;
					nextNum = 1;
					break;
				}
				
				//if even number divide by 2
				if(nextNum % 2 == 0){
					nextNum = nextNum/2;
				}
				//if odd multiply by 3 and add 1
				else{
					nextNum = (nextNum * 3) + 1;
				}
				counter++;
			//end while loop
			}
			//if the last run starting number has a higher amount of terms, make this the one to beat
			if(counter > longestChain){
				longestChain = counter;
				chainStart = start;
				System.out.println("New longest: " + chainStart + " " + longestChain);
			}
			//reset the counter, and decrement the starting number
			counter = 1;
			start--;
		}
		//stop the timer
		long timeTaken = System.currentTimeMillis() - timeStart;
		System.out.println("****************************");
		System.out.println("Highest number: " +chainStart);
		System.out.println("Amount of terms: " + longestChain);
		System.out.println("Time Taken: " + timeTaken + "ms");
	}
	//method to check if number is equal to 2^n, which will return n
	public static int binaryCheck(long number){
		int count = 1;
		int twos = 1;
		int marker = 0;
		while(twos < 1000000){
			twos *= 2;
			if(number == twos){
				marker = count;
				break;
			}
			count++;
		}
		
		return marker;
	}

}
