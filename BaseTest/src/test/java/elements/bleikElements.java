package elements;


import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;

public class bleikElements {

    /* --------------- Elementos da Home ------------------- */
    public static final Target BTN_LOGIN_HOME = Target.the("Botão para direcionar para a pagina de login").locatedBy("//*[@id=\"__next\"]/header/div/div[4]/div[2]/button").waitingForNoMoreThan(Duration.ofSeconds(60));

    /* --------------------- Elementos da pagina de login ------------------------------------------ */
    public static final Target INPUT_EMAIL_LOGIN = Target.the("Campo para input de email").locatedBy("//*[@id=\"blk-login-email-input\"]").waitingForNoMoreThan(Duration.ofSeconds(60));
    public static final Target INPUT_SENHA_LOGIN = Target.the("Campo para input de senha ").locatedBy("//*[@id=\"blk-login-pass-input\"]").waitingForNoMoreThan(Duration.ofSeconds(60));
    public static final Target BTN_LOGIN = Target.the("Botão para realizar login").locatedBy("//*[@id=\"__next\"]/div/div[2]/form/div[4]/div/button").waitingForNoMoreThan(Duration.ofSeconds(60));
    public static final Target BTN_CADASTRO = Target.the("Botão para direcionar para o fluxo de cadastro").locatedBy("//*[@id=\"__next\"]/div/div[2]/form/div[6]/div").waitingForNoMoreThan(Duration.ofSeconds(60));

    /* ------------------------------- Elementos do cadastro ------------------------------------- */
    public static final Target INPUT_NOME = Target.the("Campo para input de nome").locatedBy("//*[@id=\"blk-register-name-input\"]").waitingForNoMoreThan(Duration.ofSeconds(60));
    public static final Target INPUT_SOBRENOME = Target.the("Campo para input de sobrenome").locatedBy("//*[@id=\"blk-register-lastName-input\"]").waitingForNoMoreThan(Duration.ofSeconds(60));
    public static final Target INPUT_EMAIL = Target.the("Campo para input de email").locatedBy("//*[@id=\"blk-register-email-input\"]").waitingForNoMoreThan(Duration.ofSeconds(60));
    public static final Target INPUT_TELEFONE = Target.the("Campo para input de telefone").locatedBy("//*[@id=\"phone\"]").waitingForNoMoreThan(Duration.ofSeconds(60));
    public static final Target INPUT_CEP = Target.the("Campo para input de CEP").locatedBy("//*[@id=\"zipCode\"]").waitingForNoMoreThan(Duration.ofSeconds(60));
    public static final Target INPUT_ESTADO = Target.the("Campo para input do estado").locatedBy("//*[@id=\"blk-register-state-input\"]").waitingForNoMoreThan(Duration.ofSeconds(60));
    public static final Target INPUT_CIDADE = Target.the("Campo para input de cidade").locatedBy("//*[@id=\"blk-register-city-input\"]").waitingForNoMoreThan(Duration.ofSeconds(60));
    public static final Target INPUT_ENDERECO = Target.the("Campo para input de endereço").locatedBy("//*[@id=\"blk-register-adress-input\"]").waitingForNoMoreThan(Duration.ofSeconds(60));
    public static final Target INPUT_NUMERO = Target.the("Campo para input do numero").locatedBy("//*[@id=\"blk-register-adressNumber-input\"]").waitingForNoMoreThan(Duration.ofSeconds(60));
    public static final Target INPUT_COMPLEMENTO = Target.the("Campo para input de complemento").locatedBy("//*[@id=\"blk-register-adressComplement-input\"]").waitingForNoMoreThan(Duration.ofSeconds(60));
    public static final Target INPUT_SENHA = Target.the("Campo para input de senha").locatedBy("//*[@id=\"blk-register-password-input\"]").waitingForNoMoreThan(Duration.ofSeconds(60));
    public static final Target INPUT_CONFIRM_SENHA = Target.the("Campo para input de confirmação de senha").locatedBy("//*[@id=\"blk-register-confirmPassword-input\"]").waitingForNoMoreThan(Duration.ofSeconds(60));
    public static final Target CHECKBOX_TERMOS = Target.the("Checkbox para confirmação de termos").locatedBy("//*[@id=\"__next\"]/div/div[2]/form/div[4]/label/div/div").waitingForNoMoreThan(Duration.ofSeconds(60));
    public static final Target BTN_CADASTRAR = Target.the("Botão confrimar cadastro").locatedBy("//*[@id=\"__next\"]/div/div[2]/form/div[5]/div/div/button").waitingForNoMoreThan(Duration.ofSeconds(60));






















}
