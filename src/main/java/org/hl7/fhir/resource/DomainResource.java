package org.hl7.fhir.resource;

import java.util.List;

import org.hl7.fhir.type.Extension;
import org.hl7.fhir.type.ValueType;

public class DomainResource extends Resource{

	private Narrative text;
	private List<Resource> contained;
	private List<Extension<? extends ValueType>> extension;
	private List<Extension<? extends ValueType>> modifierExtension;
	
	public Narrative getText() {
		return text;
	}
	public void setText(Narrative text) {
		this.text = text;
	}
	public List<Resource> getContained() {
		return contained;
	}
	public void setContained(List<Resource> contained) {
		this.contained = contained;
	}
	public List<Extension<? extends ValueType>> getExtension() {
		return extension;
	}
	public void setExtension(List<Extension<? extends ValueType>> extension) {
		this.extension = extension;
	}
	public List<Extension<? extends ValueType>> getModifierExtension() {
		return modifierExtension;
	}
	public void setModifierExtension(List<Extension<? extends ValueType>> modifierExtension) {
		this.modifierExtension = modifierExtension;
	}
	
	
}
