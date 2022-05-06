/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo3.comverter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
@FacesConverter("smartDate")
public class SmartDateConverter implements Converter {

    private static final DateFormat FORMATADOR = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Date dataConvertida = null;

        if (value == null || value.equals("")) {
            return null;
        }

        if ("hoje".equalsIgnoreCase(value)) {

            dataConvertida = getDataAtual().getTime();

        } else if ("amanha".equalsIgnoreCase(value) || "amanhã".equalsIgnoreCase(value)) {

            Calendar amanha = getDataAtual();

            amanha.add(Calendar.DAY_OF_MONTH, 1);

            dataConvertida = amanha.getTime();

        } else if ("ontem".equalsIgnoreCase(value)) {

            Calendar ontem = getDataAtual();

            ontem.add(Calendar.DAY_OF_MONTH, -1);

            dataConvertida = ontem.getTime();

        } else {
            try {
                dataConvertida = FORMATADOR.parse(value);
            } catch (ParseException e) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Data Incorreta.",
                        "Informe uma data Correta."));
            }
        }

        return dataConvertida;

    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {

        return FORMATADOR.format((Date) value);

    }

    private Calendar getDataAtual() {
        Calendar dataATual = new GregorianCalendar();

        dataATual.set(Calendar.HOUR_OF_DAY, 0);
        dataATual.set(Calendar.MINUTE, 0);
        dataATual.set(Calendar.SECOND, 0);
        dataATual.set(Calendar.MILLISECOND, 0);

        return dataATual;
    }

}
