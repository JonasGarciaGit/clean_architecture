package br.com.example.school.domain.student;

import java.util.ArrayList;
import java.util.List;

// Entidade, classe que tenha um objeto que o identifique
public class Student {

    private CPF document;
    private String name;
    private Mail email;
    private List<CellPhone> cellPhone = new ArrayList<>();
    private String password;

    public Student(){}

    public Student(CPF document, String name, Mail email) {
        this.document = document;
        this.name = name;
        this.email = email;
    }

    public void addCellphone(CellPhone cellPhone){
        this.cellPhone.add(cellPhone);
    }

    public CPF getDocument() {
        return document;
    }

    public String getName() {
        return name;
    }

    public Mail getMail() {
        return email;
    }

    public List<CellPhone> getCellPhone() {
        return cellPhone;
    }
}
