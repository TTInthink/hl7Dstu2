package org.hl7.fhir.primitivetype.restriction.controlledstring;


import lombok.NonNull;

public enum ContactPointSystem {

	/**
     * The value is a telephone number used for voice calls. Use of full international numbers starting with + is recommended to enable automatic dialing support but not required.
     */
    PHONE, 
    /**
     * The value is a fax machine. Use of full international numbers starting with + is recommended to enable automatic dialing support but not required.
     */
    FAX, 
    /**
     * The value is an email address.
     */
    EMAIL, 
    /**
     * The value is a pager number. These may be local pager numbers that are only usable on a particular pager system.
     */
    PAGER, 
    /**
     * A contact that is not a phone, fax, or email address. The format of the value SHOULD be a URL. This is intended for various personal contacts including blogs, Twitter, Facebook, etc. Do not use for email addresses. If this is not a URL, then it will require human interpretation.
     */
    OTHER;
	
	public static ContactPointSystem fromCode(@NonNull String codeString) throws Exception {
    if ("phone".equals(codeString))
      return PHONE;
    if ("fax".equals(codeString))
      return FAX;
    if ("email".equals(codeString))
      return EMAIL;
    if ("pager".equals(codeString))
      return PAGER;
    if ("other".equals(codeString))
      return OTHER;
    throw new Exception("Unknown ContactPointSystem code '"+codeString+"'");
    }
    public String toCode() {
      switch (this) {
        case PHONE: return "phone";
        case FAX: return "fax";
        case EMAIL: return "email";
        case PAGER: return "pager";
        case OTHER: return "other";
        default: return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
        case PHONE: return "The value is a telephone number used for voice calls. Use of full international numbers starting with + is recommended to enable automatic dialing support but not required.";
        case FAX: return "The value is a fax machine. Use of full international numbers starting with + is recommended to enable automatic dialing support but not required.";
        case EMAIL: return "The value is an email address.";
        case PAGER: return "The value is a pager number. These may be local pager numbers that are only usable on a particular pager system.";
        case OTHER: return "A contact that is not a phone, fax, or email address. The format of the value SHOULD be a URL. This is intended for various personal contacts including blogs, Twitter, Facebook, etc. Do not use for email addresses. If this is not a URL, then it will require human interpretation.";
        default: return "?";
      }
    }
    public String getDisplay() {
      switch (this) {
        case PHONE: return "Phone";
        case FAX: return "Fax";
        case EMAIL: return "Email";
        case PAGER: return "Pager";
        case OTHER: return "URL";
        default: return "?";
      }
    }
}
