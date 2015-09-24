package problem17;
/*If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 
letters used in total.
If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 
23 letters and 115 (one hundred and fifteen) 
contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
*/

public class problem17 {

	public static final String[] numberConvert = {
		"","one","two","three","four","five","six","seven","eight","nine","ten",
		"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen",	"nineteen"		
	};
	public static final String[] tensConvert = {
		"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety","hundred"
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int add = 0;
		for(int i = 1 ; i <= 1000 ; i++){
			String numString;
			if(i == 1000){
				// 1000
				String thouString = "onethousand";
				add += thouString.length();
			}
			else if(i < 20){
				// for less than 20 we have teens!!
				numString = numberConvert[i];
				add += numString.length();
			}
			else if(i < 100){
				// 21 = one from numberConvert + 2 from tens
				int posNum = i % 10;
				int posTens = i / 10;
				numString = numberConvert[posNum] + tensConvert[posTens];
				add += numString.length();
			}
			else if(i % 100 == 0){
				// 100 = one from numberConvert and hundred from tens
				int posNum = i / 100;
				numString = numberConvert[posNum] + tensConvert[10];
				add += numString.length();
				System.out.println("After " + i + ": " + add);
			}
			else{
				// 111 = eleven from numberConvert and hundred from tens and 'and'
				// 121 = one from numberConvert and hundred from tens and 'and' and twenty from tens and one from numberConvert
				int hundreds = i / 100;
				int tens;
				int singles;
				if(i % 100 < 20){
					tens = 0;
					singles = i % 100;
				}
				else{				
					tens = (i % 100) / 10;
					singles = (i % 100) % 10;
				}
				numString = numberConvert[hundreds] + tensConvert[10] + "and" + tensConvert[tens] + numberConvert[singles];
				add += numString.length();
			}
			
		}
		
		System.out.println("Final Result: " + add);

	}

}
