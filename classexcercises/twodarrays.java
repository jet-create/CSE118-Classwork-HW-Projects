package classexcercises;

public class twodarrays {

	public static void main(String[] args) {
		
		/*
		 (initializing arrays w random nums [-20, 20])
		 (printing arrays)
		 (summing all elements)
		 (summing all elements by column)
		 (which row has the largest sum)
		 (finding the smallest index of the largest num)
		 (random shuffling)
		 */
		
		int[][] a = new int[5][3];
		// GOES THROUGH ROWS
		for(int i = 0; i < a.length; i++) {
			// GOES THROUGH COLUMNS
			for(int j = 0; j < a[i].length; j++) {
				// initialize the random value in range in spots
				a[i][j] = (int)(Math.random()*41-20);
			}
		}
		printArray(a);
	}
		
		// print array
		public static void printArray(int[][] arr) {
			// ROWS
			for(int i = 0; i < arr.length; i++) {
				// COLUMNS
				for(int j = 0; j < arr[i].length; j++) {
					System.out.printf("%4d", arr[i][j]);
				}
				System.out.println();
			}
		}

}
