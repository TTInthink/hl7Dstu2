package org.hl7.fhir.type;

import org.hl7.fhir.complextype.Address;


public class ValueAddress extends ValueType{

	private Address value;

	public Address getValue() {
		return value;
	}

	public void setValue(Address value) {
		this.value = value;
	}
	
}
