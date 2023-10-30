package edu.hillel.Homework19_DB;

import java.sql.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws SQLException {


        Homework homework1 = new Homework(1, "Java homework1", "add implementation");
        Homework homework2 = new Homework(2, "Java homework2", "create table");
        Homework homework3 = new Homework(3, "Java homework3", "execute tasks");


        Lesson lesson1 = new Lesson("Lesson1", new Date(), homework1.getId());
        Lesson lesson2 = new Lesson("Lesson2", new Date(), homework2.getId());
        Lesson lesson3 = new Lesson("Lesson3", new Date(), homework3.getId());


        LessonDAO lessonDAO = new LessonDAO();
        HomeworkDAO homeworkDAO = new HomeworkDAO();

        homeworkDAO.addHomework(homework1);
        homeworkDAO.addHomework(homework2);
        homeworkDAO.addHomework(homework3);

        lessonDAO.addLesson(lesson1);
        lessonDAO.addLesson(lesson2);
        lessonDAO.addLesson(lesson3);


        System.out.println(lessonDAO.getLessonById(2));

        System.out.println(lessonDAO.getAllLessons());

        lessonDAO.deleteLesson(3);

        System.out.println(lessonDAO.getAllLessons());

    }
}
