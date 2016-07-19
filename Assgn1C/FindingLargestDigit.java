package Assgn1C;

public class FindingLargestDigit {
/**
 * This method returns the largest digit
 * from an integer number
 * @param num
 * @return Returns largest digit from the given integer value
 * @return Returns -1 if number entered is less than 0
 */
	public int largestDigit(int num)
	{
		int rem= 0;
		int check= 0;
		if(num == 0)
		{
			return 0;
		}
		else if(num < 0)
		{
			System.out.println("Number is Negative");
			return -1;
		}
		else
		{
			rem= num % 10;
			check= largestDigit(num / 10);
			if(rem > check)
			{
				return rem;
			}
			else
			{
				return check;
			}	
		}
	}
}
