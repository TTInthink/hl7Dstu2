package org.hl7.fhir.complextype;

import java.io.Serializable;
import java.util.List;

import org.hl7.fhir.primitivetype.StringType;
import org.hl7.fhir.primitivetype.restriction.CodeType;
import org.hl7.fhir.primitivetype.restriction.PositiveIntType;
import org.hl7.fhir.primitivetype.restriction.controlledstring.ContactPointSystem;
import org.hl7.fhir.primitivetype.restriction.controlledstring.ContactPointUse;
import org.hl7.fhir.type.Element;

public class ContactPoint extends Element{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4034619880393107947L;
//ContactPointSystem
	private CodeType<ContactPointSystem> system;
	
	private StringType value;
	//ContactPointUse
	private CodeType<ContactPointUse> use;
	
	private PositiveIntType rank;
	
	private Period period;

	public CodeType<ContactPointSystem> getSystem() {
		return system;
	}

	public void setSystem(CodeType<ContactPointSystem> system) {
		this.system = system;
	}

	public StringType getValue() {
		return value;
	}

	public void setValue(StringType value) {
		this.value = value;
	}

	public CodeType<ContactPointUse> getUse() {
		return use;
	}

	public void setUse(CodeType<ContactPointUse> use) {
		this.use = use;
	}

	public PositiveIntType getRank() {
		return rank;
	}

	public void setRank(PositiveIntType rank) {
		this.rank = rank;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}
	

}
