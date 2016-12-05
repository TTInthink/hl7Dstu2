package org.hl7.fhir.primitivetype.validator;

public class IdTypeValidator extends BaseValidator{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1091595943058701057L;

	private static final String ID_TYPE_REGEX = "[A-Za-z0-9\\-\\.]{1,64}";
	
	@Override
	public String getRegularExpression() {
		return ID_TYPE_REGEX ;
	}
	
	private static final IdTypeValidator ID_TYPE_VALIDATOR = new IdTypeValidator();

	public static IdTypeValidator getInstance() {
		return ID_TYPE_VALIDATOR;
	}
	
	protected IdTypeValidator(){}

}
