package org.hl7.fhir.primitivetype;

import java.io.Serializable;

public class IntegerType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3140072100031801638L;
	
	private Integer value;
	
	public IntegerType(){}
	
	public IntegerType(Integer value){
		this.value=value;
	}
	
	
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	
	
}
