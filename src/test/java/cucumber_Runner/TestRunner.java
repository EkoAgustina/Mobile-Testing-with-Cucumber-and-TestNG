package cucumber_Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;
@Test
@CucumberOptions(
        monochrome = true,
        features = "src/test/resources/Features",
        glue = "stepDefinitions",
        publish = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

}