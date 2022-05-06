/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo5.controller;

import exemplo5.dao.PessoaDAO;
import exemplo5.model.Pessoa;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author aluno
 */
@Named
@RequestScoped
public class PessoaBean {
    
    @EJB
    private PessoaDAO pessoaDAO;
    private Pessoa pessoa;
    private List<Pessoa> pessoas;
    
    public List<Pessoa> getPessoas(){
        if(pessoas == null){
            pessoas = pessoaDAO.findAll();
        }
        return pessoas;
    }

    public PessoaDAO getPessoaDAO() {
        return pessoaDAO;
    }

    public void setPessoaDAO(PessoaDAO pessoaDAO) {
        this.pessoaDAO = pessoaDAO;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public void enviar(){
        
        System.out.println("Método enviar...");
        System.out.println(pessoa);
        
    }
    
    
    
}
