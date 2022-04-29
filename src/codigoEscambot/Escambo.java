/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigoEscambot;

/**
 *
 * @author gusta
 */
public class Escambo {
    protected int idEscambo;
    protected int TotalDeitensT;
    protected int DRating;
    protected String DataTroca;
    protected int Empregado_ID;
    protected int Produto_idProduto;
    protected int Usuário_idUsuario;
    protected int idDetalhesEscambo;
    protected int TotalDeTrocas;
    protected int Escambo_idEscambo;

    public int getIdEscambo() {
        return idEscambo;
    }

    public void setIdEscambo(int idEscambo) {
        this.idEscambo = idEscambo;
    }

    public int getTotalDeitensT() {
        return TotalDeitensT;
    }

    public void setTotalDeitensT(int TotalDeitensT) {
        this.TotalDeitensT = TotalDeitensT;
    }

    public int getDRating() {
        return DRating;
    }

    public void setDRating(int DRating) {
        this.DRating = DRating;
    }

    public String getDataTroca() {
        return DataTroca;
    }

    public void setDataTroca(String DataTroca) {
        this.DataTroca = DataTroca;
    }

    public int getEmpregado_ID() {
        return Empregado_ID;
    }

    public void setEmpregado_ID(int Empregado_ID) {
        this.Empregado_ID = Empregado_ID;
    }

    public int getProduto_idProduto() {
        return Produto_idProduto;
    }

    public void setProduto_idProduto(int Produto_idProduto) {
        this.Produto_idProduto = Produto_idProduto;
    }

    public int getUsuário_idUsuario() {
        return Usuário_idUsuario;
    }

    public void setUsuário_idUsuario(int Usuário_idUsuario) {
        this.Usuário_idUsuario = Usuário_idUsuario;
    }

    public int getIdDetalhesEscambo() {
        return idDetalhesEscambo;
    }

    public void setIdDetalhesEscambo(int idDetalhesEscambo) {
        this.idDetalhesEscambo = idDetalhesEscambo;
    }

    public int getTotalDeTrocas() {
        return TotalDeTrocas;
    }

    public void setTotalDeTrocas(int TotalDeTrocas) {
        this.TotalDeTrocas = TotalDeTrocas;
    }

    public int getEscambo_idEscambo() {
        return Escambo_idEscambo;
    }

    public void setEscambo_idEscambo(int Escambo_idEscambo) {
        this.Escambo_idEscambo = Escambo_idEscambo;
    }

    public Escambo(int idEscambo, int TotalDeitensT, int DRating, String DataTroca, int Empregado_ID, int Produto_idProduto, int Usuário_idUsuario, int idDetalhesEscambo, int TotalDeTrocas, int Escambo_idEscambo) {
        this.idEscambo = idEscambo;
        this.TotalDeitensT = TotalDeitensT;
        this.DRating = DRating;
        this.DataTroca = DataTroca;
        this.Empregado_ID = Empregado_ID;
        this.Produto_idProduto = Produto_idProduto;
        this.Usuário_idUsuario = Usuário_idUsuario;
        this.idDetalhesEscambo = idDetalhesEscambo;
        this.TotalDeTrocas = TotalDeTrocas;
        this.Escambo_idEscambo = Escambo_idEscambo;
    }

    public Escambo() {
    }
    
    
    
    
    
    
}
