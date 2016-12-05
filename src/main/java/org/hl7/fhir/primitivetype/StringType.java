package org.hl7.fhir.primitivetype;

import java.io.Serializable;

import org.hl7.fhir.primitivetype.validator.FileSize1MValidator;

public class StringType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1372548283581188998L;
	
	private String value;
	public static final int MAX_LENGTH=1000*1024; //1MB size
	
	public StringType(){}
	
	public StringType(String value){
		validateValue(value);
		this.value=value;
	}
	
	private void validateValue(String value){
		boolean validValue=FileSize1MValidator.getInstance().isValid(value);
		if(!validValue){
			throw new IllegalArgumentException("strings SHALL NOT exceed 1MB in size");
		}
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
