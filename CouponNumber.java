package logicprograms;

import java.util.Scanner;

/*Desc -> Given N distinct Coupon Numbers, how many random numbers do you need to generate a distinct coupon number? 
 * This program simulates this random process.
 * I/P -> N Distinct Coupon Number Logic -> repeatedly choose a random number and check whether it's a new one. 
 * O/P -> total random number needed to have all distinct numbers. 
 * Functions => Write Class Static Functions to generate random numbers and to
 * process distinct coupons.
 */

public class CouponNumber {
	static String[] couponArray;
	
	public static void main(String[] args) {
		String str = "";
		
		System.out.println("Welcome to the Coupon Number Program!");
		System.out.println("This program will generate distinct Coupon Numbers.");
		System.out.print("\nEnter the number of Coupons to be generated : ");
		Scanner sc=new Scanner(System.in);
		int coupons = sc.nextInt();
		couponArray = new String[coupons];
		System.out.println();
		for(int counter = 0; counter < coupons; counter++) {
			str = generateCoupon();
			System.out.println("Coupon Number "+(counter+1)+" :	"+str);
		}
		sc.close();
	}
	
	static String generateCoupon() {
		String str = "";
		
		for(int counter = 0; counter <= 4; counter++) {
			int randomDigit = (int)(Math.random()*10);
			str = str + randomDigit;
		}
		String checkedDuplicacy = checkCoupons(str);
		
		return checkedDuplicacy;
	}
	
	static String checkCoupons(String newCoupon) {
		int check = 0;
		
		for(String existing : couponArray) 
			if (newCoupon == existing)
				check++;
		if (check != 0)
			generateCoupon();
		
		return newCoupon;	
	}
}
