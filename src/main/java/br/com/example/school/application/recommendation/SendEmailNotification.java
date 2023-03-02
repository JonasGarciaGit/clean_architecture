package br.com.example.school.application.recommendation;

import br.com.example.school.domain.student.Student;

public interface SendEmailNotification {
    void senMailFor(Student student);
}
