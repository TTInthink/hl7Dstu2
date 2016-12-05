package org.hl7.fhir.resource;

import org.hl7.fhir.primitivetype.restriction.CodeType;
import org.hl7.fhir.type.Element;

public class Narrative extends Element{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1645215658010998703L;

	private CodeType status;
	private String div;
	
	public CodeType getStatus() {
		return status;
	}
	public void setStatus(CodeType status) {
		this.status = status;
	}
	public String getDiv() {
		return div;
	}
	public void setDiv(String div) {
		this.div = div;
	}
	
}
