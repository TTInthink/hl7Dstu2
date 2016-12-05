package org.hl7.fhir.complextype;

public class Range {

	private SimpleQuantity low;
	private SimpleQuantity high;
	
	public SimpleQuantity getLow() {
		return low;
	}
	public void setLow(SimpleQuantity low) {
		this.low = low;
	}
	public SimpleQuantity getHigh() {
		return high;
	}
	public void setHigh(SimpleQuantity high) {
		this.high = high;
	}
	
	
}
