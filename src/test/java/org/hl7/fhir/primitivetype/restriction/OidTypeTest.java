package org.hl7.fhir.primitivetype.restriction;

import java.net.URI;
import java.net.URISyntaxException;

import org.hl7.fhir.primitivetype.UriType;
import org.hl7.fhir.primitivetype.validator.OidTypeValidator;
import org.junit.Test;

public class OidTypeTest {

	@Test
	public void testOidType() throws URISyntaxException {
		UriType value=new UriType(new URI("urn:oid:1.2.3.4.5"));
		OidType type=new OidType(value);
	}
}
