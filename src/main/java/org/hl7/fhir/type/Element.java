package org.hl7.fhir.type;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hl7.fhir.primitivetype.restriction.IdType;

public class Element implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6175863725949573040L;
	
	private IdType id;
	private  List<Extension<? extends ValueType>> extension;
	
	public IdType getId() {
		return id;
	}
	public void setId(IdType id) {
		this.id = id;
	}
	public List<Extension<? extends ValueType>> getExtension() {
		return extension;
	}
	public void setExtension(List<Extension<? extends ValueType>> extension) {
		this.extension = extension;
	}
	
	public static void main(String[] args){
		Element a=new Element();
		Extension<ValueString>cc=new Extension<ValueString>();
		a.setExtension(new ArrayList<Extension<?extends ValueType>>());
		a.getExtension().add(cc);
	}

}
