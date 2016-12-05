package org.hl7.fhir.primitivetype;

import java.io.Serializable;
import java.math.BigDecimal;

public class DecimalType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7591673604832887576L;

	private BigDecimal value;
	
	public DecimalType(){}
	
	public DecimalType(BigDecimal value){
		this.value=value;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}
	
	
}
