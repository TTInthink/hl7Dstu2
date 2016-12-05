package org.hl7.fhir.complextype;

import org.hl7.fhir.primitivetype.DecimalType;
import org.hl7.fhir.primitivetype.StringType;
import org.hl7.fhir.primitivetype.UriType;
import org.hl7.fhir.primitivetype.restriction.CodeType;
import org.hl7.fhir.primitivetype.restriction.controlledstring.QuantityComparator;
import org.hl7.fhir.type.Element;

import lombok.Data;

public class Quantity extends Element{

	private DecimalType value;

	private CodeType<QuantityComparator> comparator;
	private StringType unit;
	private UriType system;
	private CodeType code;
	public DecimalType getValue() {
		return value;
	}
	public void setValue(DecimalType value) {
		this.value = value;
	}
	public CodeType<QuantityComparator> getComparator() {
		return comparator;
	}
	public void setComparator(CodeType<QuantityComparator> comparator) {
		this.comparator = comparator;
	}
	public StringType getUnit() {
		return unit;
	}
	public void setUnit(StringType unit) {
		this.unit = unit;
	}
	public UriType getSystem() {
		return system;
	}
	public void setSystem(UriType system) {
		this.system = system;
	}
	public CodeType getCode() {
		return code;
	}
	public void setCode(CodeType code) {
		this.code = code;
	}
	
	
}
