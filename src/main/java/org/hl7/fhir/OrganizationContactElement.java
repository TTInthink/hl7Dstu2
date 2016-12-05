package org.hl7.fhir;

import java.util.List;

import org.hl7.fhir.compartment.BackboneElement;
import org.hl7.fhir.complextype.Address;
import org.hl7.fhir.complextype.CodeableConcept;
import org.hl7.fhir.complextype.ContactPoint;
import org.hl7.fhir.complextype.HumanName;

import lombok.Data;

@Data
public class OrganizationContactElement extends BackboneElement{

//	ContactEntityType
	private CodeableConcept purpose;
	
	private HumanName name;
	private List<ContactPoint> telecom;
	private Address address;
}
