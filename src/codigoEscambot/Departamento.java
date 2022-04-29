/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoEscambot;

/**
 *
 * @author Acer
 */
public class Departamento extends Produto{
    private String cor;
    private String marca;
    private String utilidade;
    private int idProdutoDepartamento;

    public int getIdProdutoDepartamento() {
        return idProdutoDepartamento;
    }

    public void setIdProdutoDepartamento(int idProdutoDepartamento) {
        this.idProdutoDepartamento = idProdutoDepartamento;
    }
    
    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getUtilidade() {
        return utilidade;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setUtilidade(String utilidade) {
        this.utilidade = utilidade;
    }

    public Departamento(String nome, int rating, String tipo, String cor, String marca, String utilidade, int idProduto) {
        super(nome, rating, tipo, idProduto);
        this.cor = cor;
        this.marca = marca;
        this.utilidade = utilidade;
    }
    
    public Departamento(String nome, int rating, String tipo, String cor, String marca, String utilidade, int idProduto, int idProdutoDepartamento) {
        super(nome, rating, tipo, idProduto);
        this.cor = cor;
        this.marca = marca;
        this.utilidade = utilidade;
        this.idProdutoDepartamento = idProdutoDepartamento;
    }
    
    
}
