package Assgn1C;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindingLargestDigitTest {

	@Test
	public void testLargestDigit(){
		FindingLargestDigit ob =new FindingLargestDigit();
		
		assertEquals(2, ob.largestDigit(2));
		assertEquals(9, ob.largestDigit(1257369));
		assertEquals(4, ob.largestDigit(444));
		assertEquals(-1, ob.largestDigit(-5425));
	}
}
