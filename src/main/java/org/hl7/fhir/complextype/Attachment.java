package org.hl7.fhir.complextype;

import org.hl7.fhir.UnsignedIntType;
import org.hl7.fhir.primitivetype.Base64BinaryType;
import org.hl7.fhir.primitivetype.DateTimeType;
import org.hl7.fhir.primitivetype.StringType;
import org.hl7.fhir.primitivetype.UriType;
import org.hl7.fhir.primitivetype.restriction.CodeType;
import org.hl7.fhir.primitivetype.restriction.controlledstring.LanguageType;
import org.hl7.fhir.primitivetype.restriction.controlledstring.MimeType;
import org.hl7.fhir.type.Element;

import lombok.Data;

public class Attachment extends Element{

	/**
	 * 
	 */
	private static final long serialVersionUID = 324798848699214759L;
	
	private CodeType<MimeType> contentType;
	private CodeType<LanguageType> language;
	private Base64BinaryType data;
	private UriType url;
	private UnsignedIntType size;
	private Base64BinaryType hash;
	private StringType title;
	private DateTimeType creation;
	public CodeType<MimeType> getContentType() {
		return contentType;
	}
	public void setContentType(CodeType<MimeType> contentType) {
		this.contentType = contentType;
	}
	public CodeType<LanguageType> getLanguage() {
		return language;
	}
	public void setLanguage(CodeType<LanguageType> language) {
		this.language = language;
	}
	public Base64BinaryType getData() {
		return data;
	}
	public void setData(Base64BinaryType data) {
		this.data = data;
	}
	public UriType getUrl() {
		return url;
	}
	public void setUrl(UriType url) {
		this.url = url;
	}
	public UnsignedIntType getSize() {
		return size;
	}
	public void setSize(UnsignedIntType size) {
		this.size = size;
	}
	public Base64BinaryType getHash() {
		return hash;
	}
	public void setHash(Base64BinaryType hash) {
		this.hash = hash;
	}
	public StringType getTitle() {
		return title;
	}
	public void setTitle(StringType title) {
		this.title = title;
	}
	public DateTimeType getCreation() {
		return creation;
	}
	public void setCreation(DateTimeType creation) {
		this.creation = creation;
	}
	
	
}
