package org.hl7.fhir.primitivetype;

import java.io.Serializable;
import java.time.LocalTime;

public class TimeType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -16889848968783015L;

	private LocalTime value;

	public TimeType(){}
	
	public TimeType(LocalTime value){
		this.value=value;
	}

	public LocalTime getValue() {
		return value;
	}

	public void setValue(LocalTime value) {
		this.value = value;
	}
	
	
}
