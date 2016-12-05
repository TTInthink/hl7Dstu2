package org.hl7.fhir.complextype;


import java.util.List;

import org.hl7.fhir.primitivetype.StringType;
import org.hl7.fhir.primitivetype.restriction.CodeType;
import org.hl7.fhir.primitivetype.restriction.controlledstring.NameUse;
import org.hl7.fhir.type.Element;

/**
 * 
 * Name	Example	Destination / Comments
 * Surname	Smith	Family Name
 * First name	John	Given Name
 * Title	Mr	Prefix
 * Middle Name	Samuel	Subsequent Given Names
 * Patronymic	bin Osman	Family Name
 * Multiple family names	Carreño Quiñones	Family Name. See note below about repeats
 * Initials	Q.	Given Name as initial ("." recommended)
 * Nick Name	Jock	Given name, with Use = common
 * Qualifications	PhD	Suffix
 * Honorifics	Senior	Suffix
 * @author keat00
 *
 */

public class HumanName extends Element{

	//NameUse
	private CodeType<NameUse> use;
	
	private StringType text;
	
	private List<StringType> family;
	
	private List<StringType> given;
	
	private List<StringType> prefix;
	
	private List<StringType> suffix;
	
	private Period period;

	public CodeType<NameUse> getUse() {
		return use;
	}

	public void setUse(CodeType<NameUse> use) {
		this.use = use;
	}

	public StringType getText() {
		return text;
	}

	public void setText(StringType text) {
		this.text = text;
	}

	public List<StringType> getFamily() {
		return family;
	}

	public void setFamily(List<StringType> family) {
		this.family = family;
	}

	public List<StringType> getGiven() {
		return given;
	}

	public void setGiven(List<StringType> given) {
		this.given = given;
	}

	public List<StringType> getPrefix() {
		return prefix;
	}

	public void setPrefix(List<StringType> prefix) {
		this.prefix = prefix;
	}

	public List<StringType> getSuffix() {
		return suffix;
	}

	public void setSuffix(List<StringType> suffix) {
		this.suffix = suffix;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}
	
}
