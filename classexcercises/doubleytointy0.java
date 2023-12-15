package classexcercises;

import java.util.Scanner;

public class doubleytointy0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set scanner class
		Scanner sc = new Scanner(System.in);
		
		//declare y
		double y = 3.14159265;
		
		//cut it off at 3.1415
		double y0 = (int)(y * 10000) / 10000.0;
		System.out.println("Y = " +y0);
		
		//round it up after the 5
		double y1 = (int)((y+0.00005)*10000)/10000.0;
		System.out.println("Y = "+y1);
		

	}

}
