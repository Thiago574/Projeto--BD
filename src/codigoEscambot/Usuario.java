/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoEscambot;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

/**
 *
 * @author Acer
 */
public class Usuario extends Pessoa{
    private int idUsuario;
    private String cidade;
    private String telefone;
    public ArrayList<Produto> produtos_user = new ArrayList();
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public Usuario(String cidade, String telefone, String nome, String data, String cpf, String senha, String login, int idUsuario) {
        super(nome, data, cpf, senha, login);
        this.cidade = cidade;
        this.telefone = telefone;
        this.idUsuario = idUsuario;
       
    }
    
    public Usuario(int idUsuario){
        this.idUsuario = idUsuario;
    }
    
    public Usuario(){
        
    }
    
    public boolean isSenha(String senha){
        if(this.senha.equals(senha)){
            return true;
        }else{
            return false;
        }
    }
    
}
