package Assgn1A;

import java.util.Scanner;

public class MainFindingRemainder {

	public static void main(String[] args) {
		FindingRemainder ob = new FindingRemainder();
		Scanner sc = new Scanner(System.in);
		int dividend, divisor;
		System.out.print("Enter the values for Dividend & Divisor : ");
		dividend = sc.nextInt();
		divisor = sc.nextInt();
		System.out.println( ob.getRemainder(dividend, divisor));
		sc.close();
	}

}
				