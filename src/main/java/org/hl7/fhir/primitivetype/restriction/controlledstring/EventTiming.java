package org.hl7.fhir.primitivetype.restriction.controlledstring;


public enum EventTiming {
	/**
     * null
     */
    HS, 
    /**
     * null
     */
    WAKE, 
    /**
     * null
     */
    C, 
    /**
     * null
     */
    CM, 
    /**
     * null
     */
    CD, 
    /**
     * null
     */
    CV, 
    /**
     * null
     */
    AC, 
    /**
     * null
     */
    ACM, 
    /**
     * null
     */
    ACD, 
    /**
     * null
     */
    ACV, 
    /**
     * null
     */
    PC, 
    /**
     * null
     */
    PCM, 
    /**
     * null
     */
    PCD, 
    /**
     * null
     */
    PCV;
	
    public static EventTiming fromCode(String codeString) throws Exception {
        if (codeString == null || "".equals(codeString))
            return null;
    if ("HS".equals(codeString))
      return HS;
    if ("WAKE".equals(codeString))
      return WAKE;
    if ("C".equals(codeString))
      return C;
    if ("CM".equals(codeString))
      return CM;
    if ("CD".equals(codeString))
      return CD;
    if ("CV".equals(codeString))
      return CV;
    if ("AC".equals(codeString))
      return AC;
    if ("ACM".equals(codeString))
      return ACM;
    if ("ACD".equals(codeString))
      return ACD;
    if ("ACV".equals(codeString))
      return ACV;
    if ("PC".equals(codeString))
      return PC;
    if ("PCM".equals(codeString))
      return PCM;
    if ("PCD".equals(codeString))
      return PCD;
    if ("PCV".equals(codeString))
      return PCV;
    throw new Exception("Unknown EventTiming code '"+codeString+"'");
    }
    public String getCode() {
      switch (this) {
        case HS: return "HS";
        case WAKE: return "WAKE";
        case C: return "C";
        case CM: return "CM";
        case CD: return "CD";
        case CV: return "CV";
        case AC: return "AC";
        case ACM: return "ACM";
        case ACD: return "ACD";
        case ACV: return "ACV";
        case PC: return "PC";
        case PCM: return "PCM";
        case PCD: return "PCD";
        case PCV: return "PCV";
        default: return "?";
      }
    }
    public String getSystem() {
      switch (this) {
        case HS: 
        case WAKE: 
        case C: 
        case CM: 
        case CD: 
        case CV: 
        case AC: 
        case ACM: 
        case ACD: 
        case ACV: 
        case PC: 
        case PCM: 
        case PCD: 
        case PCV: return "http://hl7.org/fhir/v3/TimingEvent";
        default: return "?";
      }
    }
    public String getDefinition() {
      switch (this) {
        case HS: return "";
        case WAKE: return "";
        case C: return "";
        case CM: return "";
        case CD: return "";
        case CV: return "";
        case AC: return "";
        case ACM: return "";
        case ACD: return "";
        case ACV: return "";
        case PC: return "";
        case PCM: return "";
        case PCD: return "";
        case PCV: return "";
        default: return "?";
      }
    }
    public String getDisplay() {
      switch (this) {
        case HS: return "HS";
        case WAKE: return "WAKE";
        case C: return "C";
        case CM: return "CM";
        case CD: return "CD";
        case CV: return "CV";
        case AC: return "AC";
        case ACM: return "ACM";
        case ACD: return "ACD";
        case ACV: return "ACV";
        case PC: return "PC";
        case PCM: return "PCM";
        case PCD: return "PCD";
        case PCV: return "PCV";
        default: return "?";
      }
    }
}
