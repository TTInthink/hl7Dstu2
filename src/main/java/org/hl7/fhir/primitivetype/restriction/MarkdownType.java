package org.hl7.fhir.primitivetype.restriction;

import java.io.Serializable;

public class MarkdownType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9089154337070181138L;
	
	private String value;
	
	public MarkdownType(String value){
		this.value=value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
