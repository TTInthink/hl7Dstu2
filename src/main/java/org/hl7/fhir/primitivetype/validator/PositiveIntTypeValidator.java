package org.hl7.fhir.primitivetype.validator;

public class PositiveIntTypeValidator extends BaseValidator{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6821005644555787756L;

	private static final String positiveInt_TYPE_REGEX = "[1-9][0-9]*";

	private static final PositiveIntTypeValidator PositiveInt_TYPE_VALIDATOR = new PositiveIntTypeValidator();

	public static PositiveIntTypeValidator getInstance() {
		return PositiveInt_TYPE_VALIDATOR;
	}
	
	protected PositiveIntTypeValidator(){}
	@Override
	public String getRegularExpression() {
		// TODO Auto-generated method stub
		return positiveInt_TYPE_REGEX;
	}

}
