package org.hl7.fhir;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "photo")
public class Photo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5872507829748899769L;

	@Id
    private String id;
	
	@Field("photoLocation")
	private String photoLocations;
}
