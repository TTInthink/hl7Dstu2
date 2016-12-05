package org.hl7.fhir.primitivetype.restriction.controlledstring;

import lombok.NonNull;

public enum TimingAbbreviation {

	/**
	 * Every Day at institution specified times.
	 */
	QD,
	/**
	 * Every Other Day at institution specified times.
	 */
	QOD,
	/**
	 * Every 4 hours at institution specified times.
	 */
	Q4H,
	/**
	 * Every 6 Hours at institution specified times.
	 */
	Q6H;

	public static TimingAbbreviation fromCode(@NonNull String codeString) throws Exception {
		if ("QD".equals(codeString))
			return QD;
		if ("QOD".equals(codeString))
			return QOD;
		if ("Q4H".equals(codeString))
			return Q4H;
		if ("Q6H".equals(codeString))
			return Q6H;
		throw new Exception("Unknown timing-abbreviation code '" + codeString + "'");
	}

	public String getCode() {
		switch (this) {
		case QD:
			return "QD";
		case QOD:
			return "QOD";
		case Q4H:
			return "Q4H";
		case Q6H:
			return "Q6H";
		default:
			return "?";
		}
	}

	public String getSystem() {
		switch (this) {
		case QD:
		case QOD:
		case Q4H:
		case Q6H:
			return "http://hl7.org/fhir/timing-abbreviation";
		default:
			return "?";
		}
	}

	public String getDefinition() {
		switch (this) {
		case QD:
			return "Every Day at institution specified times.";
		case QOD:
			return "Every Other Day at institution specified times.";
		case Q4H:
			return "Every 4 hours at institution specified times.";
		case Q6H:
			return "Every 6 Hours at institution specified times.";
		default:
			return "?";
		}
	}

	public String getDisplay() {
		switch (this) {
		case QD:
			return "QD";
		case QOD:
			return "QOD";
		case Q4H:
			return "Q4H";
		case Q6H:
			return "Q6H";
		default:
			return "?";
		}
	}
}
