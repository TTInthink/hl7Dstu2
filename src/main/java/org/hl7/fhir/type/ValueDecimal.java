package org.hl7.fhir.type;

import org.hl7.fhir.primitivetype.DecimalType;

import lombok.Data;

@Data
public class ValueDecimal extends ValueType{

	private DecimalType value;
}
