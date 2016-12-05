package org.hl7.fhir.compartment;

import java.util.List;

import org.hl7.fhir.type.Element;
import org.hl7.fhir.type.Extension;
import org.hl7.fhir.type.ValueType;

public class BackboneElement extends Element{

	private List<Extension<? extends ValueType>> modifierExtension;

	public List<Extension<? extends ValueType>> getModifierExtension() {
		return modifierExtension;
	}

	public void setModifierExtension(List<Extension<? extends ValueType>> modifierExtension) {
		this.modifierExtension = modifierExtension;
	}
	
	
}
