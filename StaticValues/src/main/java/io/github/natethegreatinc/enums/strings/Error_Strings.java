package io.github.natethegreatinc.enums.strings;

public enum Error_Strings {
    INVALID_TELEPHONE_NUMBER("The telephone number provided is invalid."),
    INVALID_EMAIL_ADDRESS("The email address provided is invalid."),
    INVALID_ZIP_CODE("The zip code provided is invalid."),
    INVALID_DATE("The date provided is invalid."),
    INVALID_CREDIT_CARD_NUMBER("The credit card number provided is invalid.");
    private final String message;
    Error_Strings(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
