package org.hl7.fhir.type;

import org.hl7.fhir.primitivetype.StringType;

import lombok.Data;

@Data
public class ValueString extends ValueType{

	private StringType value;
}
