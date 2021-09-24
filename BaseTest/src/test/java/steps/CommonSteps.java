package steps;


import cucumber.api.java8.En;
import helper.GetSerenityConfig;
import helper.TimeWaits;
import model.DataMassParser;
import models.Credenciais;
import models.Usuario;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import tasks.cadastro;
import tasks.commonTasks;
import tasks.login;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import static model.CastOfActors.actor;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class CommonSteps implements En {



    static Usuario usuario;
    private HashMap<String,String> listaServicos = new HashMap<>();

    public CommonSteps() {

        Given("Abro url - e-commerce", () -> {
            actor().attemptsTo(
                    Open.browserOn().thePageNamed("globoplay.url")
            );
        });
        Given("Abro url - admin", () -> {
            actor().attemptsTo(
                    Open.browserOn().thePageNamed("globoplay.url")
            );
        });

        When("Clico no botão login", (String nome) -> {
            actor().attemptsTo(
                    commonTasks.preencher()
            );
        });

        And("Preencho meus dados pessoais e concluo o cadastro", () -> {
            actor().attemptsTo(
                    cadastro.preencher()
            );
        });

        When("Sigo para o fluxo de {string}", (String opcao) -> {
            actor().attemptsTo(
                    login.preencher(opcao)
            );
        });

        And("Confirmo email de ativação", () -> {
            actor().attemptsTo(

            );
        });

        And("Valido ativação da conta", () -> {
            actor().attemptsTo(

            );
        });
    }
}
