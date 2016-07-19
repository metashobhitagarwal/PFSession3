package Assgn1B;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindingGCDTest {
		@Test
		public void testGetGCD(){
			
			FindingGCD compGCD=new FindingGCD();
			assertEquals(1, compGCD.getGCD(2, 1));
			assertEquals(6, compGCD.getGCD(12, 18));
			assertEquals(1, compGCD.getGCD(100, 3));
			assertEquals(-1, compGCD.getGCD(-54, 7));
		}
		
	}