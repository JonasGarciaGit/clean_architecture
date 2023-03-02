package br.com.example.school.application.enroll;

import br.com.example.school.domain.student.Student;
import br.com.example.school.domain.student.StudentRepository;

//Service / Use Case
public class EnrollStudent {

    private final StudentRepository repository;
    public EnrollStudent(StudentRepository repository) {
        this.repository = repository;
    }

    // COMMAND
    public void execute(StudentDto data){
        Student student = data.createStudent();
        repository.enroll(student);
    }
}
