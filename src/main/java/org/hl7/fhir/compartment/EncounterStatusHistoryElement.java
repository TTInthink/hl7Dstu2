package org.hl7.fhir.compartment;

import org.hl7.fhir.complextype.Period;
import org.hl7.fhir.primitivetype.restriction.CodeType;
import org.hl7.fhir.primitivetype.restriction.controlledstring.EncounterState;

public class EncounterStatusHistoryElement extends BackboneElement{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4452862449440198244L;
	private CodeType<EncounterState> status;
	private Period period;
	public CodeType<EncounterState> getStatus() {
		return status;
	}
	public void setStatus(CodeType<EncounterState> status) {
		this.status = status;
	}
	public Period getPeriod() {
		return period;
	}
	public void setPeriod(Period period) {
		this.period = period;
	}
	
	
}
