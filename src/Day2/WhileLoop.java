package Day2;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int i =0;
		while (i<=N) {
			 sum= sum+i;
			i++;
		}
		System.out.println("Sum of given number = " +sum);

	}

}