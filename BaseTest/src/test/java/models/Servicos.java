package models;

import static model.DataMassParser.getObjectWithName;


public class Servicos {

    public int[] serviços;

    public static Servicos comNome(String nome) {
        return getObjectWithName(nome, Servicos.class);
    }

//    public String globoIdBody() {
////        StringBuilder body = new StringBuilder("[");
////        int i = 0;
////        while(i< servicos.size()){
////            body.append("{\n\"serviceId\":").append(servicos.get(i)).append("}");
////            i++;
////            if(i< servicos.size()){
////                body.append(",");
////            }
////        }
////        body.append("]");
////        return body.toString();
//    }


}
