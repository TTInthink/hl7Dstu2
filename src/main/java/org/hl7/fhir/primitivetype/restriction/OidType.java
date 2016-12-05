package org.hl7.fhir.primitivetype.restriction;

import java.io.Serializable;

import org.hl7.fhir.primitivetype.UriType;
import org.hl7.fhir.primitivetype.validator.OidTypeValidator;
/*An OID represented as a URI (RFC 3001 ); e.g. urn:oid:1.2.3.4.5*/ 
public class OidType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3019870619149006593L;
	
	private UriType value;
	
	public OidType(UriType value){
		setValue(value);
		
	}

	public UriType getValue() {
		return value;
	}

	public void setValue(UriType value) {
		System.out.println("----VALUE: "+value.getValue().toString());
		OidTypeValidator.getInstance().isValid(value.getValue().toString());
		this.value = value;
	}

	

}
