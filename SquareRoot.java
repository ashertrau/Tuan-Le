package HW;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		
		double n, x = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		n = input.nextInt();
		
		x = squareRoot(n, x);
		
		System.out.println("Square root of " + n + " is: " + x);
	}
	
	public static double squareRoot( double n, double x) {
		
		for (double i = 1; i < n; i++) {
			x = ( x + n / x ) / 2;
		}
		
		return x;
	}
}
