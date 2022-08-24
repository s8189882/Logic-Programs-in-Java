package logicprograms;

import java.util.Scanner;

/*In Java, we can reverse a number either by using for loop, while loop, or using recursion. 
 * The simplest way to reverse a number is by using for loop or while loop. 
 * In order to reverse a number, we have to follow the following 
 * steps:We need to calculate the remainder of the number using the modulo 
 * After that, we need to multiply the variable reverse by 10 and add the remainder into it. 
 * We then divide the number by 10 and repeat steps until the number becomes 0.
 */

public class ReverseNumber {

	public static void main(String[] args) {
		
		int originalNumber = 0;
		int quotient = 0;
		int mod = 0;
		int reverseNumber = 0;
		
		System.out.println("Welcome to Reverse Number Program!");
		System.out.println("This program will reverse the number you enter.");
		System.out.print("\nEnter a number : ");
		Scanner sc = new Scanner(System.in);
		originalNumber = sc.nextInt();
		
		quotient = originalNumber;		
		while(quotient != 0) {
			mod = quotient%10;
			reverseNumber = (reverseNumber*10)+mod;
			quotient = quotient/10;
		}
		
		System.out.println();
		System.out.println("Result after Reversal");
		System.out.println("Original Number :	"+originalNumber);
		System.out.println("Reverse Number :	"+reverseNumber);
	}
}
