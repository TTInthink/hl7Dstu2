package org.hl7.fhir.primitivetype.restriction.controlledstring;

import lombok.NonNull;

public enum QuantityComparator {

	/**
	 * The actual value is less than the given value.
	 */
	LESS_THAN,
	/**
	 * The actual value is less than or equal to the given value.
	 */
	LESS_OR_EQUAL,
	/**
	 * The actual value is greater than or equal to the given value.
	 */
	GREATER_OR_EQUAL,
	/**
	 * The actual value is greater than the given value.
	 */
	GREATER_THAN;

	public static QuantityComparator fromCode(@NonNull String codeString) throws Exception {
		if ("<".equals(codeString))
			return LESS_THAN;
		if ("<=".equals(codeString))
			return LESS_OR_EQUAL;
		if (">=".equals(codeString))
			return GREATER_OR_EQUAL;
		if (">".equals(codeString))
			return GREATER_THAN;
		throw new Exception("Unknown QuantityComparator code '" + codeString + "'");
	}

	public String getCode() {
		switch (this) {
		case LESS_THAN:
			return "<";
		case LESS_OR_EQUAL:
			return "<=";
		case GREATER_OR_EQUAL:
			return ">=";
		case GREATER_THAN:
			return ">";
		default:
			return "?";
		}
	}

	public String getSystem() {
		switch (this) {
		case LESS_THAN:
			return "http://hl7.org/fhir/quantity-comparator";
		case LESS_OR_EQUAL:
			return "http://hl7.org/fhir/quantity-comparator";
		case GREATER_OR_EQUAL:
			return "http://hl7.org/fhir/quantity-comparator";
		case GREATER_THAN:
			return "http://hl7.org/fhir/quantity-comparator";
		default:
			return "?";
		}
	}

	public String getDefinition() {
		switch (this) {
		case LESS_THAN:
			return "The actual value is less than the given value.";
		case LESS_OR_EQUAL:
			return "The actual value is less than or equal to the given value.";
		case GREATER_OR_EQUAL:
			return "The actual value is greater than or equal to the given value.";
		case GREATER_THAN:
			return "The actual value is greater than the given value.";
		default:
			return "?";
		}
	}

	public String getDisplay() {
		switch (this) {
		case LESS_THAN:
			return "Less than";
		case LESS_OR_EQUAL:
			return "Less or Equal to";
		case GREATER_OR_EQUAL:
			return "Greater or Equal to";
		case GREATER_THAN:
			return "Greater than";
		default:
			return "?";
		}
	}
}
