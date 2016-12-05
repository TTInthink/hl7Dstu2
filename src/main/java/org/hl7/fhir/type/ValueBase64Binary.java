package org.hl7.fhir.type;

import org.hl7.fhir.primitivetype.Base64BinaryType;


public class ValueBase64Binary extends ValueType{

	private Base64BinaryType value;

	public Base64BinaryType getValue() {
		return value;
	}

	public void setValue(Base64BinaryType value) {
		this.value = value;
	}
	
	
}
