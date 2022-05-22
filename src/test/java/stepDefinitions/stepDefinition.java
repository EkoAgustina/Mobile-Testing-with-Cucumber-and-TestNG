package stepDefinitions;

import Alarm.setAlarm;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

import static Alarm.OpenApps.driver;
import static Alarm.OpenApps.openParentApps;


public class stepDefinition {

    @Given("Open application")
    public void Open_application() throws Exception{
        openParentApps();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Then("User click the alarm icon on the navbar")
    public void User_click_the_alarm_icon_on_the_navbar(){
        setAlarm ClickAlarmIcon = new setAlarm(driver);
        ClickAlarmIcon.AlarmIcon().click();
    }



    @And("Click button add alarm")
    public void Click_button_add_alarm(){
        setAlarm ClickSelectTime = new setAlarm(driver);
        ClickSelectTime.SelectTime().click();
    }

    @And("User choose 5 when select time")
    public void User_choose_5_when_select_time(){
        setAlarm ClickSelectFive = new setAlarm(driver);
        ClickSelectFive.SelectFive().click();
    }

    @And("User choose 30 when select time")
    public void User_choose_30_when_select_time(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        setAlarm ClickSelectThirty = new setAlarm(driver);
        ClickSelectThirty.SelectThirty().click();
    }

    @And("User click OK")
    public void User_click_OK(){
        setAlarm ClickButtonOk = new setAlarm(driver);
        ClickButtonOk.ButtonOK().click();
    }

    @And("User click monday to friday")
    public void User_click_monday_to_friday(){
        setAlarm ClickDay = new setAlarm(driver);
        ClickDay.Monday().click();
        ClickDay.Tuesday().click();
        ClickDay.Wednesday().click();
        ClickDay.Thursday().click();
        ClickDay.Friday().click();
    }

    @AfterTest
    public static void closeApps(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.closeApp();
    }
}
