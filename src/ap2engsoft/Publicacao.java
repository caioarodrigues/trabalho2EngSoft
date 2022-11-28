/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ap2engsoft;

import java.util.Date;

/**
 *
 * @author Caioã
 */
public class Publicacao {
    private Date dataCriacao;
    private String titulo;
    private Conteudo conteudo;
    
    private Publicacao(String titulo, Conteudo conteudo){
        dataCriacao = new Date();
        this.titulo = titulo;
        this.conteudo = conteudo;
    }
    
    public void exibeConteudo(){
        conteudo.exibeConteudo();
    }
   
    public void adicionaComentario(String comentario){
        conteudo.adicionaComentario(comentario);
    }
}
