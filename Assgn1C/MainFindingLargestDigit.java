package Assgn1C;

import java.util.*;

public class MainFindingLargestDigit {

	public static void main(String[] args)
	{
		FindingLargestDigit ob = new FindingLargestDigit();
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter any integer value : ");
		num = sc.nextInt();
		System.out.println( ob.largestDigit(num));
		sc.close();
	}

}
