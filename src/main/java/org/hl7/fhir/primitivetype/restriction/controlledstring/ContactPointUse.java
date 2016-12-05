package org.hl7.fhir.primitivetype.restriction.controlledstring;

import lombok.NonNull;

public enum ContactPointUse {

	/**
     * A communication contact point at a home; attempted contacts for business purposes might intrude privacy and chances are one will contact family or other household members instead of the person one wishes to call. Typically used with urgent cases, or if no other contacts are available.
     */
    HOME, 
    /**
     * An office contact point. First choice for business related contacts during business hours.
     */
    WORK, 
    /**
     * A temporary contact point. The period can provide more detailed information.
     */
    TEMP, 
    /**
     * This contact point is no longer in use (or was never correct, but retained for records).
     */
    OLD, 
    /**
     * A telecommunication device that moves and stays with its owner. May have characteristics of all other use codes, suitable for urgent matters, not the first choice for routine business.
     */
    MOBILE;
	
	 public static ContactPointUse fromCode(@NonNull String codeString) throws Exception {
     if ("home".equals(codeString))
       return HOME;
     if ("work".equals(codeString))
       return WORK;
     if ("temp".equals(codeString))
       return TEMP;
     if ("old".equals(codeString))
       return OLD;
     if ("mobile".equals(codeString))
       return MOBILE;
     throw new Exception("Unknown ContactPointUse code '"+codeString+"'");
     }
	 
     public String getCode() {
       switch (this) {
         case HOME: return "home";
         case WORK: return "work";
         case TEMP: return "temp";
         case OLD: return "old";
         case MOBILE: return "mobile";
         default: return "?";
       }
     }
     public String getSystem() {
       switch (this) {
         case HOME: return "http://hl7.org/fhir/contact-point-use";
         case WORK: return "http://hl7.org/fhir/contact-point-use";
         case TEMP: return "http://hl7.org/fhir/contact-point-use";
         case OLD: return "http://hl7.org/fhir/contact-point-use";
         case MOBILE: return "http://hl7.org/fhir/contact-point-use";
         default: return "?";
       }
     }
     public String getDefinition() {
       switch (this) {
         case HOME: return "A communication contact point at a home; attempted contacts for business purposes might intrude privacy and chances are one will contact family or other household members instead of the person one wishes to call. Typically used with urgent cases, or if no other contacts are available.";
         case WORK: return "An office contact point. First choice for business related contacts during business hours.";
         case TEMP: return "A temporary contact point. The period can provide more detailed information.";
         case OLD: return "This contact point is no longer in use (or was never correct, but retained for records).";
         case MOBILE: return "A telecommunication device that moves and stays with its owner. May have characteristics of all other use codes, suitable for urgent matters, not the first choice for routine business.";
         default: return "?";
       }
     }
     public String getDisplay() {
       switch (this) {
         case HOME: return "Home";
         case WORK: return "Work";
         case TEMP: return "Temp";
         case OLD: return "Old";
         case MOBILE: return "Mobile";
         default: return "?";
       }
     }
}
