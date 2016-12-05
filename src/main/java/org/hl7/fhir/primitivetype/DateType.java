package org.hl7.fhir.primitivetype;

import java.io.Serializable;
import java.time.LocalDate;

public class DateType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7325183028120851904L;

	private LocalDate value;
	
	public DateType(){}
	public DateType(LocalDate value){
		this.value=value;
	}

	public LocalDate getValue() {
		return value;
	}

	public void setValue(LocalDate value) {
		this.value = value;
	}
	
}
