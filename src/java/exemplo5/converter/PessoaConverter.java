/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo5.converter;

import exemplo5.dao.PessoaDAO;
import exemplo5.model.Pessoa;
import javax.enterprise.inject.spi.CDI;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author aluno
 */
@FacesConverter(forClass = Pessoa.class)
public class PessoaConverter implements Converter{
    
    

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        System.out.println("getAsObject: " + value);
        
        // obtem uma instancia do DAO
        PessoaDAO dao = CDI.current().select(PessoaDAO.class).get();
        
        // 
        Pessoa pessoa = dao.findByCodigo(Long.valueOf(value));
        
        
        
        return pessoa;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        System.out.println("getAsString: " + value);
        Pessoa p = (Pessoa) value;
        
        // retorna a chave primária do objeto
        return String.valueOf(p.getCodigo());
    }
    
}
