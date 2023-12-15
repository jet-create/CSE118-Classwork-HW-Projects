
public class six {

	public static void main(String[] args) {
		
		System.out.println("meters\tfeet\tinches");
		
		// double metersTofeet =  0;  set values to convert m to ft.
		// double feetToinches = 0;  set values to convert ft. to in.
		double metersTofeet = 3.28084;
		double feetToinches = 12.0;
		
		for(int meters=1; meters<=9; meters++) {
			conversionTable(meters, metersTofeet, feetToinches); // passes the conversion factors here, so metersTofeet = meters * 3.28084
		}
		
		
	}

	public static void conversionTable(int meters, double metersTofeet, double feetToinches){
		double feet = meters * metersTofeet; // feet = meters * 3.28084
		double inches = feet * feetToinches; // inches = feet * 12.0 
		
		//print the table here
		System.out.printf("%d\t%.2f\t%.2f\n", meters, feet, inches);
	}
	
}


//use loop statement to display a table showing conversion from meters to feet
// 1 meter = 3.28084 feet; 1 foot = 12 inches
// Clue: use formatted output (printf()) statement to print each row. 
//Use loop statement to display all rows) 
		