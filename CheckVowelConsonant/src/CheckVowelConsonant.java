import java.util.Scanner;
public class CheckVowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Taking input from user
		 */
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any character");
		ch = sc.next().charAt(0);
		if (ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
			
		
				
				System.out.println("Character is vowel");
		}
			
			else {
				System.out.println("Character is consonant");
			}

	}

}
