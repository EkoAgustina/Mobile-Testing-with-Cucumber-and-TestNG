package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

import static Alarm.OpenApps.driver;

public class driverHooks {

    @After
    public void addScreenshot(Scenario scenario) throws InterruptedException, IOException {

        Thread.sleep(1000);
        //validate if scenario has failed
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "image");
        }
    }
}
