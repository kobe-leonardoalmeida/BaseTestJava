package tasks;

import elements.bleikElements;
import helper.TimeWaits;
import models.Usuario;
import net.serenitybdd.markers.IsSilent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class login implements Task, IsSilent {
    Usuario usuario;
    String opcoes;

    login(String select){

        this.opcoes = select;
    }

    public static login preencher(String select){

        return instrumented(login.class, select);
    }

    login(Usuario user){
        this.usuario.getEmail();
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        TimeWaits.espera();
        switch (opcoes) {
            case "Login":
            actor.attemptsTo(
                    WaitUntil.the((bleikElements.INPUT_EMAIL_LOGIN), isVisible()).forNoMoreThan(30).seconds(),
                    Click.on(bleikElements.INPUT_EMAIL_LOGIN),
                    Enter.theValue(usuario.getEmail()).into(bleikElements.INPUT_EMAIL_LOGIN)
            );
            actor.attemptsTo(
                    Click.on(bleikElements.INPUT_SENHA_LOGIN),
                    Enter.theValue(usuario.senha).into(bleikElements.INPUT_SENHA_LOGIN)
            );
            actor.attemptsTo(
                    Click.on(bleikElements.BTN_LOGIN)
            );
            break;

            case "Cadastro":
                actor.attemptsTo(
                        WaitUntil.the((bleikElements.BTN_CADASTRO), isVisible()).forNoMoreThan(30).seconds(),
                        Click.on(bleikElements.BTN_CADASTRO)
                );
                break;

        }
    }
}
