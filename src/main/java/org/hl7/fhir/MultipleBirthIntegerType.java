package org.hl7.fhir;

import org.hl7.fhir.primitivetype.IntegerType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MultipleBirthIntegerType extends MultipleBirthChoiceType{

	private IntegerType multipleBirthInteger;
}
