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
public class Pessoa {
    protected String nome;
    protected SimpleDateFormat data_;
    protected String data;
    protected String cpf;
    protected String senha;
    protected String login;
    protected String estado;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Pessoa(String nome,String data, String cpf, String senha, String login) {
        this.nome = nome;
        this.data = data;
        this.cpf = cpf;
        this.senha = senha;
        this.login = login;
    }
    
    public Pessoa(){
        
    }
    
}
