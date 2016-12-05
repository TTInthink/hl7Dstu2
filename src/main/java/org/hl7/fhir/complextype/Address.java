package org.hl7.fhir.complextype;

import java.io.Serializable;
import java.util.List;

import org.hl7.fhir.primitivetype.StringType;
import org.hl7.fhir.primitivetype.restriction.CodeType;
import org.hl7.fhir.primitivetype.restriction.controlledstring.AddressType;
import org.hl7.fhir.primitivetype.restriction.controlledstring.AddressUse;
import org.hl7.fhir.type.Element;


public class Address extends Element{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4358175971271387471L;
	//AddressUse
	private CodeType<AddressUse> use;
	
	//AddressType
	private CodeType<AddressType> type;
	
	private StringType text;
	
	private List<StringType> line;
	private StringType city;
	private StringType district;
	private StringType state;
	private StringType postalCode;
	private StringType country;
	private Period period;
	public CodeType<AddressUse> getUse() {
		return use;
	}
	public void setUse(CodeType<AddressUse> use) {
		this.use = use;
	}
	public CodeType<AddressType> getType() {
		return type;
	}
	public void setType(CodeType<AddressType> type) {
		this.type = type;
	}
	public StringType getText() {
		return text;
	}
	public void setText(StringType text) {
		this.text = text;
	}
	public List<StringType> getLine() {
		return line;
	}
	public void setLine(List<StringType> line) {
		this.line = line;
	}
	public StringType getCity() {
		return city;
	}
	public void setCity(StringType city) {
		this.city = city;
	}
	public StringType getDistrict() {
		return district;
	}
	public void setDistrict(StringType district) {
		this.district = district;
	}
	public StringType getState() {
		return state;
	}
	public void setState(StringType state) {
		this.state = state;
	}
	public StringType getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(StringType postalCode) {
		this.postalCode = postalCode;
	}
	public StringType getCountry() {
		return country;
	}
	public void setCountry(StringType country) {
		this.country = country;
	}
	public Period getPeriod() {
		return period;
	}
	public void setPeriod(Period period) {
		this.period = period;
	}

	
	

}
