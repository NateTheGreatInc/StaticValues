package io.github.natethegreatinc.enums.colors;

public enum Website {
    WEBSITE_FONT_COLOR("#444444"),
    WEBSITE_BACKGROUND_COLOR("#F5F5F5");

    private final String hexCode;

    Website(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }
}
