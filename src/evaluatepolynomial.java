import java.util.Scanner;

public class evaluatepolynomial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//set scanner 
		Scanner sc = new Scanner(System.in);

		//prompt user to set double variable 
		System.out.print("What is the value of x: ");
		double x = sc.nextDouble();
		
		//calculate the result of the polynomial using the prompted double #
		double p = (((1.0/3.0) * (x*x)-(3.0/5.0) * x) + (5.0/7.0));
		
		//explicit conversion of my double p into a float (pf = polynomial float)
		float pf = (float)p;
		
		/*print out f([x value]) = [result value] in my console 
		 * ("function f(" + x + "))=" + pf) is basically saying that it 
		 * will print function f of x where x is the input because there is a 
		 * statement inside of the initial statement (" + x +") that is telling 
		 * the console to print whatever input is put in for x and sub it into
		 * that part of the statement. you can add statements inside of statements
		 * as long as "" are used appropriately. also you need the + inside
		 * because it is telling the "" to "add" itself to the "", if not it 
		 will cause a syntax error */
		System.out.println("function f(" + x + "))=" + pf);
		
		sc.close();
		
	}

}
