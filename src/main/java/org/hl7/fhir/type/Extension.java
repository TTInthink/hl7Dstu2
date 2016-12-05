package org.hl7.fhir.type;

import org.hl7.fhir.primitivetype.UriType;

import lombok.Data;

@Data
public class Extension<T extends ValueType> {

	private UriType url;
	
	private T value;
}
