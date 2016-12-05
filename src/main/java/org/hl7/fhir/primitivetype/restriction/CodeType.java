package org.hl7.fhir.primitivetype.restriction;

import java.io.Serializable;

import org.hl7.fhir.primitivetype.validator.CodeTypeValidator;

public class CodeType<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1553275522795194570L;
	
	public CodeType(){};

	private T value;
	
	public CodeType(T value){
		setValue(value);
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		boolean valid=CodeTypeValidator.getInstance().isValid(value.toString());
		if(!valid){
			throw new IllegalArgumentException("a string which has at least one character and no leading or trailing whitespace, and where there is no whitespace other than single spaces in the contents");
		}
		this.value = value;
	}
	
	
}
