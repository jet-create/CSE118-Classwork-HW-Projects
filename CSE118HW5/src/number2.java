import java.util.Random;

public class number2 {

	public static void main(String[] args) {

	
		Random r = new Random();
	
		/*(a)	Generate 3 randoms in range [1, 100]. Store these numbers in variables 
		a, b, and c */
		int a = r.nextInt(1, 101);
		int b = r.nextInt(1, 101);
		int c = r.nextInt(1, 101);
		//displace a, b, c
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		/*(b)	Find the greatest number and the smallest number from a, b, and c. Display 
		message: “The greatest number is {value}. The smallest number is {value}”.
		math.max and math.min to find the greater and smallest #*/
		int greatest = Math.max(Math.max(a, b), c);
		int smaller = Math.min(Math.min(a, b), c);
		//print
		System.out.println(greatest+" is the greatest number.");
		System.out.println(smaller+" is the smallest number.");

		}
	}


