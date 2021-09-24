package steps;

import com.google.gson.JsonParser;
import cucumber.api.java8.Pt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileReader;
import java.util.Set;

public class Hooks implements Pt {

    Logger LOGGER = LoggerFactory.getLogger(Hooks.class);
    private static Boolean dunit = false;

    public Hooks() {

        Before(() -> {
            if(!dunit) {
                dunit = true;
                Set<String> usuarios = new JsonParser().parse(new FileReader(new File("./src/test/resources/datamass/Usuario.json"))).getAsJsonObject().keySet();
            }
        });

    }


}
