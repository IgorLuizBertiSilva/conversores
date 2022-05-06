/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo4.controller;

import exemplo4.model.Telefone;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author aluno
 */
@Named
@RequestScoped
public class TelefoneBean {
    
    private Telefone telefone;

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
    
    
    
    public void enviar(){
        System.out.println(telefone);
    }
    
    
    
}
