package org.hl7.fhir.type;

import org.hl7.fhir.primitivetype.IntegerType;

import lombok.Data;

@Data
public class ValueInteger extends ValueType{

	private IntegerType value;
}
