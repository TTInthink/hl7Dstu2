package org.hl7.fhir.complextype;

import org.hl7.fhir.type.Element;

public class Ratio extends Element{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4254933139989706602L;

	private Quantity numerator;
	
	private Quantity denominator;

	public Quantity getNumerator() {
		return numerator;
	}

	public void setNumerator(Quantity numerator) {
		this.numerator = numerator;
	}

	public Quantity getDenominator() {
		return denominator;
	}

	public void setDenominator(Quantity denominator) {
		this.denominator = denominator;
	}
	
	
}
