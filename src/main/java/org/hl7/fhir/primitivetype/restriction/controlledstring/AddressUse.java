package org.hl7.fhir.primitivetype.restriction.controlledstring;

import lombok.NonNull;

public enum AddressUse {
	/**
	 * A communication address at a home.
	 */
	HOME,
	/**
	 * An office address. First choice for business related contacts during
	 * business hours.
	 */
	WORK,
	/**
	 * A temporary address. The period can provide more detailed information.
	 */
	TEMP,
	/**
	 * This address is no longer in use (or was never correct, but retained for
	 * records).
	 */
	OLD;
	public static AddressUse fromCode(@NonNull String codeString) throws Exception {
		if ("home".equals(codeString))
			return HOME;
		if ("work".equals(codeString))
			return WORK;
		if ("temp".equals(codeString))
			return TEMP;
		if ("old".equals(codeString))
			return OLD;
		throw new Exception("Unknown AddressUse code '" + codeString + "'");
	}

	public String getCode() {
		switch (this) {
		case HOME:
			return "home";
		case WORK:
			return "work";
		case TEMP:
			return "temp";
		case OLD:
			return "old";
		default:
			return "?";
		}
	}

	public String getSystem() {
		switch (this) {
		case HOME:
			return "http://hl7.org/fhir/address-use";
		case WORK:
			return "http://hl7.org/fhir/address-use";
		case TEMP:
			return "http://hl7.org/fhir/address-use";
		case OLD:
			return "http://hl7.org/fhir/address-use";
		default:
			return "?";
		}
	}

	public String getDefinition() {
		switch (this) {
		case HOME:
			return "A communication address at a home.";
		case WORK:
			return "An office address. First choice for business related contacts during business hours.";
		case TEMP:
			return "A temporary address. The period can provide more detailed information.";
		case OLD:
			return "This address is no longer in use (or was never correct, but retained for records).";
		default:
			return "?";
		}
	}

	public String getDisplay() {
		switch (this) {
		case HOME:
			return "Home";
		case WORK:
			return "Work";
		case TEMP:
			return "Temporary";
		case OLD:
			return "Old / Incorrect";
		default:
			return "?";
		}
	}
}
