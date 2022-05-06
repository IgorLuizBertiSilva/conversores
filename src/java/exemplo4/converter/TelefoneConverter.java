/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo4.converter;

import exemplo4.model.Telefone;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author aluno
 */
@FacesConverter(forClass = Telefone.class)
public class TelefoneConverter implements Converter<Object> {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {

        if (value == null) {
            return null;
        }

        // de +55 (11) 2626-9415 para 551126269415
        String somenteNumeros = value.replaceAll("[^0-9.]", "");

        System.out.println("Original: " + value);
        System.out.println("Somente numeros: " + somenteNumeros);

        try {
            Telefone telefone = new Telefone();
            telefone.setCodigoPais(somenteNumeros.substring(0, 2));
            telefone.setCodigoArea(somenteNumeros.substring(2, 4));
            telefone.setNumero(somenteNumeros.substring(4));

            return telefone;
        } catch (IndexOutOfBoundsException e) {

            throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Problemas na conversão do telefone.",
                    "Ele deve ser informado com código do país, de área e o número."));
        }

    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value == null) {
            return null;
        }

        Telefone telefone = (Telefone) value;

        return telefone.toString();
    }

}
