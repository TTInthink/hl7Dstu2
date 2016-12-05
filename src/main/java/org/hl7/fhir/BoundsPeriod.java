package org.hl7.fhir;

import org.hl7.fhir.complextype.Period;

import lombok.Data;

@Data
public class BoundsPeriod extends BoundsChoiceType{

	private Period boundsPeriod;
}
