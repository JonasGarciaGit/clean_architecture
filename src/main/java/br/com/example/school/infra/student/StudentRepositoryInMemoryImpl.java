package br.com.example.school.infra.student;

import br.com.example.school.domain.student.Student;
import br.com.example.school.domain.student.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryInMemoryImpl implements StudentRepository {

   private List<Student> matriculateStudents = new ArrayList<>();
    @Override
    public void enroll(Student student) {
        this.matriculateStudents.add(student);
    }

    @Override
    public Student findByDocument(String document) {
        return this.matriculateStudents.stream()
                .filter(a -> a.getDocument().getValue().equals(document))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Student not found"));
    }

    @Override
    public List<Student> listAllStudentsMatriculated() {
        return null;
    }
}
