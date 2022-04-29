/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import codigoEscambot.Usuario;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {
    
    public void create(Usuario u){
        
        Connection con = ConnectionFactory.getConnection();
        
        Random rand = new Random();
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO Usuário (idUsuario,senha,login,Nome,CPF,Cidade,Telefone,DataDeNascimento)VALUES(?,?,?,?,?,?,?,?)");
            stmt.setInt(1, u.getIdUsuario());
            stmt.setString(2, u.getSenha());
            stmt.setString(3, u.getLogin());
            stmt.setString(4, u.getNome());
            stmt.setString(5, u.getCpf());
            stmt.setString(6, u.getCidade());
            stmt.setString(7, u.getTelefone());
            stmt.setString(8, u.getData());
            

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Usuario> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Usuario> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM usuário");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Usuario usuario = new Usuario();

                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setSenha(rs.getString("Senha"));
                usuario.setLogin(rs.getString("login"));
                usuario.setNome(rs.getString("Nome"));
                usuario.setData(rs.getString("DataDeNascimento"));
                usuario.setCpf(rs.getString("CPF"));
                usuario.setCidade(rs.getString("Cidade"));
                usuario.setTelefone(rs.getString("Telefone"));
                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return usuarios;

    }
    
    public List<Usuario> readNome(String nome) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Usuario> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM usuário WHERE Nome LIKE ?");
            stmt.setString(1, "%"+nome+"%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Usuario usuario = new Usuario();

                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setSenha(rs.getString("Senha"));
                usuario.setLogin(rs.getString("login"));
                usuario.setNome(rs.getString("Nome"));
                usuario.setData(rs.getString("DataDeNascimento"));
                usuario.setCpf(rs.getString("CPF"));
                usuario.setCidade(rs.getString("Cidade"));
                usuario.setTelefone(rs.getString("Telefone"));
                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return usuarios;

    }
    
    public void update(Usuario u){
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE usuário SET senha = ?,login = ? ,Nome = ? ,CPF = ? ,Cidade = ? ,Telefone = ? ,DataDeNascimento = ?  WHERE idUsuario = ?");
            stmt.setInt(8, u.getIdUsuario());
            stmt.setString(1, u.getSenha());
            stmt.setString(2, u.getLogin());
            stmt.setString(3, u.getNome());
            stmt.setString(4, u.getCpf());
            stmt.setString(5, u.getCidade());
            stmt.setString(6, u.getTelefone());
            stmt.setString(7, u.getData());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar!");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Usuario u) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM usuário WHERE idUsuario = ?");
            stmt.setInt(1, u.getIdUsuario());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
}
