/*
 * Flip Coin and print percentage of Heads and Tails
 */

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		
		int heads=0;
		int tails=0;
		int count=1;
		double Random=0.0;
		/*
		 * Taking user input
		 */
		System.out.println("Enter the number  ");
		Scanner n = new Scanner(System.in);
		int flips = n.nextInt();
		
		while (count <= flips) {
			Random = Math.random();
			System.out.println(count+ " " +Random);
			if (Random < 0.5) {
				heads++;
				System.out.println("heads");
			}
			else {
				tails++;
				System.out.println("tails");
			}
				count++;
		}
			System.out.println("Number of Heads : " +heads);
			System.out.println("Number of Tails : " +tails);
			
			double headpercentage = (double)heads/flips*100;
			double tailpercentage = (double)tails/flips*100;
			
			
			System.out.println("Percentage of Heads = " +headpercentage);
			System.out.println("Percentage of Tails = " +tailpercentage);
			
		}
		

	}


