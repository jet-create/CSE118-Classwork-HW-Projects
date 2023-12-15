package project2;

import java.util.Scanner;

public class Project2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = 0;
		while(true) {
			displayMenu();
			int choice = sc.nextInt();
			switch(choice) { 
			case 1:
				rows = rowsInput(sc);
				callTriangle(rows);
				System.out.println();
				break;
			case 2:
				rows = rowsInput(sc);
				callPyramid(rows);
				System.out.println();
				break;
			case 3: 
				rows = rowsInput(sc);
				callDiamond(rows);
				System.out.println();
				break;
			case 4:
				System.out.println("You have exited the program. Thank You!");
				System.exit(0);
				break;
			default:
				System.out.println("INVALID INPUT, TRY AGAIN.");
			}	
		}	
		
	}

	public static void displayMenu() {
	    System.out.println("Main Menu: ");
	    System.out.println("1: Triangle Patterns");
	    System.out.println("2: Pyramid Patterns");
	    System.out.println("3: Diamond Patterns");
	    System.out.println("4: Exit");
	    System.out.print("Select your choice: ");
	}
	
	public static int rowsInput(Scanner sc) {
		System.out.println("How many rows in your pattern? (1-9)");
		int rows = sc.nextInt();
		return rows;
	}
	
	private static void callTriangle(int rows) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Your Choice: ");
	    System.out.println("1: Triangle 1A");
	    System.out.println("2: Triangle 1B");
	    System.out.println("3: Triangle 1C");
	    System.out.println("4: Triangle 1D");
	    
	    int shapeNum = sc.nextInt();
	    
	    switch(shapeNum) {
	    
	    case 1:
	    	triangleOneA(rows);
	    	break;
	    case 2: 
	    	triangleOneB(rows);
	    	break;
	    case 3: 
	    	triangleOneC(rows);
	    	break;
	    case 4:
	    	triangleOneD(rows);
	    	break;
	    default:
	    	System.out.println("INVALID INPUT, TRY AGAIN.");
	    }
	}
	
	private static void callPyramid(int rows) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Your Choice: ");
	    System.out.println("1: Pyramid 2A");
	    System.out.println("2: Pyramid 2B");
	    System.out.println("3: Pyramid 2C");
	    System.out.println("4: Pyramid 2D");
	    
	    int shapeNum = sc.nextInt();
	    
	    switch(shapeNum) {
	    
	    case 1:
	    	pyramidTwoA(rows);
	    	break;
	    case 2: 
	    	pyramidTwoB(rows);
	    	break;
	    case 3: 
	    	pyramidTwoC(rows);
	    	break;
	    case 4:
	    	pyramidTwoD(rows);
	    	break;
	    default:
	    	System.out.println("INVALID INPUT, TRY AGAIN.");
	    }
	}
	
	private static void callDiamond(int rows) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Your Choice: ");
	    System.out.println("1: Diamond 3A");
	    System.out.println("2: Diamond 3B");
	    System.out.println("3: Diamond 3C");
	    System.out.println("4: Diamond 3D");
	    
	    int shapeNum = sc.nextInt();
	    
	    switch(shapeNum) {
	    
	    case 1:
	    	diamondThreeA(rows);
	    	break;
	    case 2: 
	    	diamondThreeB(rows);
	    	break;
	    case 3: 
	    	diamondThreeC(rows);
	    	break;
	    case 4:
	    	diamondThreeD(rows);
	    	break;
	    default:
	    	System.out.println("INVALID INPUT, TRY AGAIN.");
	    }
	}
	
	public static void triangleOneA(int rows) {
		// first loop prints rows, runs "rows" amount of times
		for(int i = 1; i <=rows; i++) {
			/* second loop will create columns for us to input values
			 condition j <= i ensures that we print 'i' the 'j' column
			 */
			for(int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void triangleOneB(int rows) {
		// first loop prints rows, runs "rows" amount of times
		for(int i = 1; i<=rows; i++) {
			//second loop will create the spaces i need for my shape
			for(int j = 1; j <=rows-i; j++) {
				System.out.print(" ");
			}
			// third loop will print the number values in the columns
			for(int k = 1; k<=i; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void triangleOneC(int rows) {
		// first loop begins making rows, but iterates down from 'rows'
		for(int i = rows; i>0; i--) {
			// second loop will print values in the columns made by first loop
			for(int j = 1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void triangleOneD(int rows) {
		// first loop iterates down the rows starting from 'rows'
		for(int i = rows; i > 0; i--) {
			// second loop to print out spaces before nums, rows + 1 - i is the total spaces needed per line, as i decreases, num of spaces increases
			for(int j = rows; j > (rows+1)-i; j--) {
				System.out.print(" ");
			}
			// third loop will print out the values of i n k cols, k>=i ensures nums are printed in a decreasing order
			for(int k = rows; k>=i; k--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void pyramidTwoA(int rows) {
		// first loop prints out my rows, runs 'rows' amount of times
		for(int i = 1; i <= rows; i++) {
			// second loop prints out spaces to create shape
			for(int j = 1; j <= rows-i; j++) {
				System.out.print(" ");
			}
			// third loop prints out values in our columns, condition prints i the number of times of whatever 2*i-1 is evaluated to
			for(int k = 1; k <= 2 * i - 1; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
	
	public static void pyramidTwoB(int rows) {
		// first loop prints out my rows 'rows' times
		for(int i = 1; i <= rows; i++) {
			// second loop prints spaces
			for(int j = 1; j <= rows-i; j++) {
				System.out.print(" ");
			}
			// third loop prints values in increasing order
			for(int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			//fourth loop prints values in decreasing order
			for(int k = i-1; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
	
	public static void pyramidTwoC(int rows) {
		// first loop prints my rows, 'rows' times
		for(int i=rows; i>0; i--) {
			// second loop prints out spaces needed
			for(int j=1; j<=rows-i; j++) {
				System.out.print(" ");
			}
			// third loop prints out values in our columns, condition prints i the number of times of whatever 2*i-1 is evaluated to
			for(int k=1; k<=i*2-1; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void pyramidTwoD(int rows) {
		// first loop prints my rows, 'rows' times
		for(int i=rows; i>0; i--) {
			// second loop prints out spaces needed
			for(int j=1; j<=rows-i; j++) {
				System.out.print(" ");
			}
			// print the numbers in an increasing order
			for(int k=1; k<=i; k++) {
				System.out.print(k);
			}
			// fourth loop to print nums in decreasing order
			for(int k=i-1; k>0; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
		
	}
	
	public static void diamondThreeA(int rows) {
		// pyramidTwoB+pyramidTwoD combination
		for(int i = 1; i<=rows; i++) {
			// loop to print out my spaces
			for(int j=rows-i; j>=1; j--) {
				System.out.print(" ");
			}
			// print numbers in increasing order
			for(int k = 1; k<=i; k++) {
				System.out.print(k);
			}
			for(int k = i-1; k>0; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
		// bottom half of the diamond so i = the rows-1 and we begin to iterate down so the bottom half is upside down
		for(int i = rows-1; i>0; i--) {
			for(int j = rows-i; j>=1; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++) {
				System.out.print(k);
			}
			for(int k = i-1; k>0; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
	
	public static void diamondThreeB(int rows) {
		int n = rows/2+1;
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <=rows-i; j++) {
				System.out.print(" ");
			}
			// print nums
			for(int k = i; k<=2*i-1; k++) {
				System.out.print(k);
			}
			// print dereasing
			for(int k = 2*i-2; k>=i; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
		for(int i = rows-1; i>0; i--) {
			for(int j = 1; j<=rows-i; j++) {
				System.out.print(" ");
			}
			for(int k = i; k<=2*i-1; k++) {
				System.out.print(k);
			}
			for(int k = 2*i-2; k>=i; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
	
	public static void diamondThreeC(int rows) {
		// pyramid2A+pyramid2C
		// first loop prints out my rows, runs 'rows' amount of times
		for(int i = 1; i <= rows; i++) {
			// second loop prints out spaces to create shape
			for(int j = 1; j <= rows-i; j++) {
				System.out.print(" ");
			}
			// third loop prints out values in our columns, condition prints i the number of times of whatever 2*i-1 is evaluated to
			for(int k = 1; k <= 2 * i - 1; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
		// first loop prints my rows, 'rows' times
		for(int i=rows-1; i>0; i--) {
			// second loop prints out spaces needed
			for(int j=1; j<=rows-i; j++) {
				System.out.print(" ");
			}
			// third loop prints out values in our columns, condition prints i the number of times of whatever 2*i-1 is evaluated to
			for(int k=1; k<=i*2-1; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void diamondThreeD(int rows) {
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <=rows-i; j++) {
				System.out.print(" ");
			}
			// print nums
			for(int k = i; k>=1; k--) {
				System.out.print(k);
			}
			// print dereasing
			for(int k = 2; k<=i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		for(int i = rows-1; i>0; i--) {
			for(int j = 1; j<=rows-i; j++) {
				System.out.print(" ");
			}
			for(int k = i; k>=1; k--) {
				System.out.print(k);
			}
			for(int k = 2; k<=i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
	











