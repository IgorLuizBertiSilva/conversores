/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo4.model;

/**
 *
 * @author aluno
 */
public class Telefone {

    private String codigoPais;
    private String codigoArea;

    private String numero;

    /**
     * Get the value of numero
     *
     * @return the value of numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Set the value of numero
     *
     * @param numero new value of numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Get the value of codigoArea
     *
     * @return the value of codigoArea
     */
    public String getCodigoArea() {
        return codigoArea;
    }

    /**
     * Set the value of codigoArea
     *
     * @param codigoArea new value of codigoArea
     */
    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    /**
     * Get the value of codigoPais
     *
     * @return the value of codigoPais
     */
    public String getCodigoPais() {
        return codigoPais;
    }

    /**
     * Set the value of codigoPais
     *
     * @param codigoPais new value of codigoPais
     */
    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    @Override
    public String toString() {
        return "+" + getCodigoPais() + " ("
                + getCodigoArea() + ") " + getNumero();
    }

    
    
    
}
