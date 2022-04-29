/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import codigoEscambot.Usuario;
import codigoEscambot.Produto;
import codigoEscambot.Mercado;
import codigoEscambot.Departamento;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProdutoDAO {
    
    public void createProdutoDepartamento(Departamento d){
        
        Connection con = ConnectionFactory.getConnection();
        
        Random rand = new Random();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO produto (idProduto,NomeDoProduto,Rating,TipoDoProduto,CorDoProduto,MarcaDoProduto,UtilidadeDoProduto)VALUES(?,?,?,?,?,?,?)");
            stmt.setInt(1, d.getIdProduto());
            stmt.setString(2, d.getNome());
            stmt.setInt(3, d.getRating());
            stmt.setString(4, d.getTipo());
            stmt.setString(5, d.getCor());
            stmt.setString(6, d.getMarca());
            stmt.setString(7, d.getUtilidade());
  
            stmt.executeUpdate();
            
            stmt = con.prepareStatement("INSERT INTO produtodepartamento (idProdutoDepartamento,TAGProdutoDepartamento,produto_idProduto)VALUES(?,?,?)");
            stmt.setInt(1, d.getIdProdutoDepartamento());
            stmt.setString(2, "Produto de Departamento");
            stmt.setInt(3, d.getIdProduto());
            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    public void createProdutoMercado(Mercado m){
        
        Connection con = ConnectionFactory.getConnection();
        
        Random rand = new Random();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO produto (idProduto,NomeDoProduto,Rating,TipoDoProduto,CorDoProduto,MarcaDoProduto,UtilidadeDoProduto)VALUES(?,?,?,?,?,?,?)");
            stmt.setInt(1, m.getIdProduto());
            stmt.setString(2, m.getNome());
            stmt.setInt(3, m.getRating());
            stmt.setString(4, m.getTipo());
            stmt.setString(5, m.getCor());
            stmt.setString(6, m.getMarca());
            stmt.setString(7, m.getUtilidade());
  
            stmt.executeUpdate();
            
            stmt = con.prepareStatement("INSERT INTO produtomercado (idProdutoMercado,DataDeValidade,TAGProdutoMercado,produto_idProduto)VALUES(?,?,?,?)");
            stmt.setInt(1, m.getIdProdutoMercado());
            stmt.setString(2, m.getDatadevalidade());
            stmt.setString(3, "Produto de Mercado");
            stmt.setInt(4, m.getIdProduto());
            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    public List<Mercado> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Mercado> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Mercado produto = new Mercado();

                produto.setIdProduto(rs.getInt("idProduto"));
                produto.setNome(rs.getString("NomeDoProduto"));
                produto.setRating(rs.getInt("Rating"));
                produto.setTipo(rs.getString("TipoDoProduto"));
                produto.setCor(rs.getString("CorDoProduto"));
                produto.setMarca(rs.getString("MarcaDoProduto"));
                produto.setUtilidade(rs.getString("UtilidadeDoProduto"));
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return produtos;

    }
    
    public List<Mercado> readNome(String nome) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Mercado> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE NomeDoProduto LIKE ?");
            stmt.setString(1, "%"+nome+"%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Mercado produto = new Mercado();

                produto.setIdProduto(rs.getInt("idProduto"));
                produto.setNome(rs.getString("NomeDoProduto"));
                produto.setRating(rs.getInt("Rating"));
                produto.setTipo(rs.getString("TipoDoProduto"));
                produto.setCor(rs.getString("CorDoProduto"));
                produto.setMarca(rs.getString("MarcaDoProduto"));
                produto.setUtilidade(rs.getString("UtilidadeDoProduto"));
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return produtos;

    }
    
    public void update(Mercado e){
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE produto SET NomeDoProduto = ?,Rating = ? ,TipoDoProduto = ? ,CorDoProduto = ? ,MarcaDoProduto = ?,UtilidadeDoProduto = ? WHERE idProduto = ?");
            stmt.setString(1, e.getNome());
            stmt.setInt(2, e.getRating());
            stmt.setString(3, e.getTipo());
            stmt.setString(4, e.getCor());
            stmt.setString(5, e.getMarca());
            stmt.setString(6, e.getUtilidade());
            stmt.setInt(7, e.getIdProduto());
            
            stmt.executeUpdate();
            
            stmt = con.prepareStatement("UPDATE produtomercado SET DataDeValidade = ?  WHERE produto_idProduto = ?");
            stmt.setString(1, e.getDatadevalidade());
            stmt.setInt(2, e.getIdProduto());
            stmt.executeUpdate();
            

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar!");
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void update(Departamento e){
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE produto SET NomeDoProduto = ?,Rating = ? ,TipoDoProduto = ? ,CorDoProduto = ? ,MarcaDoProduto = ?,UtilidadeDoProduto = ? WHERE idProduto = ?");
            stmt.setString(1, e.getNome());
            stmt.setInt(2, e.getRating());
            stmt.setString(3, e.getTipo());
            stmt.setString(4, e.getCor());
            stmt.setString(5, e.getMarca());
            stmt.setString(6, e.getUtilidade());
            stmt.setInt(7, e.getIdProduto());
            
            stmt.executeUpdate();
            

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar!");
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Mercado e) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM produto WHERE idProduto = ?");
            stmt.setInt(1, e.getIdProduto());
            
            stmt.executeUpdate();
            
            stmt = con.prepareStatement("DELETE FROM produtodepartamento WHERE produto_idProduto = ?");
            stmt.setInt(1, e.getIdProduto());

            stmt.executeUpdate();
            
            stmt = con.prepareStatement("DELETE FROM produtomercado WHERE produto_idProduto = ?");
            stmt.setInt(1, e.getIdProduto());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
}
