package io.github.natethegreatinc.enums.colors;

public enum Logo {

    LOGO_FONT_COLOR("#0000FF"),
    LOGO_BACKGROUND_COLOR("#FFFFFF");

    private final String hexCode;

    Logo(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }
}
