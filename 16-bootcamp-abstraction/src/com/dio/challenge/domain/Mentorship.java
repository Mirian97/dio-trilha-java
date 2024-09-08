package com.dio.challenge.domain;

import java.time.LocalDate;

public class Mentorship extends Content {
    private LocalDate mentorshipDate;

    public Mentorship(String title) {
        setTitle(title);
    }

    public double calculateXp() {
       return XP_DEFAULT + 20d;
    }

    public void setMentorshipDate(LocalDate mentorshipDate) {
        this.mentorshipDate = mentorshipDate;
    }

    public LocalDate getMentorshipDate() {
        return mentorshipDate;
    }

    
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitle() + '\'' +
                ", descricao='" + getDescription() + '\'' +
                ", cargaHoraria=" + mentorshipDate +
                '}';
    }
}
