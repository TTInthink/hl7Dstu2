package org.hl7.fhir.complextype;

import org.hl7.fhir.primitivetype.restriction.CodeType;
import org.hl7.fhir.primitivetype.restriction.controlledstring.QuantityComparator;

public class SimpleQuantity extends Quantity{


	/**
	 * 
	 */
	private static final long serialVersionUID = -422821762037971797L;

	public CodeType<QuantityComparator> getComparator() {
		throw new UnsupportedOperationException("Comparator not supported in Simplate Quantity");
	}

	public void setComparator(CodeType<QuantityComparator> comparator){
		throw new UnsupportedOperationException("Comparator not supported in Simplate Quantity");
	}
	
	
}
