package org.hl7.fhir.primitivetype.restriction;

import java.io.Serializable;

import org.hl7.fhir.primitivetype.validator.UnsignedIntTypeValidator;

public class UnsignedIntType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8560753939026187235L;
	
	private Integer value;
	
	public UnsignedIntType(Integer value){
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
