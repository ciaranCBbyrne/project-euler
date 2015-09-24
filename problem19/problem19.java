package problem19;

/*You are given the following information, but you may prefer to do some research for yourself.

1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
*/

/*
 * 
 */

public class problem19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sun = 7;	//7th day
		int mon = 1;	//1st day
		
		//starting point exactly one year after monday 1900
		int firstMonth = (mon + 365) % sun;
		//amount of days in each month
		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int counter = 0;	//sundays first of the month
		int leap = 1;		//count leap years
		
		//for loop for years
		for(int year = 1901 ; year < 2001 ; year++){
			//check if leap year and change feb if so
			if(leap == 4){
				months[1] = 29;
				leap = 0;
			}
			else
				months[1] = 28;
			//for loop for months
			for(int i = 0 ; i < 12 ; i++){
				//add days and check for sunday the first
				firstMonth += months[i];
				if(firstMonth % sun == 0){
					counter++;
				}
			}
			leap++;	//increment leap year counter
		}
		System.out.println(counter);
	}
}
