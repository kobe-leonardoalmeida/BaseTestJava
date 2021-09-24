package model;

import static model.DataMassParser.getObjectWithName;

public class CredenciaisSsh {

    public String host;
    public String user;
    public String password;
    public String port;

    public static CredenciaisSsh doAmbiente(String nome) {
        return getObjectWithName(nome,CredenciaisSsh.class);
    }


}
