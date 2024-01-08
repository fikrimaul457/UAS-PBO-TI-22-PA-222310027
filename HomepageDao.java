package com.ibik.pbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HomepageDao {
    // Informasi koneksi database
    private static final String DB_URL = "jdbc:mysql://localhost:3306/survey_iso";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    private String recommendation;

    public HomepageDao() {
        try {
            // Register driver JDBC MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Tidak dapat menemukan driver JDBC MySQL");
        }
    }

    // Fungsi untuk menyimpan email ke dalam database
    public void saveEmail(score scoring) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "INSERT INTO scoring (email) VALUES (?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, scoring.getEmail());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error saat menyimpan email ke database", e);
        }
    }

    // Fungsi untuk menyimpan skor dan rekomendasi ke dalam database
    public void saveScore(score scoring) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "UPDATE scoring SET score = ?, rekomendasi = ? WHERE email = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                // Sesuaikan logika skoring dan rekomendasi berdasarkan ISO 25010 dan SEM
                int totalScore = scoring.getScore();
                if (totalScore >= 30) {
                    recommendation = "Baik";
                } else if (totalScore >= 20) {
                    recommendation = "Cukup Baik";
                } else {
                    recommendation = "Kurang Baik";
                }

                preparedStatement.setInt(1, totalScore);
                preparedStatement.setString(2, recommendation);
                preparedStatement.setString(3, scoring.getEmail());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error saat menyimpan skor ke database", e);
        }
    }
}
