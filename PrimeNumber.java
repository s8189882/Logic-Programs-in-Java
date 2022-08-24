package logicprograms;

import java.util.Scanner;

/*Just like the Perfect number, the Prime number is also a special type of number. 
 * When the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime number. 
 * 0 and 1 are not counted as prime numbers. 
 * All the even numbers can be divided by 2, so 2 is the only even prime minister.
 */

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 0;
		boolean prime = false;
		PrimeNumber objectp = new PrimeNumber();
		
		System.out.println("Welcome to the Prime Number Program!");
		System.out.println("This program checks whether the input number is Prime or not.");
		System.out.print("\nEnter a number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		prime = objectp.primeCheck(num);
		objectp.displayResult(num, prime);
		sc.close();	
	}
	
	public boolean primeCheck(int number) {
		int check = 0;
		
		if(number%2 == 0 && number != 2)
			check++;
		else
			for(int i = 3; i < number;i=i+2)
				if (number%i == 0)
					check++;
		
		return ((check == 0) ? true : false);
	}
	
	public void displayResult(int number, boolean result) {
		if (result) 
			System.out.println("\n"+number+" is a Prime Number.");
		else
			System.out.println("\n"+number+" is not a Prime Number.");
	}
}
