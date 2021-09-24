package helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static model.CastOfActors.actor;

public class GetDates {

    /**** Retorna a data atual em formato EPOCH *****/
    public static long SysDateEpoch() {
        long epoch = System.currentTimeMillis();
        return epoch;
    }

    /**** Retorna a data futura em formato EPOCH *****/
    public static long DataFuturaEpoch(long QtdDias) {
        long epoch = System.currentTimeMillis();
        long somaDias = 86400 * QtdDias;
        long total = epoch + somaDias;
        return total;
    }

    public static void SetDataInActor(int dias) throws ParseException {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, dias);
        if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
            cal.add(Calendar.DATE, 2);
        } else if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
            cal.add(Calendar.DATE, 1);
        }
        Date dataSF = cal.getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String novaData = dateFormat.format(dataSF);
        String arrayData[] = novaData.split("-");
        actor().remember("anoNovoCancelamento", arrayData[0]);
        actor().remember("mesNovoCancelamento", arrayData[1]);
        actor().remember("diaNovoCancelamento", arrayData[2]);
    }


}
