package com.amalitech.securecoding;

import org.owasp.encoder.Encode;

public class XSSPrevention {
    public String sanitizeInput(String userInput) {
        return Encode.forHtml(userInput);
    }
}
