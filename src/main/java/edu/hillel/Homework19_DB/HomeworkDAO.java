package edu.hillel.Homework19_DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HomeworkDAO {
    private final Connection connection;

    public HomeworkDAO() {
        connection = DataBaseConnection.getConnection();
    }

    public Homework addHomework(Homework homework) {
        String sql = "INSERT INTO Homework (id, name, description) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, homework.getId());
            statement.setString(2, homework.getName());
            statement.setString(3, homework.getDescription());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return homework;
    }
}
