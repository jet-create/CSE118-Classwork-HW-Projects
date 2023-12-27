import java.util.Scanner;

public class Final118 {

	public static void main(String[] args) {

//		(1)
		int[] a = new int[50];
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * (99-(-99)+1)+(-99));
		}	
		displayArray(a, 8);
		for(double i : analyzeArray(a)) {
			System.out.println(i);
		}

//		(2)
		int[] pair = generatePair();
		System.out.printf("%d, %d", pair[0], pair[1]);
		System.out.println();
		displayNumbers(pair[0], pair[1], 8);
		
//		(3)
		String[] b = new String[4];
		Scanner sc = new Scanner(System.in);
		inputWords(b, sc);
		if(findWordInStringArray(b, "computer")) System.out.println("Word was found");
		else System.out.println("Word was not found");
		System.out.println(mergeWords(b));
		System.out.println(extractSecondWord(mergeWords(b)));

		String inputString = "a73929837bvcga62";
		displayOccurencesTable(findOccurences(inputString));
	
//		(4)
		while(true) {
			createMenu();
			int choice = sc.nextInt();
			switch(choice) {
			case 1: System.out.println("The digit is "+generateRandomDigitChar()); break;
			case 2: System.out.println("The letter is "+generateRandomLetterChar()); break;
			case 3: System.out.println("You have exited the program, thank you!");System.exit(0);
			default: System.out.println("Enter a valid choice");
			
			}
		}
		
	}
	/**
	 * Displays an array with x numbers per line
	 * @param arr array inputted
	 * @param numsPerLine numbers user wants per line
	 */
	public static void displayArray(int[] arr, int numsPerLine) {
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%4d", arr[i]);
			if((i+1)%numsPerLine==0) 
				System.out.println();
		}
		System.out.println();
	}
	
	/**
	 * Finds the max min and average of an array
	 * @param arr array being "analyzed"
	 * @return returns the max min and average of the array
	 */
	public static double[] analyzeArray(int[] arr) {
		int sum = 0, max = arr[0], min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) max = arr[i];
			if(arr[i] < min) min = arr[i];
			sum += arr[i];
		}
		double average = (double)sum/arr.length;
		
		return new double[]{max, min, average};
	}
	
	/**
	 * Generates values for x and y (-1000 to 1000)
	 * and makes sure that x is always less than y
	 * @return anonymous array of x and y
	 */
	public static int[] generatePair() {
		int x, y;
		do {
			x = (int)(Math.random() * (1000-(-1000)+1)+(-1000));
			y = (int)(Math.random() * (1000-(-1000)+1)+(-1000));
		}while(x >= y);
		
		return new int[] {x, y};
	}
	
	/**
	 * Displays numbers within a specific range 
	 * @param lowerBound lower bound value 
	 * @param upperBound upper bound value 
	 * @param numPerLine numbers user wants per line
	 */
	public static void displayNumbers(int lowerBound, int upperBound, int numPerLine) {
		for(int i = lowerBound; i < upperBound; i++) {
			if((i+1)%3==0^(i+1)%7==0) {
				System.out.printf("%4d", i);
			}
			
			if((i+1)%numPerLine==0) {
				System.out.println();
			}
		}
	}
	/**
	 * Uses a linear search to look through a String array and check if the word input was found
	 * @param a String array we are searching
	 * @param key String we are searching for
	 * @return returns the boolean flagging whether the word was found or not
	 */
	public static boolean findWordInStringArray(String[] a, String key) {
		boolean foundWord = false;
		for(int i = 0; i < a.length; i++) {
			if(a[i].equals(key)) {
				foundWord = true;
				break;
			}
		}
		return foundWord;
	}
	/**
	 * Method used to find the count of digital characters '0'-'9'
	 * @param str String being searched
	 * @return returns the array with the count of all the digital chars in the string
	 */
	public static int[] findOccurences(String str) {
		int[] occurences = new int[10];
		for(int i = 0; i < str.length(); i++) {
			char digit = str.charAt(i);
			if(Character.isDigit(digit)) {
				occurences[digit - '0']++;
			}
		}
		return occurences;
	}
	/**
	 * Lets user input words and store them in an array
	 * @param a string array we are storing words in
	 * @param sc words input
	 */
	public static void inputWords(String[] a, Scanner sc) {
		System.out.println("Enter 4 words: ");
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextLine();
		}
	}
	/**
	 * Merges words in a string
	 * @param a merges words in the array inputted
	 * @return returns all the words in one string
	 */
	public static String mergeWords(String[] a) {
		String ns = "";
		for(int i = 0; i < a.length; i++) {
			ns = (ns + a[i]) + " "; 
		}
		return ns;
	}
	/**
	 * Retrieves the second word from a string
	 * @param str String we are getting the word from
	 */
	public static String extractSecondWord(String str) {
		int firstSpace = str.indexOf(" ");
//		add +1 because we want to skip over the first space
		int secondSpace = str.indexOf(" ", firstSpace +1);
//		add +1 so we skip the spaces and extract JUST the word
		String secondWord = str.substring(firstSpace +1, secondSpace +1);
		
		return secondWord;
	}
	/**
	 * Displays a table based on the findOccurences method
	 * @param occurences Uses the array created in findOccurences method to create table
	 */
	public static void displayOccurencesTable(int[] occurences) {
		System.out.println("Digit | Count");
		System.out.println("===============");
		for(int i = 0; i < occurences.length; i++) {
			System.out.printf("%4d | %4d\n", i, occurences[i]);
		}
	}
	/**
	 * Creates the menu in which the user will select from
	 */
	public static void createMenu() {
		System.out.println("Welcome, choose one: ");
		System.out.println("1: generate a digital character");
		System.out.println("2: generate a letter character");
		System.out.println("3: exit");
	
	}
	/**
	 * Generates a random digital character
	 * @return the digital char generated
	 */
	public static char generateRandomDigitChar() {
		return (char)((int)(Math.random()*('9'-'0'+1)+'0'));
	}
	/**
	 * Generates a random digital letter, uppercase OR lowercase
	 * @return returns the letter char generated
	 */
	public static char generateRandomLetterChar() {
		int choice = (int)(Math.random()*(1-0+1)+0);
		
		if(choice == 0) {
			return (char)((int)(Math.random()*('Z'-'A'+1)+'A'));
		}else {
			return (char)((int)(Math.random()*('z'-'a'+1)+'a'));
		}
	}

	
}
