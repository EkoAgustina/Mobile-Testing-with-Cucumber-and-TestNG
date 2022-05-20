package stepDefinitions;

import io.cucumber.java.en.Given;

import static capa.BasicClass.openApps;

public class stepDefinition {

    @Given("Open Apps")
    public void Open_Apps() throws Exception{
        openApps();
    }
}
