package org.hl7.fhir.complextype;

import org.hl7.fhir.primitivetype.DateTimeType;
import org.hl7.fhir.type.Element;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Period extends Element{

	private DateTimeType start;
	
	private DateTimeType end;

	public DateTimeType getStart() {
		return start;
	}

	public void setStart(DateTimeType start) {
		this.start = start;
	}

	public DateTimeType getEnd() {
		return end;
	}

	public void setEnd(DateTimeType end) {
		this.end = end;
	}
	
	
}
