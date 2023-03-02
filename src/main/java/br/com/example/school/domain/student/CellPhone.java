package br.com.example.school.domain.student;

public class CellPhone {

    private String ddd;
    private String number;
    public CellPhone(String ddd, String number) {

        if(ddd == null || number == null){
            throw new IllegalArgumentException("ddd and number can't be null");
        }

        if(!ddd.matches("\\d{2}")){
            throw new IllegalArgumentException("Invalid ddd!");
        }

        if(!number.matches("\\d{2}|\\d{9}")){
            throw new IllegalArgumentException("Invalid number!");
        }

        this.ddd = ddd;
        this.number = number;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumber() {
        return number;
    }
}
