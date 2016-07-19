package Assgn1A;

public class FindingRemainder {
	/**
	 * This method is used to get remainder of two numbers
	 * using Recursion 
	 * @param dividend 
	 * @param divisor
	 * @return It returns remainder as an integer value
	 */
	public int getRemainder( int dividend, int divisor)
	{
		int rem=0;
		if( !(dividend >= 0) || !(divisor > 0) ) 
		{
			System.out.println("Enter Valid Input");
		}
		else
		{
			if( dividend < divisor)
			{
				rem = dividend;
			}
			else
			{
				return getRemainder(dividend-divisor, divisor);
			}
					
		}
		return rem;
			
	}
}
