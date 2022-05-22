package cucumber_Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;
@Test()
@CucumberOptions(

        features = "src/test/resources/Features",
        glue = {"stepDefinitions", "cucumberHooks"},
        plugin = "pretty",
        tags = "",
        monochrome = true,
        publish = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

}