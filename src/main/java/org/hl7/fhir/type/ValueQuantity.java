package org.hl7.fhir.type;

import org.hl7.fhir.complextype.Quantity;

import lombok.Data;

@Data
public class ValueQuantity extends ValueType{

	private Quantity value;
}
