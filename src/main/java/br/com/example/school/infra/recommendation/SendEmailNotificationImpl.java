package br.com.example.school.infra.recommendation;

import br.com.example.school.application.recommendation.SendEmailNotification;
import br.com.example.school.domain.student.Student;

public class SendEmailNotificationImpl implements SendEmailNotification {

    @Override
    public void senMailFor(Student student) {
        //logica de envios de email...
        //sendingMail();
    }
}
