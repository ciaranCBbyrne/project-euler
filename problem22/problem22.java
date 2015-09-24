package problem22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
/*Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names,
 * begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value 
 * by its alphabetical position in the list to obtain a name score.
 *
 *For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, 
 *is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

 *What is the total of all the name scores in the file?
 */

public class problem22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//import names.txt to array and sort alphabetically
		String file = "C:/Users/Administrator.28BY4Q1/workspace/problems/src/problem22/names.txt";
		String[] info = fileRead(file);

		Arrays.sort(info);

		valuation(info);
	}
	
	//read text file into array and return
	private static String[] fileRead(String fileName){
		String[] info = null;
		try{
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			String names = reader.readLine();
			reader.close();

			String newNames = names.replaceAll("[\"]", "");
			info = newNames.split(",");

		}catch(IOException e){
			System.out.println(e);
		}
		return info;				
	}

	//multiply the position of the name by, the sum of the value of each letter in the name, then add all results
	private static void valuation(String[] info) {
		// TODO Auto-generated method stub
		long totalSum = 0;
		int iter = 0;

		//iterate through the array
		while(iter < info.length){
			int addition = 0;

			//split each name and get value of letter
			for(int i = 0 ; i < info[iter].length() ; i++){
				char cha = info[iter].charAt(i);
				String letter = String.valueOf(cha);
				String letterDown = letter.toLowerCase();
				addition += alphaValue(letterDown);
			}
			//add product to totalSum
			totalSum += (addition * (iter+1));

			iter++;
		}
		System.out.println(totalSum);
	}

	//assigns value of letter based on alphabet position
	private static Integer alphaValue(String letter){
		String[] alphabet = {"a","b","c","d","e","f","g",
				"h","i","j","k","l","m","n","o",
				"p","q","r","s","t","u","v","w",
				"x","y","z"};
		boolean found = false;
		int position = 0;
		while(!found){
			if(alphabet[position].equals(letter)){
				found = true;
			}
			position++;
		}
		return position;
	}
}
