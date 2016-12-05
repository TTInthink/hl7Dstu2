package org.hl7.fhir;

import org.hl7.fhir.complextype.Duration;

import lombok.Data;

@Data
public class BoundsQuantityType extends BoundsChoiceType{

	private Duration boundsQuantity;
}
