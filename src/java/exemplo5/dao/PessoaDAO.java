/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo5.dao;

import exemplo5.model.Pessoa;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aluno
 */
@Stateless
public class PessoaDAO {
    
    @PersistenceContext(unitName = "conversoresPU")
    private EntityManager em;
    
    public List<Pessoa> findAll(){
        
        return em.createQuery("SELECT p FROM Pessoa p", Pessoa.class).getResultList();
        
    }
    
    public Pessoa findByCodigo(long codigo){
        return em.find(Pessoa.class, codigo);
    }
    
}
