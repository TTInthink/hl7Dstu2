package org.hl7.fhir.primitivetype.validator;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class BaseValidator implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2618538030810360086L;

	public boolean isValid(String value) {
		if(value==null){
			throw new IllegalArgumentException("Value should not be bull");
		}

		Pattern CODE_TYPE_PATTERN = Pattern.compile(getRegularExpression());
		Matcher codeTypeMatcher = CODE_TYPE_PATTERN.matcher(value);

		if (!codeTypeMatcher.matches()) {
			throw new IllegalArgumentException("Invalid value: "+value);
		}

		return true;
	}

	public abstract String getRegularExpression();
}
