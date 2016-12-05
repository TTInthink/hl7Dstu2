package org.hl7.fhir;

import java.io.Serializable;
import java.util.List;

import org.hl7.fhir.complextype.Address;
import org.hl7.fhir.complextype.Attachment;
import org.hl7.fhir.complextype.CodeableConcept;
import org.hl7.fhir.complextype.ContactPoint;
import org.hl7.fhir.complextype.HumanName;
import org.hl7.fhir.complextype.Identifier;
import org.hl7.fhir.primitivetype.BooleanType;
import org.hl7.fhir.primitivetype.DateType;
import org.hl7.fhir.primitivetype.restriction.CodeType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
public class Patient implements Serializable{

	private static final long serialVersionUID = -869809817530165981L;
	
	private String id;

	private List<Identifier> identifier;
	
	private BooleanType active;
	
	private List<HumanName> name;
	
	private List<ContactPoint> telecom;
	//AdministrativeGender
	private CodeType gender;
	
	private DateType birthDate;
	
	private DeceasedChoiceType deceased;
	
	private List<Address> address;
	
	private CodeableConcept maritalStatus;
	
	private MultipleBirthChoiceType multipleBirth;
	
	private List<Attachment> photo;
	
	private List<PatientContactElement> contact;
	
	private List<PatientCommunicationElement> communication;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Identifier> getIdentifier() {
		return identifier;
	}

	public void setIdentifier(List<Identifier> identifier) {
		this.identifier = identifier;
	}

	public BooleanType getActive() {
		return active;
	}

	public void setActive(BooleanType active) {
		this.active = active;
	}

	public List<HumanName> getName() {
		return name;
	}

	public void setName(List<HumanName> name) {
		this.name = name;
	}

	public List<ContactPoint> getTelecom() {
		return telecom;
	}

	public void setTelecom(List<ContactPoint> telecom) {
		this.telecom = telecom;
	}

	public CodeType getGender() {
		return gender;
	}

	public void setGender(CodeType gender) {
		this.gender = gender;
	}

	public DateType getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(DateType birthDate) {
		this.birthDate = birthDate;
	}

	public DeceasedChoiceType getDeceased() {
		return deceased;
	}

	public void setDeceased(DeceasedChoiceType deceased) {
		this.deceased = deceased;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public CodeableConcept getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(CodeableConcept maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public MultipleBirthChoiceType getMultipleBirth() {
		return multipleBirth;
	}

	public void setMultipleBirth(MultipleBirthChoiceType multipleBirth) {
		this.multipleBirth = multipleBirth;
	}

	public List<Attachment> getPhoto() {
		return photo;
	}

	public void setPhoto(List<Attachment> photo) {
		this.photo = photo;
	}

	public List<PatientContactElement> getContact() {
		return contact;
	}

	public void setContact(List<PatientContactElement> contact) {
		this.contact = contact;
	}

	public List<PatientCommunicationElement> getCommunication() {
		return communication;
	}

	public void setCommunication(List<PatientCommunicationElement> communication) {
		this.communication = communication;
	}


}
