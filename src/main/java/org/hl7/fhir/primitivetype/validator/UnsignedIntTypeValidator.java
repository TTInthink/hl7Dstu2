package org.hl7.fhir.primitivetype.validator;

public class UnsignedIntTypeValidator extends BaseValidator{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8150050824361341684L;

	private static final String UnsignedInt_TYPE_REGEX = "[0-9]+";

	private static final UnsignedIntTypeValidator UnsignedInt_TYPE_VALIDATOR = new UnsignedIntTypeValidator();

	public static UnsignedIntTypeValidator getInstance() {
		return UnsignedInt_TYPE_VALIDATOR;
	}
	
	protected UnsignedIntTypeValidator(){}
	@Override
	public String getRegularExpression() {
		// TODO Auto-generated method stub
		return UnsignedInt_TYPE_REGEX;
	}

}
