package org.hl7.fhir.primitivetype.restriction.controlledstring;

import lombok.NonNull;

public enum MaritalStatus {
//	A	Annulled	Marriage contract has been declared null and to not have existed
//	D	Divorced	Marriage contract has been declared dissolved and inactive
//	I	Interlocutory	Subject to an Interlocutory Decree.
//	L	Legally Separated	Legally Separated
//	M	Married	A current marriage contract is active
//	P	Polygamous	More than 1 current spouse
//	S	Never Married	No marriage contract has ever been entered
//	T	Domestic partner	Person declares that a domestic partner relationship exists.
//	W	Widowed	The spouse has died
	/**
	 * Marriage contract has been declared null and to not have existed
	 */
	ANNULLED,
	/**
	 * Marriage contract has been declared dissolved and inactive
	 */
	DIVORCED,
	/**
	 * Subject to an Interlocutory Decree.
	 */
	INTERLOCUTORY,
	/**
	 * Legally Separated
	 */
	LEGALLY_SEPARATED,
	/**
	 * A current marriage contract is active
	 */
	MARRIED,
	/**
	 * More than 1 current spouse
	 */
	POLYGAMOUS,
	/**
	 * Subject to an Interlocutory Decree.
	 */
	NEVER_MARRIED,
	/**
	 * Person declares that a domestic partner relationship exists.
	 */
	DOMESTIC_PARTNER,
	/**
	 * The spouse has died
	 */
	WIDOWED;
	

	public static MaritalStatus fromCode(@NonNull String codeString) throws Exception {
		if ("Annulled".equals(codeString))
			return ANNULLED;
		if ("Divorced".equals(codeString))
			return DIVORCED;
		if ("Interlocutory".equals(codeString))
			return INTERLOCUTORY;
		if ("Legally Separated".equals(codeString))
			return LEGALLY_SEPARATED;
		if ("Married".equals(codeString))
			return MARRIED;
		if ("Polygamous".equals(codeString))
			return POLYGAMOUS;
		if ("Never Married".equals(codeString))
			return NEVER_MARRIED;
		if ("Domestic partner".equals(codeString))
			return DOMESTIC_PARTNER;
		if ("Widowed".equals(codeString))
			return WIDOWED;
		throw new Exception("Unknown MaritalStatus code '" + codeString + "'");
	}

	public String getCode() {
		switch (this) {
		case ANNULLED:
			return "Annulled";
		case DIVORCED:
			return "Divorced";
		case INTERLOCUTORY:
			return "Interlocutory";
		case LEGALLY_SEPARATED:
			return "Legally Separated";
		case MARRIED:
			return "Married";
		case POLYGAMOUS:
			return "Polygamous";
		case NEVER_MARRIED:
			return "Never Married";
		case DOMESTIC_PARTNER:
			return "Domestic partner";
		case WIDOWED:
			return "Widowed";
		default:
			return "?";
		}
	}

	public String getSystem() {
		switch (this) {
		case ANNULLED:
		case DIVORCED:
		case INTERLOCUTORY:
		case LEGALLY_SEPARATED:
		case MARRIED:
		case POLYGAMOUS:
		case NEVER_MARRIED:
		case DOMESTIC_PARTNER:
		case WIDOWED:
			return "ttp://hl7.org/fhir/marital-status";
		default:
			return "?";
		}
	}

	public String getDefinition() {
		switch (this) {
		case ANNULLED:
			return "Annulled";
		case DIVORCED:
			return "Divorced";
		case INTERLOCUTORY:
			return "Interlocutory";
		case LEGALLY_SEPARATED:
			return "Legally Separated";
		case MARRIED:
			return "Married";
		case POLYGAMOUS:
			return "Polygamous";
		case NEVER_MARRIED:
			return "Never Married";
		case DOMESTIC_PARTNER:
			return "Domestic partner";
		case WIDOWED:
			return "Widowed";
		default:
			return "?";
		}
	}

	public String getDisplay() {
		switch (this) {
		case ANNULLED:
			return "Annulled";
		case DIVORCED:
			return "Divorced";
		case INTERLOCUTORY:
			return "Interlocutory";
		case LEGALLY_SEPARATED:
			return "Legally Separated";
		case MARRIED:
			return "Married";
		case POLYGAMOUS:
			return "Polygamous";
		case NEVER_MARRIED:
			return "Never Married";
		case DOMESTIC_PARTNER:
			return "Domestic partner";
		case WIDOWED:
			return "Widowed";
		default:
			return "?";
		}
	}
}
