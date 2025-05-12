package com.example.programacao_web.server.enums;

public enum Color {
    BLACK("Preto"),
    WHITE("Branco"),
    BLUE("Azul"),
    RED("Vermelho"),
    GREEN("Verde"),
    YELLOW("Amarelo");

    private final String label;

    Color(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}