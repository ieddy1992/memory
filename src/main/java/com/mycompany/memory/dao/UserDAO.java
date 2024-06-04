package com.mycompany.memory.dao;

import com.mycompany.memory.model.User;
import com.mycompany.memory.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    public User getUserByLogin(String login) {
        String query = "SELECT * FROM usuarios WHERE Login = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, login);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    User user = new User();
                    user.setId(resultSet.getInt("id"));
                    user.setNome(resultSet.getString("Nome"));
                    user.setLogin(resultSet.getString("Login"));
                    user.setSenha(resultSet.getString("Senha"));
                    user.setEmail(resultSet.getString("Email"));
                    user.setTelefone(resultSet.getString("Telefone"));
                    user.setCpf(resultSet.getString("CPF"));
                    user.setPerguntaSecreta1(resultSet.getString("Pergunta_Secreta_1"));
                    user.setPerguntaSecreta2(resultSet.getString("Pergunta_Secreta_2"));
                    user.setAdmin(resultSet.getBoolean("isAdmin"));
                    return user;
                }
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao obter usuário por login: " + ex.getMessage());
        }
        return null;
    }

    public boolean verificarSenhaCorreta(String login, String senha) {
        String query = "SELECT id FROM usuarios WHERE Login = ? AND Senha = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, senha);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                return resultSet.next(); // Retorna true se encontrar o login e senha correspondentes
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao verificar senha correta: " + ex.getMessage());
            return false;
        }
    }

    public boolean verificarPerguntasSecretas(String login, String resposta1, String resposta2) {
        String query = "SELECT id FROM usuarios WHERE Login = ? AND Pergunta_Secreta_1 = ? AND Pergunta_Secreta_2 = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, resposta1);
            preparedStatement.setString(3, resposta2);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                return resultSet.next();
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao verificar perguntas secretas: " + ex.getMessage());
            return false;
        }
    }

    public boolean adicionarUsuario(User user) {
        String query = "INSERT INTO usuarios (Nome, Login, Senha, Email, Telefone, CPF, Pergunta_Secreta_1, Pergunta_Secreta_2, isAdmin) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, user.getNome());
            preparedStatement.setString(2, user.getLogin());
            preparedStatement.setString(3, user.getSenha());
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setString(5, user.getTelefone());
            preparedStatement.setString(6, user.getCpf());
            preparedStatement.setString(7, user.getPerguntaSecreta1());
            preparedStatement.setString(8, user.getPerguntaSecreta2());
            preparedStatement.setBoolean(9, user.isAdmin());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao adicionar usuário: " + ex.getMessage());
            return false;
        }
    }
}