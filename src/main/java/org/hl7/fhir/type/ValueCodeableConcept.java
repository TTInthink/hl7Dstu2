package org.hl7.fhir.type;

import org.hl7.fhir.complextype.CodeableConcept;

import lombok.Data;

@Data
public class ValueCodeableConcept extends ValueType{

	private CodeableConcept value;
}
