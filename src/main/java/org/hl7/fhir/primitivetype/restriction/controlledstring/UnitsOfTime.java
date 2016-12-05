package org.hl7.fhir.primitivetype.restriction.controlledstring;

import lombok.NonNull;

public enum UnitsOfTime {

	/**
	 * null
	 */
	S,
	/**
	 * null
	 */
	MIN,
	/**
	 * null
	 */
	H,
	/**
	 * null
	 */
	D,
	/**
	 * null
	 */
	WK,
	/**
	 * null
	 */
	MO,
	/**
	 * null
	 */
	A;

	public static UnitsOfTime fromCode(@NonNull String codeString) throws Exception {

		if ("s".equals(codeString))
			return S;
		if ("min".equals(codeString))
			return MIN;
		if ("h".equals(codeString))
			return H;
		if ("d".equals(codeString))
			return D;
		if ("wk".equals(codeString))
			return WK;
		if ("mo".equals(codeString))
			return MO;
		if ("a".equals(codeString))
			return A;
		throw new Exception("Unknown UnitsOfTime code '" + codeString + "'");
	}

	public String toCode() {
		switch (this) {
		case S:
			return "s";
		case MIN:
			return "min";
		case H:
			return "h";
		case D:
			return "d";
		case WK:
			return "wk";
		case MO:
			return "mo";
		case A:
			return "a";
		default:
			return "?";
		}
	}

	public String getSystem() {
		switch (this) {
		case S:
			return "http://unitsofmeasure.org";
		case MIN:
			return "http://unitsofmeasure.org";
		case H:
			return "http://unitsofmeasure.org";
		case D:
			return "http://unitsofmeasure.org";
		case WK:
			return "http://unitsofmeasure.org";
		case MO:
			return "http://unitsofmeasure.org";
		case A:
			return "http://unitsofmeasure.org";
		default:
			return "?";
		}
	}

	public String getDefinition() {
		switch (this) {
		case S:
			return "";
		case MIN:
			return "";
		case H:
			return "";
		case D:
			return "";
		case WK:
			return "";
		case MO:
			return "";
		case A:
			return "";
		default:
			return "?";
		}
	}

	public String getDisplay() {
		switch (this) {
		case S:
			return "s";
		case MIN:
			return "min";
		case H:
			return "h";
		case D:
			return "d";
		case WK:
			return "wk";
		case MO:
			return "mo";
		case A:
			return "a";
		default:
			return "?";
		}
	}
}
