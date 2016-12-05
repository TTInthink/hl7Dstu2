package org.hl7.fhir.primitivetype.restriction;

import java.io.Serializable;

import org.hl7.fhir.primitivetype.validator.UnsignedIntTypeValidator;

public class PositiveIntType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1926992649168806685L;
	
	public PositiveIntType(){}
	
	private Integer value;
	
	public PositiveIntType(Integer value){
		setValue(value);
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		UnsignedIntTypeValidator.getInstance().isValid(value.toString());
		this.value = value;
	}
	
	
}
