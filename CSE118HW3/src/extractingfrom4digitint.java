import java.util.Scanner;

public class extractingfrom4digitint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Extract digits from: ");
		int x = sc.nextInt();
		
		//thousands place
		int no3 = (x/1000);
		System.out.println("no3 = "+no3);
		//hundreds place
		int no2 = (x /100) % 10;
		System.out.println("no2 = "+no2);
				
		//tens place
		int no1 = (x % 100) / 10; 
		System.out.println("no1 = "+no1);				
		
		//ones place
		int no0 = (x % 10);
		System.out.println("no0 = "+no0);
		
		//reverse the order
		int reversed = no0 * 1000 + no1 * 100 + no2 * 10 + no3;
		
		System.out.println("Number reversed is " + reversed);
		
		sc.close();

	}

}
