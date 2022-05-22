package Alarm;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.net.URL;

import static Capabilities.BasicClass.initDevice;

public class OpenApps {
    public static AppiumDriver<MobileElement> driver;

    public static void openParentApps () throws Exception {
        String appiumServerURL = "http://127.0.0.1:4723/wd/hub";
        driver = new AppiumDriver(new URL(appiumServerURL), initDevice());
        System.out.println("Apps started...");
    }
}
