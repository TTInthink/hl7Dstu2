package org.hl7.fhir.primitivetype.validator;

import static org.junit.Assert.*;

import org.junit.Test;


public class OidTypeValidatorTest {
	
	@Test
	public void testOidType() {
		boolean valid=OidTypeValidator.getInstance().isValid("urn:oid:1.2.32222");
		System.out.println("Valid: "+valid);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNullOidType() {
		boolean valid=OidTypeValidator.getInstance().isValid(null);
		fail("Should not run here: ");
	}
}
