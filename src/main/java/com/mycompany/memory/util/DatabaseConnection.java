package com.mycompany.memory.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://memory-memory.g.aivencloud.com:27047/memory";
    private static final String USER = "27047";
    private static final String PASSWORD = "AVNS_WT1RatM5TkttzoYIHd5";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
