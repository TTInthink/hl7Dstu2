package org.hl7.fhir;

import java.util.List;

import org.hl7.fhir.compartment.BackboneElement;
import org.hl7.fhir.complextype.CodeableConcept;
import org.hl7.fhir.primitivetype.BooleanType;

import lombok.Data;

@Data
public class PatientCommunicationElement extends BackboneElement{

	private CodeableConcept language;
	private BooleanType preferred;
}
