package io.github.natethegreatinc.enums.strings;

public enum Company {
    COMPANY_MOTO("Customers are great and that has always been our position on the matter."),
    COMPANY_NAME("NateTheGreat Incorporated."),
    COMPANY_TELEPHONE("1-800-555-0199"),
    COMPANY_WEBSITE("www.NateTheGreatInc.com");

    private final String value;

    Company(String value) {
        this.value = value;
    }

    public String getString() {
        return value;
    }
}
