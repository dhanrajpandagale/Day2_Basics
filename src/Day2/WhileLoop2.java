package Day2;

import java.util.Scanner;

public class WhileLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0, rem=0;
		// taking input
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		sc.close();
		
		while(a>0) {
			 rem= a%10;
		     rev= rev*10+rem;
		     a=a/10;
		}
			System.out.print(rev);

	}

}