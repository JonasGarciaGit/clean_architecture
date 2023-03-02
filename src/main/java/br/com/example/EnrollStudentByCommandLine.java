package br.com.example;

import br.com.example.school.application.enroll.EnrollStudent;
import br.com.example.school.application.enroll.StudentDto;
import br.com.example.school.infra.student.StudentRepositoryInMemoryImpl;

public class EnrollStudentByCommandLine {
    public static void main(String[] args) {

        String name = "Jonas Garcia";
        String cpf = ("475.492.258-18");
        String mail = ("jonas@email.com");

        EnrollStudent enrollStudent = new EnrollStudent(new StudentRepositoryInMemoryImpl());
        enrollStudent.execute(new StudentDto(name, cpf, mail));
    }
}