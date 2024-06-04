package com.mycompany.memory.dao;

import com.mycompany.memory.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CredenciaisDAO {
    public boolean adicionarCredenciais(int usuarioId, String sistema, String login, String senha) {
        String query = "INSERT INTO acessos (usuario_id, Sistema, Login, Senha) VALUES (?, ?, ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, usuarioId);
            preparedStatement.setString(2, sistema);
            preparedStatement.setString(3, login);
            preparedStatement.setString(4, senha);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao adicionar credenciais: " + ex.getMessage());
            return false;
        }
    }

    public ResultSet getCredenciaisPorUsuarioId(int usuarioId) {
        String query = "SELECT * FROM acessos WHERE usuario_id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, usuarioId);
            return preparedStatement.executeQuery();
        } catch (SQLException ex) {
            System.err.println("Erro ao obter credenciais: " + ex.getMessage());
            return null;
        }
    }
}
