/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ap2engsoft;
/**
 *
 * @author Caioã
 */
public class AP2EngSoft {

    /**
     * @param args the command line arguments
     */
    public static void irAoForum(){
        
    }
    
    public static void irPaginaAdm(){
        
    }
    
    public static void main(String[] args) {
        Admin a = Admin.criaAdmin("nome", 0, "email", "senha");

        Forum f = Forum.inicializaForum("Teste");
        
        f.listaPublicacoes();

    }
    
}
