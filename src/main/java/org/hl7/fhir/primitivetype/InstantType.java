package org.hl7.fhir.primitivetype;

import java.io.Serializable;
import java.time.OffsetDateTime;

public class InstantType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1927838442011367670L;
	
	private OffsetDateTime value;
	
	public InstantType(){}
	
	public InstantType(OffsetDateTime value){
		this.value=value;
	}

	public OffsetDateTime getValue() {
		return value;
	}

	public void setValue(OffsetDateTime value) {
		this.value = value;
	}
	
	

}
