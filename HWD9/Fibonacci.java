package HW;

import java.util.Iterator;

public class Fibonacci {
	public static void main(String[] args) {

		int num = 10 ;

		int f = fibonacci(num);

		System.out.println("Fibonacci of " + num + " = " + f);

	}

	public static int fibonacci(int num) {

		if (num <= 1)
			return num; // 1 step
		
		int[] fibo = new int[num + 1]; // 1 step
		fibo[0] = 0; // 1 step
		fibo[1] = 1; // 1 step
		
		for (int i = 2; i < fibo.length; i++) { // n step
			fibo[i] = fibo[i - 1] + fibo [i - 2];
		}
		return fibo[num]; // 1 step
		// -> O(n)
		
		
	
//		if (num <= 1) {
//			return num;
//		} else {
//			return fibonacci(num - 1) + fibonacci(num - 2);
//		}
	}
}
