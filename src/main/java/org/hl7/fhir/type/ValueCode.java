package org.hl7.fhir.type;

import org.hl7.fhir.primitivetype.restriction.CodeType;

import lombok.Data;

@Data
public class ValueCode extends ValueType{

	private CodeType value;
}
