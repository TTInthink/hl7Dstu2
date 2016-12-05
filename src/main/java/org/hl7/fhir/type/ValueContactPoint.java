package org.hl7.fhir.type;

import org.hl7.fhir.complextype.ContactPoint;

import lombok.Data;

@Data
public class ValueContactPoint extends ValueType{

	private ContactPoint value;
}
