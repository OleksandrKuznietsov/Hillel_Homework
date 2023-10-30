package edu.hillel.Homework19_DB;

import java.util.Date;

public class Lesson {
    private int id;
    private String name;
    private Date updatedAt;
    private Homework homework;
    private int homeworkId;

    public Lesson(String name, Date updatedAt, int homeworkId) {
        this.name = name;
        this.updatedAt = updatedAt;
        this.homeworkId = homeworkId;
    }

    public Lesson(String name, Date updatedAt, Homework homework) {
        this.name = name;
        this.updatedAt = updatedAt;
        this.homework = homework;
    }

    public Lesson(int id, String name, Date updatedAt, int homeworkId) {
        this.id = id;
        this.name = name;
        this.updatedAt = updatedAt;
        this.homeworkId = homeworkId;
    }

    public Lesson(int id, String name, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.updatedAt = updatedAt;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }



    public int getHomeworkId() {
        return homeworkId;
    }


    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", updatedAt=" + updatedAt +
                ", homeworkId=" + homeworkId +
                '}';
    }
}
