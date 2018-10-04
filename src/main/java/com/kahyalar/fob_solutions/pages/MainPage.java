package com.kahyalar.fob_solutions.pages;

import com.kahyalar.fob_solutions.base.BasePage;
import com.kahyalar.fob_solutions.constants.MainPageConstants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Assert;

import java.util.List;

import static com.kahyalar.fob_solutions.constants.BasePageConstants.SETTINGS_BUTTON;
import static com.kahyalar.fob_solutions.constants.MainPageConstants.*;
import static com.kahyalar.fob_solutions.constants.WelcomePageConstants.LOCAL_STUDENT_BUTTON;

/**
 * Created by kahyalar on 2.10.2018.
 */
public class MainPage extends BasePage  {
    public MainPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public MainPage clickToMenuButton(){
        clickToMenu();
        return this;
    }

    public SettingsPage goToSettingsPage(){
        clickTo(SETTINGS_BUTTON);
        return new SettingsPage(driver);
    }

    public ChecklistPage goToChecklistPage(){
        List<MobileElement> list = findElement(TAB_BAR).findElementsByClassName("android.widget.ImageView");
        list.get(1).click();
        return new ChecklistPage(driver);
    }

    public MainPage checkFieldsIsVisible(){
        checkDecemberIsNotVisible();
        checkEventIsNotVisible();
        return this;
    }

    public MainPage goToDecemberMonth(){
        MobileElement nextMonthButton = findElement(CALENDAR_VIEW).findElementsByClassName("android.widget.ImageView").get(1);
        clickXTimes(nextMonthButton, 2);
        checkDecemberIsVisible();
        return this;
    }

    public MainPage clickToEventDate(){
        MobileElement eventDateButton = findElement(EVENT_DATE_BUTTON);
        Assert.assertTrue("Button's checked value should be false at this moment!", !isChecked(eventDateButton));
        clickTo(EVENT_DATE_BUTTON);
        Assert.assertTrue("Button's checked value should be true at this moment!", isChecked(eventDateButton));
        return this;
    }

    private void checkDecemberIsNotVisible(){
        Assert.assertTrue("December month should be invisible at this moment!", !isExist(DECEMBER_TEXT));
    }

    private void checkDecemberIsVisible(){
        Assert.assertTrue("December month should be visible at this moment!", isExist(DECEMBER_TEXT));
    }

    private void checkEventIsNotVisible(){
        Assert.assertTrue("23 December 2018 should be invisible at this moment!", !isExist(EVENT_DATE));
    }

    public void checkEventIsVisible(){
        waitAnimation();
        Assert.assertTrue("23 December 2018 should be visible at this moment!", isExist(EVENT_DATE));
    }

    private void waitAnimation(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
