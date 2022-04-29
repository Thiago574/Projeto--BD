/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoEscambot;

/**
 *
 * @author Acer
 */
public class Empregado extends Pessoa{
    private int ID;
    private String foto;
    private String cidade;
    private String telefone;
    private String E_mail;
    private String cargo;
    private String TemPrivilegios;
    private int idPrivilegios;

    public Empregado() {
        
   }

    public int getIdPrivilegios() {
        return idPrivilegios;
    }

    public void setIdPrivilegios(int idPrivilegios) {
        this.idPrivilegios = idPrivilegios;
    }

    
    public String getTemPrivilegios() {
        return TemPrivilegios;
    }

    public void setTemPrivilegios(String TemPrivilegios) {
        this.TemPrivilegios = TemPrivilegios;
    }

    

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String getE_mail() {
        return E_mail;
    }

    public void setE_mail(String E_mail) {
        this.E_mail = E_mail;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Empregado(int ID, String telefone, String E_mail, String cargo, String nome, String data, String cpf, String senha, String login, String TemPrivilegios, String cidade) {
        super(nome, data, cpf, senha, login);
        this.cidade = cidade;
        this.TemPrivilegios = TemPrivilegios;
        this.ID = ID;
        this.telefone = telefone;
        this.E_mail = E_mail;
        this.cargo = cargo;
    }
    public Empregado(int ID, String telefone, String E_mail, String cargo, String nome, String data, String cpf, String senha, String login, String TemPrivilegios, String cidade, int idPrivilegios) {
        super(nome, data, cpf, senha, login);
        this.cidade = cidade;
        this.TemPrivilegios = TemPrivilegios;
        this.ID = ID;
        this.telefone = telefone;
        this.E_mail = E_mail;
        this.cargo = cargo;
        this.idPrivilegios = idPrivilegios;
    }
    
    
    
}
