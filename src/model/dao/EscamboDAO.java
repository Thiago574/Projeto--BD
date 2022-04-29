/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import codigoEscambot.Escambo;
import codigoEscambot.Mercado;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class EscamboDAO {
    public void Escambo(Escambo t, int a, int b){
        
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO escambo (idEscambo,TotalDeitensT,DRating,DataTroca,Empregado_ID,Produto_idProduto,Usuário_idUsuario)VALUES(?,?,?,?,?,?,?)");
            stmt.setInt(1, t.getIdEscambo());
            stmt.setInt(2, t.getTotalDeitensT());
            stmt.setInt(3, t.getDRating());
            stmt.setString(4, t.getDataTroca());
            stmt.setInt(5, t.getEmpregado_ID());
            stmt.setInt(6, t.getProduto_idProduto());
            stmt.setInt(7, t.getUsuário_idUsuario());
                     
            stmt.executeUpdate();
            
            stmt = con.prepareStatement("INSERT INTO detalhesescambo (idDetalhesEscambo,TotalDeTrocas,Escambo_idEscambo)VALUES(?,?,?)");
            stmt.setInt(1, t.getIdDetalhesEscambo());
            stmt.setInt(2, t.getTotalDeTrocas());
            stmt.setInt(3, t.getEscambo_idEscambo());
            
            stmt.executeUpdate();
            
            stmt = con.prepareStatement("DELETE FROM produto WHERE idProduto = ?");
            stmt.setInt(1, a);
            
            stmt.executeUpdate();
            
            stmt = con.prepareStatement("DELETE FROM produtodepartamento WHERE produto_idProduto = ?");
            stmt.setInt(1, a);

            stmt.executeUpdate();
            
            stmt = con.prepareStatement("DELETE FROM produtomercado WHERE produto_idProduto = ?");
            stmt.setInt(1, a);

            stmt.executeUpdate();
            
            stmt = con.prepareStatement("DELETE FROM produto WHERE idProduto = ?");
            stmt.setInt(1, b);
            
            stmt.executeUpdate();
            
            stmt = con.prepareStatement("DELETE FROM produtodepartamento WHERE produto_idProduto = ?");
            stmt.setInt(1, b);

            stmt.executeUpdate();
            
            stmt = con.prepareStatement("DELETE FROM produtomercado WHERE produto_idProduto = ?");
            stmt.setInt(1, b);

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public int countEscambo(){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement("SELECT COUNT(*) FROM produto;");
            rs = stmt.executeQuery();
            System.out.print(rs.getString("COUNT(*)"));
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return 0;
    }
}
    

