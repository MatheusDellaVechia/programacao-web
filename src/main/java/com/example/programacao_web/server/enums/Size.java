package com.example.programacao_web.server.enums;

public enum Size {
    PP("PP"),
    P("P"),
    M("M"),
    G("G"),
    GG("GG");

    private final String label;

    Size(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}