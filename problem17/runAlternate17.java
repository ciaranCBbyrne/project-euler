package problem17;
// run problem 17 in project euler
public class runAlternate17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		alternate17 alter = new alternate17();
		int addition = 0;
		int num = 1000;
		System.out.println(alter.Switch(num));
		alter.number = 0;
		for(int i = 1 ; i <= num ; i++){
			addition = alter.Switch(i);
		}
		System.out.println("Total: " + addition);
	}

}
