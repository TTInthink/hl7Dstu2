package org.hl7.fhir;


import org.hl7.fhir.primitivetype.StringType;

import lombok.Data;

public class Reference {

	private StringType reference;
	private StringType display;
	public StringType getReference() {
		return reference;
	}
	public void setReference(StringType reference) {
		this.reference = reference;
	}
	public StringType getDisplay() {
		return display;
	}
	public void setDisplay(StringType display) {
		this.display = display;
	}
	
}
