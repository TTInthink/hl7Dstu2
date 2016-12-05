package org.hl7.fhir.type;

import org.hl7.fhir.complextype.Range;

import lombok.Data;

@Data
public class ValueRange extends ValueType{

	private Range value;
}
