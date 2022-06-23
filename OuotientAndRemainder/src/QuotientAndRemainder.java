import java.util.Scanner;

public class QuotientAndRemainder {
		public static void main(String[] args) {
			/*
			 * Taking input from user
			 */
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Divident:");
			int Divident = sc.nextInt();
			System.out.println("Enter Divisor:");
			int Divisor = sc.nextInt();
			int quotient= Divident / Divisor;
			int remainder= Divident % Divisor;
			System.out.println("Quotient=" +quotient);
			System.out.println("Remainder=" +remainder);
		
		// TODO Auto-generated method stub

	}

}
