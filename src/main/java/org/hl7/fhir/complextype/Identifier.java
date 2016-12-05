package org.hl7.fhir.complextype;


import org.hl7.fhir.Reference;
import org.hl7.fhir.primitivetype.StringType;
import org.hl7.fhir.primitivetype.UriType;
import org.hl7.fhir.primitivetype.restriction.CodeType;
import org.hl7.fhir.primitivetype.restriction.controlledstring.IdentifierUse;
import org.hl7.fhir.type.Element;


public class Identifier extends Element{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -2516105213122881305L;

	private CodeType<IdentifierUse> use;
	
	private CodeableConcept type;
	
	private UriType system;
	private StringType value;
	
	private Period period;
	
	private Reference assigner;

	public CodeType<IdentifierUse> getUse() {
		return use;
	}

	public void setUse(CodeType<IdentifierUse> use) {
		this.use = use;
	}

	public CodeableConcept getType() {
		return type;
	}

	public void setType(CodeableConcept type) {
		this.type = type;
	}

	public UriType getSystem() {
		return system;
	}

	public void setSystem(UriType system) {
		this.system = system;
	}

	public StringType getValue() {
		return value;
	}

	public void setValue(StringType value) {
		this.value = value;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	public Reference getAssigner() {
		return assigner;
	}

	public void setAssigner(Reference assigner) {
		this.assigner = assigner;
	}
	
}
