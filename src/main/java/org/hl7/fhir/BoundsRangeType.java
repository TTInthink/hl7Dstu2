package org.hl7.fhir;

import org.hl7.fhir.complextype.Range;

import lombok.Data;

@Data
public class BoundsRangeType extends BoundsChoiceType{

	private Range boundsRange;
}
