package org.hl7.fhir.compartment;

import java.util.List;

import org.hl7.fhir.Patient;
import org.hl7.fhir.Reference;
import org.hl7.fhir.complextype.CodeableConcept;
import org.hl7.fhir.complextype.Identifier;
import org.hl7.fhir.primitivetype.restriction.CodeType;
import org.hl7.fhir.primitivetype.restriction.controlledstring.EncounterClass;
import org.hl7.fhir.primitivetype.restriction.controlledstring.EncounterPriority;
import org.hl7.fhir.primitivetype.restriction.controlledstring.EncounterState;
import org.hl7.fhir.primitivetype.restriction.controlledstring.EncounterType;
import org.hl7.fhir.resource.DomainResource;

public class Encounter extends DomainResource{

	private List<Identifier> identifier;
	private CodeType<EncounterState> status;
	
	private List<EncounterStatusHistoryElement> statusHistory;
	
	private CodeType<EncounterClass> class_encounter;
	private List<CodeableConcept<EncounterType>> type;
	
	private List<CodeableConcept<EncounterPriority>> priority;
	private Reference patient;
	private Patient patientTarget;
	
	
	
	
}
