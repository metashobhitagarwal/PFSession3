package Assgn1B;

import java.util.*;

public class MainFindingGCD {

	public static void main(String[] args)
	{
		FindingGCD ob = new FindingGCD();
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.print("Enter any two Nos : ");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println( ob.getGCD(x, y));
		sc.close();
	}

}
