package org.hl7.fhir;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "link")
public class Link implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 286860087361574718L;

	@Id
    private String id;
	
	@Field("urlLink")
	private String urlLink;
}
