package Alarm;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class setAlarm {
    public AppiumDriver<MobileElement> driver;



    By IconAlarm = By.xpath("//android.widget.FrameLayout[@content-desc=\"Alarm\"]/android.widget.FrameLayout/android.widget.ImageView");

//    By Option = By.xpath("(//android.widget.ImageButton[@content-desc=\"Expand alarm\"])[1]");
//
    By selectTime = By.id("com.google.android.deskclock:id/fab");

    By selectFive = By.xpath("//android.widget.TextView[@content-desc=\"5 o'clock\"]");

    By selectThirty = By.xpath("//android.widget.TextView[@content-desc=\"30 minutes\"]");

    By okButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button[3]");

    By Mndy = By.id("com.google.android.deskclock:id/day_button_1");

    By Tsdy = By.id("com.google.android.deskclock:id/day_button_2");

    By Wndy = By.id("com.google.android.deskclock:id/day_button_3");

    By Thsdy = By.id("com.google.android.deskclock:id/day_button_4");

    By Frdy = By.id("com.google.android.deskclock:id/day_button_5");

    public setAlarm(AppiumDriver<MobileElement> driver){
        this.driver=driver;
    }

    public MobileElement AlarmIcon(){return driver.findElement(IconAlarm);}
//    public MobileElement OptionLoc(){return driver.findElement(Option);}
    public MobileElement SelectTime(){return driver.findElement(selectTime);}
    public MobileElement SelectFive(){return driver.findElement(selectFive);}
    public MobileElement SelectThirty(){return driver.findElement(selectThirty);}
    public MobileElement ButtonOK(){return driver.findElement(okButton);}
    public MobileElement Monday(){return driver.findElement(Mndy);}
    public MobileElement Tuesday(){return driver.findElement(Tsdy);}
    public MobileElement Wednesday(){return driver.findElement(Wndy);}
    public MobileElement Thursday(){return driver.findElement(Thsdy);}
    public MobileElement Friday(){return driver.findElement(Frdy);}
}


