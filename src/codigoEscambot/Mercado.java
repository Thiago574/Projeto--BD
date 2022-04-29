/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoEscambot;

import java.text.SimpleDateFormat;

/**
 *
 * @author Acer
 */
public class Mercado extends Produto{
    private String cor;
    private String marca;
    private String utilidade;
    private SimpleDateFormat datadevalidade_;
    private String datadevalidade;
    private int idProdutoMercado;

    public Mercado() {
       
    }

    public int getIdProdutoMercado() {
        return idProdutoMercado;
    }

    public void setIdProdutoMercado(int idProdutoMercado) {
        this.idProdutoMercado = idProdutoMercado;
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

    public Mercado(String nome, int rating, String tipo, String cor, String marca, String utilidade, String datadevalidade, int idProduto){
        super(nome, rating, tipo, idProduto);
        this.cor = cor;
        this.marca = marca;
        this.utilidade = utilidade;
        this.datadevalidade = datadevalidade;
    }

    public Mercado(String nome, int rating, String tipo, String cor, String marca, String utilidade, String datadevalidade, int idProduto, int idProdutoMercado){
        super(nome, rating, tipo, idProduto);
        this.cor = cor;
        this.marca = marca;
        this.utilidade = utilidade;
        this.datadevalidade = datadevalidade;
        this.idProdutoMercado = idProdutoMercado;
    }
    
    public String getDatadevalidade() {
        return datadevalidade;
    }

    public void setDatadevalidade(String datadevalidade) {
        this.datadevalidade = datadevalidade;
    }
    
}
