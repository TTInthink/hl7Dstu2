package org.hl7.fhir.primitivetype;

import java.io.Serializable;
import java.time.LocalDateTime;

public class DateTimeType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1936317498538820485L;

	private LocalDateTime value;
	
	public DateTimeType(){}
	
	public DateTimeType(LocalDateTime value){
		this.value=value;
	}

	public LocalDateTime getValue() {
		return value;
	}

	public void setValue(LocalDateTime value) {
		this.value = value;
	}
	
}
