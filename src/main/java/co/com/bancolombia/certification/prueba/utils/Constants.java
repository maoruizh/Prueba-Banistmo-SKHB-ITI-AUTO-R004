package co.com.bancolombia.certification.prueba.utils;

public enum Constants {
    ACTOR_PAGE("jomruiz@bancolombia.com.co"),
    URL("https://www.bancolombia.com/personas");

    private String constant;

    Constants(String constant) {
        this.constant = constant;
    }

    public String getConstant() {
        return constant;
    }
}
