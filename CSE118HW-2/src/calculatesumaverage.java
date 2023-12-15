import java.util.Scanner;

public class calculatesumaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set scanner
		
		Scanner sc = new Scanner(System.in);
		
		//prompt user to assign int type # to a b c
		System.out.print("a = ");
		int a = sc.nextInt();
		
		System.out.print("b = ");
		int b = sc.nextInt();
		
		System.out.print("c = ");
		int c = sc.nextInt();
		
		// sum is addition, average is division by amount of #'s
		int sum = (a + b + c);
		System.out.println("The average of numbers a, b and c is sum: "+sum);
		
		double average = ((a + b + c)/3.0);
		System.out.println("The average of numbers a, b and c is average: "+average);
		
		sc.close();
		
		
	}

}
