/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ap2engsoft;

/**
 *
 * @author Caioã
 */
class Comentario {
    private String comentario;
    
    public void adicionaComentario(String comentario){
        this.comentario = comentario;
    }
    
    public void exibeComentario(){
        System.out.println(comentario);
    }
}
