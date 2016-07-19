package Assgn1B;

public class FindingGCD
{
	/**
	 * This method calculates GCD of two numbers using recursion
	 * @param first The first number
	 * @param second The second number
	 * @return It returns GCD value as an integer
	 */
	public int getGCD(int x, int y)
	{
		if( !(x>0) || !(y>0) )
		{
			System.out.println("Enter Numbers greater than Zero");
			return -1;
		}
		else
		{
			int rem = x % y;
			if(rem == 0)
			{
				return y;
			}
			else
			{
				return  getGCD(y, rem);
			}
		}

	}
}
