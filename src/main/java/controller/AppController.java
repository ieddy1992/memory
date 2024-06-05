package controller;

import com.mycompany.memory.dao.UserDAO;
import com.mycompany.memory.model.Credenciais;
import com.mycompany.memory.model.User;

import java.sql.SQLException;
import java.util.List;

public class AppController {

    private UserDAO userDAO;

    public AppController() {
        this.userDAO = new UserDAO();
    }

    // Métodos para manipulação de usuários

    public User getUserByLogin(String login) {
        try {
            return userDAO.getUserByLogin(login);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean verificarSenha(User user, String senha) {
        return user.getSenha().equals(senha);
    }

    public boolean verificarPerguntasSecreta(User user, String resposta1, String resposta2) {
        return user.getPerguntaSecreta1().equalsIgnoreCase(resposta1) &&
               user.getPerguntaSecreta2().equalsIgnoreCase(resposta2);
    }

    public boolean adicionarUsuario(User user) {
        try {
            return userDAO.addUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean atualizarUsuario(User user) {
        try {
            return userDAO.updateUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deletarUsuario(int userId) {
        try {
            return userDAO.deleteUser(userId);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Métodos para manipulação de credenciais

    public List<Credenciais> getCredenciaisByUsuarioId(int usuarioId) {
        try {
            return userDAO.getCredenciaisByUserId(usuarioId);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean adicionarCredenciais(Credenciais credenciais) {
        try {
            return userDAO.addCredenciais(credenciais);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean atualizarCredenciais(Credenciais credenciais) {
        try {
            return userDAO.updateCredenciais(credenciais);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deletarCredenciais(int credenciaisId) {
        try {
            return userDAO.deleteCredenciais(credenciaisId);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
