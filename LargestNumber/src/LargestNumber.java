/*
 * Java Program to Find the Largest Among Three Numbers by taking user input
 */

import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,largest;
		/*
		 * Taking input from user
		 */
		Scanner num = new Scanner(System.in);
		System.out.println("Enter First Number");
		 a =num.nextInt();
		System.out.println("Enter Second Number");
		 b = num.nextInt();
		System.out.println("Enter Third Number");
		 c = num.nextInt();
		num.close();
		
		
		if ( a>b  && a>c )
			largest = a;
		
		else if ( b>a && b>c)
			largest = b;
		else
			largest = c;
		System.out.println("Largest Number is  " +largest);
	}

}
