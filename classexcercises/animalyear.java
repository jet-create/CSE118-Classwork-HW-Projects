package classexcercises;

import java.util.Random;
import java.util.Scanner;

public class animalyear {

	public static void main(String[] args) {
		
		
		Random random = new Random();
		 
		int year = random.nextInt(1000);
		int num = random.nextInt(1000);
		//int num is even, assign y to 0
		//int num is odd, assign y to 1
		int y=0;
		
		if (num % 2 == 0)
			y = 0;
		else
			y = 1;
		//conditional assignment operator, ? means if and "value for true" : "value for false" means or 
		y = (num % 2 == 0) ? 0:1;
		
		//if remainder is 0 assign 100, if its 1 assign 200 else assign 300
		int z = (num % 3 ==0) ? 100 : ((num % 3 == 1) ? 200 : 300);
		
		
		int animalyear = year%12;
		
		switch (animalyear) {
		
		case 0:
			System.out.println("It is the Year of the Monkey.");
			break;
		case 1:
			System.out.println("It is the Year of the Rooster.");
			break;
		case 2:
			System.out.println("It is the Year of the Dog.");
			break;
		case 3:
			System.out.println("It is the Year of the Pig.");
			break;
		case 4:
			System.out.println("It is the Year of the Rat.");
			break;
		case 5:	
			System.out.println("It is the Year of the Ox.");
			break;
		case 6:	
			System.out.println("It is the Year of the Tiger.");
			break;
		case 7:	
			System.out.println("It is the Year of the Rabbit.");
			break;
			
		case 8:	
			System.out.println("It is the Year of the Dragon.");
			break;
		
		case 9:
			System.out.println("It is the Year of the Snake.");
			break;
			
		case 10:
			System.out.println("It is the Year of the Horse.");
			break;
			
		case 11:	
			System.out.println("It is the Year of the Sheep.");
			break;
			
			
			
			
			
			
			
			
			
			
	}
	}

}
