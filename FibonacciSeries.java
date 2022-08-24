package logicprograms;

/*Fibonacci series is a special type of series in which the next term is the sum of the previous two terms. 
 * For example, if 0 and 1 are the two previous terms in a series, then the next term will be 1(0+1).
 */

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		int n = 0;
		FibonacciSeries fib = new FibonacciSeries();
		System.out.println("Welcome to Fibonacci Series Program!");
		System.out.print("\nEnter the number of elements you want to print in the series : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		System.out.println("\nFibonacci Series : ");
		fib.printFibonacci(n);
		sc.close();
	}
	
	public void printFibonacci(int elements) {
		int sum = 0;
		int previous = 0;
		int next = 0;
		
		System.out.print("0	1	");
		previous = 0;
		next = 1;

		for(int i = 0; i < elements; i++) {
			sum = previous + next;
			System.out.print(sum+"	");
			previous = next;
			next = sum;
		}
	}
	
}
