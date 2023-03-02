package br.com.example.school.application.enroll;


import br.com.example.school.domain.student.Student;
import br.com.example.school.infra.student.StudentRepositoryInMemoryImpl;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnrollStudentTest {

    @Test
    public void studentMustBePersisted(){
        StudentRepositoryInMemoryImpl repositoryInMemory = new StudentRepositoryInMemoryImpl();
        EnrollStudent useCase = new EnrollStudent(repositoryInMemory);

        StudentDto studentDto = new StudentDto("name","475.492.258-18","jonas@gmail.com");
        useCase.execute(studentDto);

        Student studentFound = repositoryInMemory.findByDocument("475.492.258-18");

        assertEquals("name", studentFound.getName());
        assertEquals("475.492.258-18", studentFound.getDocument().getValue());
        assertEquals("jonas@gmail.com", studentFound.getMail().getAddress());
    }

}
