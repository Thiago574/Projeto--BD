/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import codigoEscambot.Empregado;
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
/**
 *
 * @author Acer
 */
public class EmpregadoDAO {
    public void create(Empregado e){
        Random rand = new Random();
        int x = rand.nextInt(100);
        
        Connection con = ConnectionFactory.getConnection();
        Connection con1 = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            
            stmt = con.prepareStatement("INSERT INTO privilégios (idPrivilégios,Nome,TemPrivilégios)VALUES(?,?,?)");
            stmt.setInt(1, x);
            stmt.setString(2, e.getNome());
            stmt.setString(3, e.getTemPrivilegios());
            
            stmt.executeUpdate();
            
            ConnectionFactory.closeConnection(con, stmt);
            
            
            stmt = con1.prepareStatement("INSERT INTO empregado (ID,senha,login,Nome,DataDeNascimento,CPF,Cidade,Telefone,E_mail,Cargo,Foto,Privilégios_idPrivilégios)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1, e.getID());
            stmt.setString(2, e.getSenha());
            stmt.setString(3, e.getLogin());
            stmt.setString(4, e.getNome());
            stmt.setString(5, e.getData());
            stmt.setString(6, e.getCpf());
            stmt.setString(7, e.getCidade());
            stmt.setString(8, e.getTelefone());
            stmt.setString(9, e.getE_mail());
            stmt.setString(10, e.getCargo());
            stmt.setString(11, null);
            stmt.setInt(12, x);
            

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con1, stmt);
        }
    }
    
    public List<Empregado> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Empregado> empregados = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM empregado");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Empregado empregado = new Empregado();

                empregado.setID(rs.getInt("ID"));
                empregado.setSenha(rs.getString("Senha"));
                empregado.setLogin(rs.getString("login"));
                empregado.setNome(rs.getString("Nome"));
                empregado.setData(rs.getString("DataDeNascimento"));
                empregado.setCpf(rs.getString("CPF"));
                empregado.setCidade(rs.getString("Cidade"));
                empregado.setTelefone(rs.getString("Telefone"));
                empregado.setE_mail(rs.getString("E_mail"));
                empregado.setCargo(rs.getString("Cargo"));
                empregado.setIdPrivilegios(rs.getInt("Privilégios_idPrivilégios"));
                //empregado.setTemPrivilegios(rs.getString("Privilégios_idPrivilégios"));
                empregados.add(empregado);
            }
            

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return empregados;

    }
    
    public List<Empregado> readNome(String nome) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Empregado> empregados = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM empregado WHERE Nome LIKE ?");
            stmt.setString(1, "%"+nome+"%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Empregado empregado = new Empregado();

                empregado.setID(rs.getInt("ID"));
                empregado.setSenha(rs.getString("Senha"));
                empregado.setLogin(rs.getString("login"));
                empregado.setNome(rs.getString("Nome"));
                empregado.setData(rs.getString("DataDeNascimento"));
                empregado.setCpf(rs.getString("CPF"));
                empregado.setCidade(rs.getString("Cidade"));
                empregado.setTelefone(rs.getString("Telefone"));
                empregado.setE_mail(rs.getString("E_mail"));
                empregado.setCargo(rs.getString("Cargo"));
                empregado.setIdPrivilegios(rs.getInt("Privilégios_idPrivilégios"));
                //empregado.setTemPrivilegios(rs.getString("Privilégios_idPrivilégios"));
                empregados.add(empregado);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return empregados;

    }
    
    
    public void update(Empregado e){
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE empregado SET senha = ?,login = ? ,Nome = ? ,DataDeNascimento = ? ,CPF = ? ,Cidade = ? ,Telefone = ?,E_mail = ?, Cargo = ? WHERE ID = ?");
            stmt.setString(1, e.getSenha());
            stmt.setString(2, e.getLogin());
            stmt.setString(3, e.getNome());
            stmt.setString(4, e.getData());
            stmt.setString(5, e.getCpf());
            stmt.setString(6, e.getCidade());
            stmt.setString(7, e.getTelefone());
            stmt.setString(8, e.getE_mail());
            stmt.setString(9, e.getCargo());
            stmt.setInt(10, e.getID());
            stmt.executeUpdate();
            
            stmt = con.prepareStatement("UPDATE privilégios SET Nome = ?,TemPrivilégios = ?  WHERE idPrivilégios = ?");
            stmt.setString(1, e.getNome());
            stmt.setString(2, e.getTemPrivilegios());
            stmt.setInt(3, e.getIdPrivilegios());
            stmt.executeUpdate();
            

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar!");
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Empregado e) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM empregado WHERE ID = ?");
            stmt.setInt(1, e.getID());
            
            stmt.executeUpdate();
            
            stmt = con.prepareStatement("DELETE FROM privilégios WHERE Nome = ?");
            stmt.setString(1, e.getNome());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
}
