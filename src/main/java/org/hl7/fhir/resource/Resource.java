package org.hl7.fhir.resource;

import org.hl7.fhir.primitivetype.UriType;
import org.hl7.fhir.primitivetype.restriction.CodeType;
import org.hl7.fhir.primitivetype.restriction.IdType;

public class Resource {

	private IdType id;
	private Meta meta;
	private UriType implicitRules;
	private CodeType language;
	
	public IdType getId() {
		return id;
	}
	public void setId(IdType id) {
		this.id = id;
	}
	public Meta getMeta() {
		return meta;
	}
	public void setMeta(Meta meta) {
		this.meta = meta;
	}
	public UriType getImplicitRules() {
		return implicitRules;
	}
	public void setImplicitRules(UriType implicitRules) {
		this.implicitRules = implicitRules;
	}
	public CodeType getLanguage() {
		return language;
	}
	public void setLanguage(CodeType language) {
		this.language = language;
	}
	
}
