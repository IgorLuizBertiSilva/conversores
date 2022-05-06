/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo1.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author aluno
 */
@Named
@RequestScoped
public class CalculadorBean {

    private Double valorA;
    private Double valorB;
    private Double resultado;
    
    
    public Double getValorA() {
        return valorA;
    }

    public void setValorA(Double valorA) {
        this.valorA = valorA;
    }

    public Double getValorB() {
        return valorB;
    }

    public void setValorB(Double valorB) {
        this.valorB = valorB;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }
    
    public void somar(){
        this.resultado = this.valorA + this.valorB;
    }

    public CalculadorBean() {
        
        this.valorA = 0.0;
        this.valorB = 0.0;
        
    }

    
}
