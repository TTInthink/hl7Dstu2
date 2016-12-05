package org.hl7.fhir.complextype;

import java.util.List;

import org.hl7.fhir.primitivetype.StringType;

import lombok.AllArgsConstructor;
import lombok.Data;


public class CodeableConcept<T>{

	private List<Coding<T>> coding;
	private StringType text;
	
	public List<Coding<T>> getCoding() {
		return coding;
	}
	public void setCoding(List<Coding<T>> coding) {
		this.coding = coding;
	}
	public StringType getText() {
		return text;
	}
	public void setText(StringType text) {
		this.text = text;
	}
	
}
