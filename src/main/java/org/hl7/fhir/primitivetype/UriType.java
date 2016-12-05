package org.hl7.fhir.primitivetype;

import java.io.Serializable;
import java.net.URI;

public class UriType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3248951276910480512L;

	private URI value;
	
	public UriType(){}
	
	public UriType(URI value){
		this.value=value;
	}

	public URI getValue() {
		return value;
	}

	public void setValue(URI value) {
		this.value = value;
	}
	
	
}
