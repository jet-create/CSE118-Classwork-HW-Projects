import java.util.Random;

public class number1 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		//generate number between 100 and 999
		int randomNumber = r.nextInt(100, 1000);
		
		//check if number is divisible by 3 AND 7
		boolean and = (randomNumber % 3 == 0)&&(randomNumber % 7 ==0);
		
		if (and) {
			System.out.println(randomNumber+" is divisible by 3 and 7.");
		}
		else {
			System.out.println(randomNumber+" is not divisible by 3 and 7.");
		}
		//extract digits and find greatest one
		int hund = randomNumber/100;
		int tens = (randomNumber%100)/10;
		int ones = randomNumber%10;
		
		int greatestDigit = (Math.max(Math.max(hund, tens), ones));
		
		System.out.println("The greatest digit is "+greatestDigit);
		//Check if digits are in ascending or descending order
		boolean order = (hund>tens)&&(tens>ones);
		boolean order2 = (hund<tens)&&(tens<ones);
		
		if(order) {
			System.out.println("Number is sorted in descending order.");
		}
		else if(order2) {
			System.out.println("Number is sorted in ascending order.");
		}
		else {
			System.out.println("Number is not sorted in any order.");
		}
	}

}
