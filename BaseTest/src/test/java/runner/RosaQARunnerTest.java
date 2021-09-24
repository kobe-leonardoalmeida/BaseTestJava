package runner;

import com.google.gson.JsonParser;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Set;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps"},
        tags = {"not @skip", "not @api", "@[D2C-18365][CT01]"},
        plugin = {"pretty"},
        monochrome = true)
public class RosaQARunnerTest {

    @AfterClass
    public static void after() throws FileNotFoundException {
        Set<String> usuarios = null;
        usuarios = new JsonParser().parse(new FileReader(new File("./src/test/resources/datamass/Usuario.json"))).getAsJsonObject().keySet();
//        actor().attemptsTo(LimparMassa.dosUsuarios(usuarios));
    }

}
