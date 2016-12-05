package org.hl7.fhir.type;

import org.hl7.fhir.complextype.Coding;

import lombok.Data;

@Data
public class ValueCoding extends ValueType{

	private Coding value;
}
