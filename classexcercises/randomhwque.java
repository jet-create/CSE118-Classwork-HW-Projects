package classexcercises;

public class randomhwque {

	public static void main(String[] args) {
		
	}
		public class ConversionTable {
		    
			public static void main(String[] args) {
		        System.out.println("meters\tfeet\tinches");

		        double metersToFeet = 3.28084; // Conversion factor from meters to feet
		        double feetToInches = 12.0; // Conversion factor from feet to inches

		        for (int meters = 1; meters <= 9; meters++) {
		            conversionTable(meters, metersToFeet, feetToInches); // Pass the conversion factors here
		        }
		    }

		    public static void conversionTable(int meters, double metersToFeet, double feetToInches) {
		        double feet = meters * metersToFeet;
		        double inches = feet * feetToInches;

		        // Print the table here
		        System.out.printf("%d\t%.2f\t%.2f\n", meters, feet, inches);
		    }
		}

	}


