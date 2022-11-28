/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ap2engsoft;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Caioã
 */
public class Conteudo {
    private Date dataCriacao;
    private String texto;
    private String enderecoLocal;
    private ArrayList <Comentario> comentarios = new ArrayList <Comentario>();
    private String tipo;
    private int id;
    private static Conteudo conteudo;
    
    private Conteudo(String texto, String enderecoLocal, String tipo, int id){
        this.dataCriacao = new Date();
        this.texto = texto;
        this.enderecoLocal = enderecoLocal;
        this.tipo = tipo;
        this.id = id;
    }
    
    public static Conteudo novoConteudo(String texto, String enderecoLocal, String tipo, int id){
        if(conteudo == null){
            conteudo = new Conteudo(texto, enderecoLocal, tipo, id);
        }

        return conteudo;
    }
    
    public void exibeConteudo(){
        //tem que exibir o conteudo e por fim os comentarios:
        conteudo.exibeConteudo();
        
        for(Comentario comentario : comentarios){
            comentario.exibeComentario();
        }
    }
    
    public void adicionaComentario(String comentario){
        Comentario c = new Comentario();
        c.adicionaComentario(comentario);
        
        comentarios.add(c);
    }
}
