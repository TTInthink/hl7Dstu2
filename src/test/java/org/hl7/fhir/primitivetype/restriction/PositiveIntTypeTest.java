package org.hl7.fhir.primitivetype.restriction;

import org.junit.Test;

public class PositiveIntTypeTest {
	
	@Test
	public void testPositiveIntType(){
		PositiveIntType positiveType=new PositiveIntType(1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeIntType(){
		PositiveIntType positiveType=new PositiveIntType(-1);
	}
	
//	@Test(expected = IllegalArgumentException.class)
//	public void testZeroType(){
//		PositiveIntType positiveTyp1e=new PositiveIntType(0000);
//	}
	}