import java.util.Scanner;

/*
 * checking the entered year by user  is leap year or not 
 */

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		System.out.println("Enter any year ");
		
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		
		if (year%100==0 && year%400==0 || year%100!=0  && year%4==0)
		{
			System.out.println("Leap Year");
		}
		
		else {
			System.out.println("Not Leap Year");
			
		}
		
	}

}
