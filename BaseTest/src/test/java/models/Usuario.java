package models;

import helper.HashGenerator;

import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import static model.DataMassParser.getObjectWithName;

public class Usuario {


    public String cpf;
    public String senha;
    public String nome;
    public String sobrenome;
    public String data_de_nascimento;
    public String endereco;
    public String numero;
    public String complemento;
    public String cep;
    public String cidade;
    public String estado;
    public String telefone;

    private String email;

    public static Usuario comNome(String nome) {
        return getObjectWithName(nome,Usuario.class);
    }


    public String getEmail() {
        if(email==null || email.isEmpty()) {
            SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyHHmmssSSS");
            String random = sdf.format(new Date());
            email = "bleik." + random + "@mailinator.com";
        }
        return email;
    }


    public void setEmail(String email){
        this.email = email;
    }

    public void limparEmail() {
        email = null;
    }
}
