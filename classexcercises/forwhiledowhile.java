package classexcercises;

import java.util.Scanner;

public class forwhiledowhile {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		/*System.out.println("Enter two positive integers: ");
		int n = s.nextInt();
		int m = s.nextInt();
		
		int gcd = 1;
		for (int i=2; i<Math.min(m/2, n/2); i++) {
			if (n%i==0 && m%i==0);
				gcd = i;
		}
		*/
		double tuition = 10000;
		int year = 0;
		/*while (tuition<20000) {
			tuition*=1.07;
			year++;
		}
		System.out.printf("tuition is doubled in %d\n", year);
		*/
		/*for (year=0;tuition<20000;year++) {
			tuition*=1.07;
		}
		System.out.printf("tuition is doubled in %d years\n", year);
		*/
		/*do {
			tuition*=1.07;
			year++;
		} 
		while (tuition<20000);
		
		System.out.printf("tuition is doubled in %d years\n", year);
		 */
	
		
		/*num: (random number however long)
		 sum = 0;
		 n = the #
		 d = n%10
		 sum+=d
		 n = n/10 //leaves new digit
		 done when n<=0
		 set up count to see how many digits are < 5
		 
		 return reverse number
		 extract the numbers
		 m = 0
		 m = m*10+d0 //first num
		 m = m*10+d1 //sec num
		 etc...
		 done when n=0
		*/
		
		/*System.out.println("Enter a number: ");
		int n = s.nextInt();
		int n2=n;
		int d;
		int d2;
		int sum;
		int count = 0;
		for (sum=0;n!=0;n=n/10) {
			d=n%10;
			sum+=d;
		}
		while (n2>0) {
			 d2=n2%10;
			 n2/=10;
			 if(d2<5) {
				 count++;
			 }
			
		}
		
		System.out.printf("sum of all ints is %d\n", sum);
		System.out.printf("%d numbers less than 5\n", count);
		*/
		
		/*System.out.println("Enter a number: ");
		int num = s.nextInt();
		
		int digit;
		int rNum=0;
		while(num!=0) {
			digit=num%10;
			rNum=rNum*10+digit;
			num/=10;
		}
		System.out.printf("new num is %d", rNum);
		*/
		
		/*int table = 12;
		
		for(int i=1; i<=table; i++) {
			for(int j=1; j<=table; j++) {
				int product = i * j;
				System.out.printf("%3d", product);
			}
			
			System.out.println();
		}
		*/
		
		
		
		
	}

}
