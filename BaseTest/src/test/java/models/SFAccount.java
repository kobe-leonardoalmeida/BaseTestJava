package models;

public class SFAccount {

    public String globoId;
    public String fullname;
    public String gender;
    public String cpf;
    public String email;
    public String bithdate;
    public String ibgeCity;
    public String ibgeState;
    public Contact contact;
    public Address address;

    public static SFAccount paraOUsuario(Usuario usuario) {
        SFAccount sfAccount = new SFAccount();
        sfAccount.globoId = usuario.nome;
        sfAccount.bithdate = usuario.data_de_nascimento;
        sfAccount.cpf = usuario.cpf;
        sfAccount.gender = usuario.sobrenome;
        sfAccount.email = usuario.getEmail();
        sfAccount.fullname = usuario.nome;
        sfAccount.contact = new Contact();
        sfAccount.contact.email = usuario.getEmail();
        return sfAccount;
    }

    private static class Contact {
        public String id;
        public String bithdate;
        public String email;
        public String phone;
    }

    private class Address {
        public String street;
        public String zipcode;
        public String country;
    }


}
