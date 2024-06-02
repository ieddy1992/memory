/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.memory.dao;

import com.mycompany.memory.model.User;
import com.mycompany.memory.util.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.mindrot.jbcrypt.BCrypt;

public class UserDAO {
    public User findByLogin(String login) throws SQLException {
        String sql = "SELECT * FROM usuarios WHERE Login = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, login);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    User user = new User();
                    user.setId(rs.getInt("id"));
                    user.setNome(rs.getString("Nome"));
                    user.setLogin(rs.getString("Login"));
                    user.setSenhaHash(rs.getString("Senha_hash"));
                    user.setEmail(rs.getString("Email"));
                    user.setTelefone(rs.getString("Telefone"));
                    user.setCpf(rs.getString("CPF"));
                    user.setPerguntaSecreta1(rs.getString("Pergunta_Secreta_1"));
                    user.setPerguntaSecreta2(rs.getString("Pergunta_Secreta_2"));
                    user.setAdmin(rs.getBoolean("isAdmin"));
                    return user;
                } else {
                    return null;
                }
            }
        }
    }

    public boolean validatePassword(String plainPassword, String hashedPassword) {
        return BCrypt.checkpw(plainPassword, hashedPassword);
    }
}
