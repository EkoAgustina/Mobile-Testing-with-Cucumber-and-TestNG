package capa;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BasicClass {
    public static AppiumDriver<MobileElement> driver;
    public static DesiredCapabilities initDevice(){
        File filePath = new File(System.getProperty("user.dir"));
        File app = new File(filePath, "/apk/app-clock.apk");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("automationName","UiAutomator2");
        cap.setCapability("platformName","Android");
        cap.setCapability("deviceName","127.0.0.1:21503");
        cap.setCapability("app",app.getAbsolutePath());
        cap.setCapability("autoGrantPermissions","true");
        cap.setCapability("noReset","true");
        return cap;
    }
    public static void openApps() throws Exception {
        String appiumServerURL = "http://127.0.0.1:4723/wd/hub";
        driver = new AppiumDriver(new URL(appiumServerURL), initDevice());
        System.out.println("Apps started...");

    }
    public static void closeApps(){
        driver.closeApp();
        System.out.println("Apps closed...");
    }
}
