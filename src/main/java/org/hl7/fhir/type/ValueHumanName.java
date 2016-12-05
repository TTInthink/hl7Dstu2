package org.hl7.fhir.type;

import org.hl7.fhir.complextype.HumanName;

import lombok.Data;

@Data
public class ValueHumanName extends ValueType{

	private HumanName value;
	
}
