package org.hl7.fhir.type;

import org.hl7.fhir.MarkdownType;

import lombok.Data;

@Data
public class ValueMarkdown extends ValueType{

	private MarkdownType value;
}
