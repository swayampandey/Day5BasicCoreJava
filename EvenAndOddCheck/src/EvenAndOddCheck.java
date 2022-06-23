import java.util.Scanner;
public class EvenAndOddCheck {

	public static void main(String[] args) {
		/*
		 * Taking input from user
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
		// TODO Auto-generated method stub

	}

}
