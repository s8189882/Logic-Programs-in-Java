package logicprograms;

import java.util.Scanner;

/*the Perfect Number is also a special type of positive number. 
 * When the number is equal to the sum of its positive divisors excluding the number, 
 * it is called a Perfect Number. 
 * For example, 28 is the perfect number because when we sum the divisors of 28, 
 * it will result in the same number. The divisors of 28 are 1, 2, 4, 7, and 14. So,
 * 28 = 1+2+4+7+14 
 * 28=28
 */

public class PerfectNumber {

	public static void main(String[] args) {
		int number = 0;
		int sum =  0;

		System.out.println("Welcome to the Perfect Number Program!");
		System.out.println("This program checks whether the input number is a Perfect number or not.");
		System.out.print("\nEnter a number : ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();	
		for(int i =  1; i< number; i++) 
			if (number%i == 0)
				sum += i;
		
		if (sum == number)
			System.out.println("\n"+number+" is a  Perfect number.");
		else
			System.out.println("\n"+number+" is not a  Perfect number.");
		sc.close();
	}
}
