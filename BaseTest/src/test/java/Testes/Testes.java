package Testes;

import models.Input;
import models.Usuario;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static model.CastOfActors.actor;

public class Testes {

    Usuario user;

    @Test
    public void testeCriacaoUsuario() throws ParseException {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 3);
        Date dataSF = cal.getTime();
        System.out.println(dataSF);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String novaData = dateFormat.format(dataSF);
        System.out.println(novaData);
        String arrayData[] = novaData.split("-");
        for (int i=0; i < arrayData.length; i++){
            System.out.println(arrayData[i]);
        }
    }


    @Test
    public void testeNomeClass(){
        System.out.println("Nome de Class: "+ Input.master.class.getSimpleName());
        System.out.println("MesCartão: "+ Input.master.validade.substring(0,2));
        System.out.println("AnoCartão: "+ Input.master.validade.substring(2,6));
        System.out.println("NrCartão: "+ Input.master.numero.substring(12,16));
    }


}
