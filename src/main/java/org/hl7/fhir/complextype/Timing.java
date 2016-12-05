package org.hl7.fhir.complextype;

import java.util.List;

import org.hl7.fhir.primitivetype.DateTimeType;
import org.hl7.fhir.primitivetype.restriction.controlledstring.TimingAbbreviation;
import org.hl7.fhir.type.Element;

public class Timing extends Element{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5888825489234470301L;

	private List<DateTimeType> event;
	
	private TimingRepeatComponent repeat;

	private CodeableConcept code;

	public List<DateTimeType> getEvent() {
		return event;
	}

	public void setEvent(List<DateTimeType> event) {
		this.event = event;
	}

	public TimingRepeatComponent getRepeat() {
		return repeat;
	}

	public void setRepeat(TimingRepeatComponent repeat) {
		this.repeat = repeat;
	}

	public CodeableConcept getCode() {
		return code;
	}

	public void setCode(CodeableConcept code) {
		this.code = code;
	}
	
}
