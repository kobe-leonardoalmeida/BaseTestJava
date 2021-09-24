package helper;

import java.util.Random;
import java.util.UUID;

public class GeradoresNumericos {

    /**** De acorodo com o numero passado por parâmetro gera uma cadeia aleatoria de Inteiros *****/
    public static String geraNumeros(int QtdCaracteres) {
        String numeros = "0123456789";
        Random randomNum = new Random();
        String geranumeros = "";
        int index = -1;
        Random random = new Random();

        for (int i = 0; i < QtdCaracteres; i++)
        { index = random.nextInt(numeros.length());
            geranumeros += numeros.substring(index, index + 1);
        }
        return geranumeros;
    }

    /**** De acorodo com o numero passado por parâmetro gera uma cadeia aleatoria de string(letras e numeros) *****/
    public static String RandomString(int QtdCaractes){
        UUID uuid = UUID.randomUUID();
        String purchase_token = uuid.toString().substring(0,QtdCaractes).replace("-","0");
        return purchase_token;
    }


}
