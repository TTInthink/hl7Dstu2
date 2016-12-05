package org.hl7.fhir.primitivetype;

import java.io.Serializable;

public class Base64BinaryType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3560561924553464834L;
	private byte[] value;
	
	public Base64BinaryType(){}
	
	public Base64BinaryType(byte[] value){
		this.value=value;
	}

	public byte[] getValue() {
		return value;
	}

	public void setValue(byte[] value) {
		this.value = value;
	}
	
	

}
