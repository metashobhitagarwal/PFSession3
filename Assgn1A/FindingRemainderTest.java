package Assgn1A;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindingRemainderTest {

	@Test
	public void testGetRemainder() {
		FindingRemainder ob = new FindingRemainder();
		assertEquals(0, ob.getRemainder(2, 1));
		assertEquals(0, ob.getRemainder(2, 0));
		assertEquals(1, ob.getRemainder(100, 3));
	}

}