package org.hl7.fhir;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "telecom")
public class Telecom  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2598881089366032131L;
	
	@Id
    private String id;
	
	@Field("type")
	private String type;
	
	@Field("value")
	private String value;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	
	
}
