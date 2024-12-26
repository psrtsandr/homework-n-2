package org.example;

public record LastName(String value) {
    public LastName {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Lastname must be specified");
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
