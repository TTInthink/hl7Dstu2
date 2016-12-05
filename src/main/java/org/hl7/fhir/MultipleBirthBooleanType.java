package org.hl7.fhir;

import org.hl7.fhir.primitivetype.BooleanType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MultipleBirthBooleanType extends MultipleBirthChoiceType{

	private BooleanType multipleBirthBoolean;
}
