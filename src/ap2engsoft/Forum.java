/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ap2engsoft;

import java.util.ArrayList;

/**
 *
 * @author Caioã
 */
public class Forum {
    private String titulo;
    private ArrayList <Publicacao> publicacoes = new ArrayList <Publicacao>();
    private static int limiteForum = 1;
    private static int contForum = 0;
    private Forum(String titulo){}
    
    public static Forum inicializaForum(String titulo){
        if(contForum < limiteForum){
            Forum forum = new Forum(titulo);
            contForum++;
            
            return forum;
        }
        
        return null;
    }
    
    public void listaPublicacoes(){
        for(Publicacao p : publicacoes){
            p.exibeConteudo();
        }
    }
    
    public void verPublicacao(Publicacao p){
        p.exibeConteudo();
    }
    
    public void comentar(Publicacao p, String comentario){
        p.adicionaComentario(comentario);
    }
    
    public void pesquisaConteudoPorFiltro(String filtro){
        //não sei como faz
    }
    
    public void solicitaUploadArquivo(String diretorio){
        
    }
}
