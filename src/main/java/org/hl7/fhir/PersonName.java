package org.hl7.fhir;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document(collection = "personName")
public class PersonName implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 526602543963592969L;

	@Id
    private String id;
	
	@Field("displayName")
	private String displayName;
	
	@Field("firstName")
	private String firstName;
	@Field("middleName")
	private String middleName;
	@Field("lastName")
	private String lastName;

	
	
}
