package org.hl7.fhir.type;

import org.hl7.fhir.primitivetype.InstantType;

import lombok.Data;

@Data
public class ValueInstant extends ValueType{

	private InstantType value;
	
}
