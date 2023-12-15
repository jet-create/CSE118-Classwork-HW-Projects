package classexcercises;

public class arraypracpt3 {

	public static void main(String[] args) {

		demoVarLenParameter(1, 3, 6, 7, 8);
		//demoVarLenParameter(1, 0);
		//demoVarLenParameter(1, 3, 5, 6, 7, 8, 9, 0, 9, 2, 3, 3, 50);
		
		
		
		int[] b = createArray(5);
		for(int value: b) {
			int e = value;
			System.out.println(e);
		}
		
		// make copy of array b
		
		// this copies the REFERENCE of array b
		int[] c = b;
		// how to actually make a COPY of an array
		int[] c1 = new int[b.length];
		for(int i = 0; i<c1.length; i++) {
			c1[i]=b[i];
		}
		
		
		// cards array practice 
		int[] arr = createArray(52);
		displayArray(arr, 13);
		//System.out.println();
		printCards(arr);
		shuffleArray(arr);
		//divByThreeArray(arr, 13);
		System.out.println();
		
		
	}

	// z is an array
	public static void demoVarLenParameter(int...z) {
		for(int i = 0; i<z.length; i++) {
			System.out.printf("%3d", z[i]);
		}
	}
	
	
	public static int[] createArray(int size) {
		// initialize array with numbers from one - size 
		int[] array = new int[size];
		for(int i = 0; i<size; i++) {
			array[i] = i+1;
		}
		return array;
	}
	
	public static void shuffleArray(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			// generate index so we can pick it up to be shuffled
			int idx = (int)(Math.random()*arr.length);
			// swap my elements
			int t = arr[i];
			arr[i] = arr[idx];
			arr[idx] = t;
		}
	}
		
	public static void displayArray(int[] arr, int numPerLine) {
		for(int i = 0; i<arr.length; i++) {
			System.out.printf("%4d", arr[i]);
			if((i+1)%numPerLine==0)
				System.out.println();
		}
	}
	
	public static void divByThreeArray(int[] arr, int numPerLine) {
		int ct = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%3==0) {
				System.out.printf("%4d", arr[i]);
				ct ++;
			}
			if(ct%numPerLine==0) {
				System.out.println();
			}
		}	
	}


	public static void printCards(int[] arr) {
		// most efficient solution
		String strSuits = "CHDS";
		String strCardNum = "A123456789TJQK";
		
		for(int i = 0; i<arr.length; i++) {
			char suitCh = strSuits.charAt((arr[i]-1)/13);
			char cardNum = strCardNum.charAt((arr[i]-1)%13);
			if(strCardNum=="T") {
				
			}
			System.out.printf("%4s", ""+ suitCh+cardNum);
			
			/*
				less efficient solution
			
			int suit = (arr[i]-1)/13;
			char suitCh = ' ';
			switch(suit) {
			case 0:suitCh = 'C'; break;
			case 1:	suitCh = 'H'; break;
			case 2:suitCh = 'D'; break;
			case 3: suitCh = 'S'; break;
			}
			
			String cardNumStr = " ";
			int cardNum = (arr[i]-1)%13;
			switch(cardNum) {
			case 0: cardNumStr = "A"; break;
			case 10: cardNumStr = "J"; break;
			case 11: cardNumStr = "Q"; break;
			case 12: cardNumStr = "K"; break;
			default: cardNumStr = cardNumStr + (cardNum + 1);
			}
			
			System.out.printf("%5s", suitCh+cardNumStr);
			*/
			if((i+1)%13==0) 
				System.out.println();
		}
	}
}	

