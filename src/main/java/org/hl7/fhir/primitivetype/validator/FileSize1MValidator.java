package org.hl7.fhir.primitivetype.validator;

import java.io.Serializable;

public class FileSize1MValidator implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8950306407274529230L;

	private static final FileSize1MValidator FILESIZE_1M_VALIDATOR = new FileSize1MValidator();
	
	public static final int MAX_LENGTH=1000*1024; //1MB size

	public static FileSize1MValidator getInstance() {
		return FILESIZE_1M_VALIDATOR;
	}
	
	/**
	 * Protected constructor for subclasses to use.
	 */
	protected FileSize1MValidator() {
		super();
	}
	
	public boolean isValid(String value) {
		if(value==null){
			throw new IllegalArgumentException("Value should not be bull");
		}
		if(value.length()>MAX_LENGTH){
			return false;
		}
		return true;
	}
}
