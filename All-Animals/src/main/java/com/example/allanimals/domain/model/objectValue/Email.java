package com.example.allanimals.domain.model.objectValue;

public class Email {
    private final String email;


    public Email(String value) {
        if (value == null || !value.matches("^[\\w._%+\\-]+@[\\w.\\-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Email inválido: " + value);
        }
        this.email = value.toLowerCase();
    }

    public String getEmail() {
        return email;
    }
}
