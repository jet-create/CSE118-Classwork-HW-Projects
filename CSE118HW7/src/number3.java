import java.util.Scanner;

public class number3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String s0 = s.nextLine();
		//first word displayed
		int firstS = s0.indexOf(' ');
		String subF = s0.substring(0, firstS);
		System.out.println("First word is "+subF);
		//find index of last space
		int lastS = s0.lastIndexOf(' ');
		String subL = s0.substring(lastS + 1);
		System.out.println("Last word is "+subL);
		
		int compare = subF.compareTo(subL);
		if (compare == 0) {
			System.out.println("The words are equal.");
		}
		else if (compare < 0) {
			System.out.println("The first word is greater.");
		}
		else {
			System.out.println("The second word is greater.");
		}
		String newString = subL.concat(subF);
		System.out.println("New word is: "+ newString);
		
		s.close();
			
			
		}
		

		

	}


