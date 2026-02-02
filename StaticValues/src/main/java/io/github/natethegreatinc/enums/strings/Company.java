package io.github.natethegreatinc.enums.strings;

public enum Company {
    COMPANY_MOTO("Customers are great but they can be annoying."),
    COMPANY_NAME("NateTheGreat Inc."),
    COMPANY_TELEPHONE("1-800-NAT-GATE"),
    COMPANY_WEBSITE("www.NateTheGreatInc.com");

    private final String value;

    Company(String value) {
        this.value = value;
    }

    public String getString() {
        return value;
    }
}
