/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ap2engsoft.interfaces;

/**
 *
 * @author Caioã
 */
public interface IAdmin {
    public void realizaUploadArquivo(String caminhoArquivo);
    public void manterArquivo(int idArquivo, boolean resposta);
    public void excluirPublicacao(int id);
    public void excluirComentario();
}
