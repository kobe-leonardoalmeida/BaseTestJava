package models;

import static model.DataMassParser.getObjectWithName;

public class CheckoutBody {

    public Checkout checkout;

    public static CheckoutBody comNome(String nome) {
        return getObjectWithName(nome, CheckoutBody.class);
    }

    public class Checkout {

        public String globoId;
        public String productCode;
        public String originid;
        public String paymentMethod;
        public String msisdn;
        public String channel;

    }


}
