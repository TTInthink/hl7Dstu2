package org.hl7.fhir;

import org.hl7.fhir.primitivetype.DateTimeType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeceasedDateTimeType extends DeceasedChoiceType{

	private DateTimeType deceasedDateTime;
}
