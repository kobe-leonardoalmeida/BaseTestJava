package models;

import static model.DataMassParser.getObjectWithName;

public class Credenciais {

    public String login;
    public String password;
    public String token;
    public String client_id;
    public String client_secret;
    public String glive_id;
    public String glive_secret;

    public static Credenciais comNome(String nome) {
        return getObjectWithName(nome,Credenciais.class);
    }


}
