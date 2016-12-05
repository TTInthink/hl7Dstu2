package org.hl7.fhir;

import java.util.List;

import org.hl7.fhir.complextype.Address;
import org.hl7.fhir.complextype.CodeableConcept;
import org.hl7.fhir.complextype.ContactPoint;
import org.hl7.fhir.complextype.Identifier;
import org.hl7.fhir.primitivetype.BooleanType;
import org.hl7.fhir.primitivetype.StringType;

import lombok.Data;

@Data
public class Organization {

	private List<Identifier> identifier;
	private BooleanType active;
//	OrganizationType
	private CodeableConcept type;
	private StringType name;
	private List<ContactPoint> telecom;
	private List<Address> address;
	private Reference partOf;
	private Organization partOfTarget;
	private List<OrganizationContactElement> contact;
}
