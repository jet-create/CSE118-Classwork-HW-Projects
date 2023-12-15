package classexcercises;

import java.util.Scanner;

public class birthdayguesser {

	public static void main(String[] args) {

		
		//set of numbers
		String set1 = " 1 3 5 7 \n" +
					  " 9 11 13 15\n" +
					 " 17 19 21 23 \n" +
					  "25 27 29 31" ;
		
		String set2 = " 2 3 6 7 \n" +
				  " 10 11 14 15\n" +
				 "18 19 22 23 \n" +
				  "26 27 30 31" ;
		
		String set3 = " 4 5 6 7 \n" +
				  " 12 13 14 15\n" +
				 " 20 21 22 23 \n" +
				  "28 29 30 31" ;
		
		String set4 = " 8 9 10 11 \n" +
				  " 12 13 14 15\n" +
				 " 24 25 26 27 \n" +
				  "28 29 30 31" ;
		
		String set5 = " 16 17 18 19 \n" +
				  " 20 21 22 23 \n" +
				 " 24 25 26 27 \n" +
				  "28 29 30 31" ;
	
		//day to be found out
		int day = 0;
		
		Scanner s = new Scanner (System.in);
		
		//prompt user to answer if birthday is within the sets 
		System.out.println(set1);
		System.out.println("Is your birthday in set1?");
		System.out.println("0 for no & 1 for yes");
		int response = s.nextInt();
		
		if (response == 1) 
			day += 1;
		
		System.out.println(set2);
		System.out.println("Is your birthday in set2?");
		System.out.println("0 for no & 1 for yes");
		response = s.nextInt();
		
		if (response == 1) 
			day += 2;
		
		System.out.println(set3);
		System.out.println("Is your birthday in set3?");
		System.out.println("0 for no & 1 for yes");
		response = s.nextInt();
		
		if (response == 1) 
			day += 4;
		
		System.out.println(set4);
		System.out.println("Is your birthday in set4?");
		System.out.println("0 for no & 1 for yes");
		response = s.nextInt();
		
		if (response == 1) 
			day += 8;
		
		System.out.println(set5);
		System.out.println("Is your birthday in set5?");
		System.out.println("0 for no & 1 for yes");
		response = s.nextInt();
		
		if (response == 1) 
			day += 16;
		
		System.out.println("Your birthday is " + day);
		
		s.close();
		
	
		/*day += 1,2,4,8,16 is if your birthday is within the set, that number will be 
		added to variable day, for example my bday is set 1 and 5 so its 1 + 16 
		and that is my birthday*/
		/*response == 1 is because 0 is its not in the set and 1 is it is in the set, 
		 * binary encoding is used to determine the users bday
		from a binary number out of 00000, 17 = 10001*/
	
		
		
	}

}
