package com.ibik.pbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionDB {
    private Connection conn;

    public Connection connect() throws SQLException {
        String host = "localhost";
        String dbName = "kusioner_ISO";
        String dbuser = "root";
        String dbpassword = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        conn = DriverManager.getConnection("jdbc:mysql://" + host + "/" + dbName, dbuser, dbpassword);

        return conn;
    }

    public void close() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }
}
