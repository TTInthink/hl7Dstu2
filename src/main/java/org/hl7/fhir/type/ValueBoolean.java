package org.hl7.fhir.type;

import org.hl7.fhir.primitivetype.BooleanType;

import lombok.Data;

@Data
public class ValueBoolean extends ValueType{

	private BooleanType value;
}
