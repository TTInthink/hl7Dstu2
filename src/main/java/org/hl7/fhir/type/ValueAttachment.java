package org.hl7.fhir.type;

import org.hl7.fhir.complextype.Attachment;

public class ValueAttachment extends ValueType{

	private Attachment value;

	public Attachment getValue() {
		return value;
	}

	public void setValue(Attachment value) {
		this.value = value;
	}
	
	
}
