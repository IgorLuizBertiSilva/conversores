/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo2.controller;

import java.util.Calendar;
import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author aluno
 */
@Named
@RequestScoped
public class CalculadorDataBean {
    
    private Date dataBase;
    private Integer dias;
    private Date resultado;

    public Date getDataBase() {
        return dataBase;
    }

    public void setDataBase(Date dataBase) {
        this.dataBase = dataBase;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    public Date getResultado() {
        return resultado;
    }

    public void setResultado(Date resultado) {
        this.resultado = resultado;
    }
    
    public void adicionar(){
        Calendar dataCalculo = Calendar.getInstance();
        dataCalculo.setTime(this.dataBase);
        dataCalculo.add(Calendar.DAY_OF_MONTH, dias);
        
        this.resultado = dataCalculo.getTime();
    }
    
    
}
