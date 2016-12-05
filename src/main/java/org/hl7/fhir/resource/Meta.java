package org.hl7.fhir.resource;

import java.util.List;

import org.hl7.fhir.complextype.Coding;
import org.hl7.fhir.primitivetype.InstantType;
import org.hl7.fhir.primitivetype.UriType;
import org.hl7.fhir.primitivetype.restriction.IdType;
import org.hl7.fhir.type.Element;

public class Meta extends Element{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3259924479930973472L;
	
	private IdType versionId;
	private InstantType lastUpdated;
	private List<UriType> profile;
	private List<Coding> security;
	private List<Coding> tag;
	
	
	public IdType getVersionId() {
		return versionId;
	}
	public void setVersionId(IdType versionId) {
		this.versionId = versionId;
	}
	public InstantType getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(InstantType lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public List<UriType> getProfile() {
		return profile;
	}
	public void setProfile(List<UriType> profile) {
		this.profile = profile;
	}
	public List<Coding> getSecurity() {
		return security;
	}
	public void setSecurity(List<Coding> security) {
		this.security = security;
	}
	public List<Coding> getTag() {
		return tag;
	}
	public void setTag(List<Coding> tag) {
		this.tag = tag;
	}
	
	
	
}
