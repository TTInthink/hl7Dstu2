package org.hl7.fhir.primitivetype.validator;


public class OidTypeValidator extends BaseValidator{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1915458560336410142L;

	private static final String OID_TYPE_REGEX = "urn:oid:[0-2](\\.[1-9]\\d*)+";

	private static final OidTypeValidator OID_TYPE_VALIDATOR = new OidTypeValidator();

	public static OidTypeValidator getInstance() {
		return OID_TYPE_VALIDATOR;
	}
	
	protected OidTypeValidator(){}

	@Override
	public String getRegularExpression() {
		return OID_TYPE_REGEX;
	}
	
}
