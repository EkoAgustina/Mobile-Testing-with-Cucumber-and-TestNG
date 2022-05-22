package Capabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

public class BasicClass {
    public static AppiumDriver<MobileElement> driver;
    public static DesiredCapabilities initDevice(){
//        File filePath = new File(System.getProperty("user.dir"));
//        File app = new File(filePath, "/apk/app-clock.apk");


        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("automationName","UiAutomator2");
        cap.setCapability("platformName","Android");
        cap.setCapability("deviceName","127.0.0.1:21503");

        //        cap.setCapability("app",app.getAbsolutePath());

        cap.setCapability("autoGrantPermissions","true");
        cap.setCapability("noReset","true");
        cap.setCapability("appPackage", "com.google.android.deskclock");
        cap.setCapability("appActivity", "com.android.deskclock.DeskClock");
        return cap;
    }


}
