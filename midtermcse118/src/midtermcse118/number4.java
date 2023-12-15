package midtermcse118;

import java.util.Scanner;

public class number4 {

	public static void main(String[] args) {

		Scanner j = new Scanner(System.in);
		
		System.out.println("Enter seconds: ");
		int time = j.nextInt();
		
		int divideTime = time;
		int hours = divideTime / 3600; 
		divideTime %= 3600;
		int minutes = divideTime / 60;
		int seconds = divideTime % 60;
		
		System.out.printf("%d seconds = %d:%d:%d", time, hours, minutes, seconds);
		
		
	}

}
