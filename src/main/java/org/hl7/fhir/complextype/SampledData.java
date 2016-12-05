package org.hl7.fhir.complextype;

import org.hl7.fhir.primitivetype.DecimalType;
import org.hl7.fhir.primitivetype.StringType;
import org.hl7.fhir.primitivetype.restriction.PositiveIntType;
import org.hl7.fhir.type.Element;

public class SampledData extends Element{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5524333253208538914L;
	
	private SimpleQuantity origin;
	private DecimalType period;
	private DecimalType factor;
	private DecimalType lowerLimit;
	private DecimalType upperLimit;
	private PositiveIntType dimensions;
	private StringType data;
	public SimpleQuantity getOrigin() {
		return origin;
	}
	public void setOrigin(SimpleQuantity origin) {
		this.origin = origin;
	}
	public DecimalType getPeriod() {
		return period;
	}
	public void setPeriod(DecimalType period) {
		this.period = period;
	}
	public DecimalType getFactor() {
		return factor;
	}
	public void setFactor(DecimalType factor) {
		this.factor = factor;
	}
	public DecimalType getLowerLimit() {
		return lowerLimit;
	}
	public void setLowerLimit(DecimalType lowerLimit) {
		this.lowerLimit = lowerLimit;
	}
	public DecimalType getUpperLimit() {
		return upperLimit;
	}
	public void setUpperLimit(DecimalType upperLimit) {
		this.upperLimit = upperLimit;
	}
	public PositiveIntType getDimensions() {
		return dimensions;
	}
	public void setDimensions(PositiveIntType dimensions) {
		this.dimensions = dimensions;
	}
	public StringType getData() {
		return data;
	}
	public void setData(StringType data) {
		this.data = data;
	}
	
	
}
