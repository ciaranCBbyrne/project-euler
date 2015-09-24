/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20? 
 */
 
public class problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean found = false;
		int result = 1;			//start loop at 1
		
		//loop to multiply result
		while(!found){
			int increment = 0;					      //counter will climb when numbers divide in evenly 
			for(int i = 1 ; i <= 20 ; i++){		//check numbers from 1 to 20
				if(result % i == 0){		      	//if divides evenly raise increment by 1
					increment++;
				}
			}
			if(increment == 20){				      //if the counter has 20, then 1 to 20 divide in evenly, so found
				found = true;
				System.out.println(result);
			}
			result ++;							          //increment result by one at each loop
		}
	}
}
