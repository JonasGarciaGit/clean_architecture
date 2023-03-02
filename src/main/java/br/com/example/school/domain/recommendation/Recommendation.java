package br.com.example.school.domain.recommendation;

import br.com.example.school.domain.student.Student;

import java.time.LocalDateTime;

public class Recommendation {

    private Student indicated;
    private Student indicative;
    private LocalDateTime recommendationDate;

    public Recommendation(Student indicado, Student indicante) {
        this.indicated = indicado;
        this.indicative = indicante;
        this.recommendationDate = LocalDateTime.now();
    }

    public Student getIndicated() {
        return indicated;
    }

    public Student getIndicative() {
        return indicative;
    }

    public LocalDateTime getRecommendationDate() {
        return recommendationDate;
    }
}
