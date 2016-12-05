package org.hl7.fhir.primitivetype;

import java.io.Serializable;

public class BooleanType implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8098413028615148101L;
	
	private Boolean value;
	
	public BooleanType(){}
	public BooleanType(Boolean value){
		this.value=value;
	}

	public Boolean isValue() {
		return value;
	}

	public void setValue(Boolean value) {
		this.value = value;
	}
	
	
	
}
