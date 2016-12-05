package org.hl7.fhir.type;

import org.hl7.fhir.complextype.Identifier;

import lombok.Data;

@Data
public class ValueIdentifier extends ValueType{

	private Identifier value;
}
