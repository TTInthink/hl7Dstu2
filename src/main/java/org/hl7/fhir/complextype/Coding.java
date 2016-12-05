package org.hl7.fhir.complextype;


import org.hl7.fhir.primitivetype.BooleanType;
import org.hl7.fhir.primitivetype.StringType;
import org.hl7.fhir.primitivetype.UriType;
import org.hl7.fhir.primitivetype.restriction.CodeType;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

public class Coding<T> {

	private UriType system;
	
	private StringType version;
	//follow system uri
	private CodeType<T> code;
	
	private StringType display;
	
	private BooleanType userSelected;

	public UriType getSystem() {
		return system;
	}

	public void setSystem(UriType system) {
		this.system = system;
	}

	public StringType getVersion() {
		return version;
	}

	public void setVersion(StringType version) {
		this.version = version;
	}

	public CodeType<T> getCode() {
		return code;
	}

	public void setCode(CodeType<T> code) {
		this.code = code;
	}

	public StringType getDisplay() {
		return display;
	}

	public void setDisplay(StringType display) {
		this.display = display;
	}

	public BooleanType getUserSelected() {
		return userSelected;
	}

	public void setUserSelected(BooleanType userSelected) {
		this.userSelected = userSelected;
	}
	
}
