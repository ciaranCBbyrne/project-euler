package problem17;

class alternate17 {
	
	public static final String[] singles = {
		"","one","two","three","four","five","six","seven","eight","nine","ten"
	};
	public static final String[] teens = {
		"","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen",	"nineteen"
	};
	public static final String[] tens = {
		"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety","hundred"
	};
	public static final String thousand = "thousand";
	
	int number;
	Integer Add(int number){
		//import number
		this.number += number;
		return this.number;
	}
	
	Integer Switch(int number){
		//call methods
	//up to 100
		//up to 20
		if(number < 20){
			UpTo20(number);
		}
		//tens
		else if((number >= 20) && (number < 100)){
			Singles(number % 10);
			Tens(number);
		}
		//thousand
		else if(number >= 1000){
			Thousand(number);
		}
	//over 100
		else{
			Hundred(number);
		}
		return this.number;		
	}
	
	void UpTo20(int num){
		if(num <= 10){
			Singles(num);
		}
		//teens
		else if((num > 10) && (num < 20)){
			Teens(num);
		}
	}
	
	Integer Singles(int single){
		//count singles
		this.number += singles[single].length();
		return this.number;
	}
	Integer Teens(int teen){
		//count teens
		this.number += teens[teen % 10].length();
		return this.number;
	}
	Integer Tens(int ten){
		//count tens
		this.number += tens[ten / 10].length();
		return this.number;
	}
	Integer Hundred(int hund){
		//count hundreds
		Singles(hund / 100);
		if(hund % 100 != 0){
			String and = "and";
			this.number += and.length();
			Switch(hund % 100);
		}
		this.number += tens[10].length();
		return this.number;
	}
	Integer Thousand(int thou){
		//count thousand
		Singles(thou / 1000);
		if(thou % 1000 != 0){
			if(thou % 1000 < 100){
				String and = "and";
				this.number += and.length();
			}
			Switch(thou % 1000);
		}
		this.number += thousand.length();
		return this.number;
	}
}
