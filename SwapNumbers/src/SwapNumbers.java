import java.util.Scanner;
public class SwapNumbers {

	public static void main(String[] args) {
		System.out.println("Before Swapping");
		/*
		 * Taking user input
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number =");
		int a = sc.nextInt();
		System.out.println("Enter Second Number =");
		int b = sc.nextInt();
		/*
		 * Value of first number is assigned to temporary
		 */
		int temporary= a;
		/*
		 * Value of first number is assigned to second number
		 */
		a=b;
		/*
		 * Value of temporary is assigned to second number
		 */
		b= temporary;
		// TODO Auto-generated method stub
		System.out.println("After Swapping");
		System.out.println("First number =" +a);
		System.out.println("Second number =" +b);

	}

}
