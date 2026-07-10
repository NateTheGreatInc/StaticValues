package io.github.natethegreatinc.enums.colors;

public enum Website {
    WEBSITE_FONT_COLOR("#222222"),
    WEBSITE_BACKGROUND_COLOR("#F4F5F5");

    private final String hexCode;

    Website(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }
}
