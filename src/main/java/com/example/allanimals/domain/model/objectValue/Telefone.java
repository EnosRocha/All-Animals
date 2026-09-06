package com.example.allanimals.domain.model.objectValue;

public class Telefone {

    private final String valor;

    public Telefone(String valor) {
        if (valor == null || !valor.matches("^(\\+55)?\\s?(\\(\\d{2}\\)|\\d{2})\\s?\\d{4,5}[\\-\\s]?\\d{4}$")) {
            throw new IllegalArgumentException("Telefone inválido: " + valor);
        }
        this.valor = valor.replaceAll("[^\\d+]", "");
    }

    public String getValor() {
        return valor;
    }

    public String getFormatado() {
        // ex: 84912345678 → (84) 91234-5678
        String d = valor.replaceAll("^\\+55", "");
        return d.length() == 11
                ? "(%s) %s-%s".formatted(d.substring(0, 2), d.substring(2, 7), d.substring(7))
                : "(%s) %s-%s".formatted(d.substring(0, 2), d.substring(2, 6), d.substring(6));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Telefone)) return false;
        return valor.equals(((Telefone) o).valor);
    }

    @Override
    public int hashCode() {
        return valor.hashCode();
    }

    @Override
    public String toString() {
        return getFormatado();
    }
}
