package org.hl7.fhir.primitivetype.restriction;

import java.io.Serializable;

import org.hl7.fhir.primitivetype.validator.IdTypeValidator;

public class IdType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4568867791001892244L;
	
	private String value;
	
	public IdType(String value){
		setValue(value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		IdTypeValidator.getInstance().isValid(value);
		this.value = value;
	}

}
