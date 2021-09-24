package model;

public class ResultPoids {

    public static String account = null;
    public static String tipofatura = null;
    public static String billinfo = null;
    public static String payinfo = null;
    public static String status = null;
    public static int statusBRM  = 0;
    public static String produto = null;
    public static String email = null;
    public static String statusPar = null;
    public static String statusId = null;
    public static String parId = null;
    public static String statusBill = null;
    public static String statusCod = null;
    public static String oldBillInfo = null;
    public static String newBillInfo = null;
    public static String upgradeStatus = null;
    public static String DataConversaoTrial = null;

    public static String resultSetAccount = null;
    public static String resultSettipofatura = null;
    public static String resultSetbillinfo = null;
    public static String resultSetpayinfo = null;
    public static String resultSetstatus = null;
    public static String resultSetproduto = null;

    public void limparPoids(){
        if(account != null)
            account = null;
        if(tipofatura != null)
            tipofatura = null;
        if(billinfo != null)
            billinfo = null;
        if(payinfo != null)
            payinfo = null;
        if(status != null)
            status = null;
        if(produto != null)
            produto = null;
        if(email != null)
            email = null;
    }

}
