/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ap2engsoft;

import ap2engsoft.interfaces.IAdmin;

/**
 *
 * @author Caioã
 */
public class Admin implements IAdmin {
    private String nome;
    private int matrícula;
    private String email;
    private String senha;

    private Admin(String nome, int matricula, String email, String senha){
        this.nome = nome;
        this.matrícula = matricula;
        this.email = email;
        this.senha = senha;
    }
    
    public static Admin criaAdmin(String nome, int matricula, String email, String senha){
        Admin novoAdm = new Admin(nome, matricula, email, senha);
        
        return novoAdm;
    }
    
    @Override
    public void realizaUploadArquivo(String caminhoArquivo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void manterArquivo(int idArquivo, boolean resposta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void excluirPublicacao(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void excluirComentario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
