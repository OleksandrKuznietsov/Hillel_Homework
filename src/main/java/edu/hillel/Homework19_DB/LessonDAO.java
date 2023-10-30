package edu.hillel.Homework19_DB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LessonDAO {
    private final Connection connection;

    public LessonDAO() {
        connection = DataBaseConnection.getConnection();
    }

    public void addLesson(Lesson lesson) {
        String sql = "INSERT INTO Lesson (name, updatedAt, homework_id) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, lesson.getName());
            statement.setDate(2, new java.sql.Date(lesson.getUpdatedAt().getTime()));
            statement.setInt(3, lesson.getHomeworkId());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void deleteLesson(int lessonId) {
        String sql = "DELETE FROM Lesson WHERE id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, lessonId);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public List<Lesson> getAllLessons() {
        List<Lesson> lessons = new ArrayList<>();
        String sql = "SELECT * FROM Lesson";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                lessons.add(new Lesson(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getDate("updatedAt"),
                        resultSet.getInt("homework_id")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lessons;
    }


    public Lesson getLessonById(int lessonId) {
        String sql = "SELECT * FROM Lesson WHERE id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, lessonId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Lesson(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getDate("updatedAt"),
                        resultSet.getInt("homework_id"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
