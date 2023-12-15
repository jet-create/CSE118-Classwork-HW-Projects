package classexcercises;

import java.util.Random;

public class generaterandomnum {

	public static void main(String[] args) {
		
		Random ra = new Random();
		
		//generate random int from -99(low-bound) to 99(upper-bound)
		
		int num = ra.nextInt(-99, 100);
		
		//check if # is divisible by 3 and 7
		
		Boolean b1 = (num%3==0)&&(num%7==0);
		
		if (b1){
			System.out.println(num + " is divisible by 3 and 7.");
		}
		else {
			System.out.println(num + " isn't divisble by 3 and 7.");
		}
		
		// check if # is by 7 or 9 
		
		Boolean b2 = (num%7==0)^(num%9==0);
		
		if (b2){
			System.out.println(num + " is divisible by 9 or 7 but not both.");
		}
		else {
			System.out.println(num + " isn't divisble by 9 and 7.");
		}
		
}
	
}
	
	
	
	
	
