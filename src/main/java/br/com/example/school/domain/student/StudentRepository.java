package br.com.example.school.domain.student;

import java.util.List;

public interface StudentRepository {

    void enroll(Student student);

    Student findByDocument(String document);

    List<Student> listAllStudentsMatriculated();

    //...
}
