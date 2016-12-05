package org.hl7.fhir;

import java.util.List;

import org.hl7.fhir.compartment.BackboneElement;
import org.hl7.fhir.complextype.Address;
import org.hl7.fhir.complextype.CodeableConcept;
import org.hl7.fhir.complextype.ContactPoint;
import org.hl7.fhir.complextype.HumanName;
import org.hl7.fhir.complextype.Period;
import org.hl7.fhir.primitivetype.restriction.CodeType;

import lombok.Data;

@Data
public class PatientContactElement extends BackboneElement{

	//	PatientContactRelationship
	private CodeableConcept relationship;
	
	private HumanName name;
	private List<ContactPoint> telecom;
	private Address address;
//	AdministrativeGender
	private CodeType gender;
	private Reference organization;
	private Organization orgaizationtarget;
	private Period period;
}
