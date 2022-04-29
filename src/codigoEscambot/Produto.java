/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoEscambot;

/**
 *
 * @author Acer
 */
public class Produto {
    protected int idProduto;
    protected String nome;
    protected int rating;
    protected String tipo;

    public Produto() {
        
        }
    
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public int getRating() {
        return rating;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Produto(String nome, int rating, String tipo, int idProduto) {
        this.nome = nome;
        this.rating = rating;
        this.tipo = tipo;
        this.idProduto = idProduto;
    }
    
}
