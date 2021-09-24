package tasks;

import elements.bleikElements;
import helper.TimeWaits;
import net.serenitybdd.markers.IsSilent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class commonTasks implements Task, IsSilent {
    public static commonTasks preencher(){
        return instrumented(commonTasks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        TimeWaits.espera();
        actor.attemptsTo(
                WaitUntil.the((bleikElements.BTN_LOGIN_HOME), isVisible()).forNoMoreThan(30).seconds(),
                Click.on(bleikElements.BTN_LOGIN_HOME)
        );
    }
}
