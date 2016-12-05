package org.hl7.fhir.type;

import org.hl7.fhir.primitivetype.DateType;

import lombok.Data;

@Data
public class ValueDate extends ValueType{

	private DateType value;
}
