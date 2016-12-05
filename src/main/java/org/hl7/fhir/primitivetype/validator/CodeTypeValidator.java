package org.hl7.fhir.primitivetype.validator;

public class CodeTypeValidator extends BaseValidator{

	/**
	 * 
	 */
	private static final long serialVersionUID = -434323019450251447L;

	private static final String CODE_TYPE_REGEX = "[^\\s]+([\\s]+[^\\s]+)*";

	private static final CodeTypeValidator CODE_TYPE_VALIDATOR = new CodeTypeValidator();

	public static CodeTypeValidator getInstance() {
		return CODE_TYPE_VALIDATOR;
	}
	
	protected CodeTypeValidator(){}

	
	@Override
	public String getRegularExpression() {
		
		return CODE_TYPE_REGEX;
	}


}
