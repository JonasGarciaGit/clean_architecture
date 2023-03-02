package br.com.example.school.application.enroll;

import br.com.example.school.domain.student.CPF;
import br.com.example.school.domain.student.Mail;
import br.com.example.school.domain.student.Student;

public class StudentDto {
    private String name;
    private String document;
    private String mail;

    public StudentDto(String name, String document, String mail) {
        this.name = name;
        this.document = document;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }

    public String getMail() {
        return mail;
    }

    public Student createStudent() {
        return new Student(new CPF(document),name, new Mail(mail));
    }
}
