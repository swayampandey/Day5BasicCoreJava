import java.util.Scanner;

public class Powerof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		Scanner u=new Scanner(System.in);
		
        int num=u.nextInt();
        System.out.println("Power of 2^"+num+" is: "+(Math.pow(2, num)));
        System.out.println();
        System.out.println("Printing all till Power Value "+num);
        
        for(int i=1;i<=num;i++)
        {
         	System.out.println("Power of 2^"+i+" is: "+(Math.pow(2, i)));	


	}
	   }
}

