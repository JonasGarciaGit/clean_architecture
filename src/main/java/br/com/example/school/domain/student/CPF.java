package br.com.example.school.domain.student;

public class CPF {

    private String value;

    public CPF(String value) {
        if (value == null || !value.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}"))
            throw new IllegalArgumentException("CPF invalido!");

        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
