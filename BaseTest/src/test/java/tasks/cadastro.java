package tasks;

import elements.bleikElements;
import helper.TimeWaits;
import models.Usuario;
import net.serenitybdd.markers.IsSilent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class cadastro implements Task, IsSilent {
    Usuario usuario;

    public static cadastro preencher(){
        return instrumented(cadastro.class);
    }
    cadastro(Usuario user){
        this.usuario = user;
        this.usuario.getEmail();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        TimeWaits.espera();
        actor.attemptsTo(
                WaitUntil.the((bleikElements.INPUT_NOME), isVisible()).forNoMoreThan(30).seconds(),
                Click.on(bleikElements.INPUT_NOME),
                Enter.theValue(usuario.nome).into(bleikElements.INPUT_NOME)
        );
        actor.attemptsTo(
                Click.on(bleikElements.INPUT_SOBRENOME),
                Enter.theValue(usuario.sobrenome).into(bleikElements.INPUT_SOBRENOME)
        );
        actor.attemptsTo(
                Click.on(bleikElements.INPUT_EMAIL),
                Enter.theValue(usuario.getEmail()).into(bleikElements.INPUT_EMAIL)
        );
        actor.attemptsTo(
                Click.on(bleikElements.INPUT_TELEFONE),
                Enter.theValue(usuario.telefone).into(bleikElements.INPUT_TELEFONE)
        );
        actor.attemptsTo(
                Click.on(bleikElements.INPUT_CEP),
                Enter.theValue(usuario.cep).into(bleikElements.INPUT_CEP)
        );
        actor.attemptsTo(
                Click.on(bleikElements.INPUT_ESTADO),
                Enter.theValue(usuario.estado).into(bleikElements.INPUT_ESTADO)
        );
        actor.attemptsTo(
                Click.on(bleikElements.INPUT_CIDADE),
                Enter.theValue(usuario.cidade).into(bleikElements.INPUT_CIDADE)
        );
        actor.attemptsTo(
                Click.on(bleikElements.INPUT_ENDERECO),
                Enter.theValue(usuario.endereco).into(bleikElements.INPUT_ENDERECO)
        );
        actor.attemptsTo(
                Click.on(bleikElements.INPUT_NUMERO),
                Enter.theValue(usuario.numero).into(bleikElements.INPUT_NUMERO)
        );
        actor.attemptsTo(
                Click.on(bleikElements.INPUT_COMPLEMENTO),
                Enter.theValue(usuario.complemento).into(bleikElements.INPUT_COMPLEMENTO)
        );
        actor.attemptsTo(
                Click.on(bleikElements.INPUT_SENHA),
                Enter.theValue(usuario.senha).into(bleikElements.INPUT_SENHA)
        );
        actor.attemptsTo(
                Click.on(bleikElements.INPUT_CONFIRM_SENHA),
                Enter.theValue(usuario.senha).into(bleikElements.INPUT_CONFIRM_SENHA)
        );
        actor.attemptsTo(
                Click.on(bleikElements.CHECKBOX_TERMOS)
        );
        actor.attemptsTo(
                Click.on(bleikElements.BTN_CADASTRAR)
        );
    }
}
