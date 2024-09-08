package com.dio.challenge.domain;

public class Course extends Content {
    protected int workload;

    public Course(String title) {
        setTitle(title);
    }

    public double calculateXp() {
        return workload * XP_DEFAULT;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    public int getWorkload() {
        return workload;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitle() + '\'' +
                ", descricao='" + getDescription() + '\'' +
                ", cargaHoraria=" + workload +
                '}';
    }
}
