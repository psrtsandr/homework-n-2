package org.example;

public record FirstName(String value) {
    public FirstName {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Firstname must be specified");
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
