package org.hl7.fhir.primitivetype.restriction.controlledstring;

import lombok.NonNull;

public enum IdentifierUse {

	USUAL,OFFICIAL,TEMP,SECONDARY;
	
	public static IdentifierUse fromCode(@NonNull String codeString) throws Exception {
		if ("usual".equals(codeString))
			return USUAL;
		if ("official".equals(codeString))
			return OFFICIAL;
		if ("temp".equals(codeString))
			return TEMP;
		if ("secondary".equals(codeString))
			return SECONDARY;
		throw new Exception("Unknown IdentifierUse code '" + codeString + "'");
	}
	
	public String getCode() {
        switch (this) {
          case USUAL: return "usual";
          case OFFICIAL: return "official";
          case TEMP: return "temp";
          case SECONDARY: return "secondary";
          default: return "?";
        }
      }

      public String getDefinition() {
        switch (this) {
          case USUAL: return "The identifier recommended for display and use in real-world interactions.";
          case OFFICIAL: return "The identifier considered to be most trusted for the identification of this item.";
          case TEMP: return "A temporary identifier.";
          case SECONDARY: return "An identifier that was assigned in secondary use - it serves to identify the object in a relative context, but cannot be consistently assigned to the same object again in a different context.";
          default: return "?";
        }
      }
      public String getDisplay() {
        switch (this) {
          case USUAL: return "Usual";
          case OFFICIAL: return "Official";
          case TEMP: return "Temp";
          case SECONDARY: return "Secondary";
          default: return "?";
        }
      }
}
