package com.kahyalar.fob_solutions.pages;

import com.kahyalar.fob_solutions.base.BasePage;
import com.kahyalar.fob_solutions.constants.MainPageConstants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Assert;

import java.util.List;

import static com.kahyalar.fob_solutions.constants.BasePageConstants.SETTINGS_BUTTON;
import static com.kahyalar.fob_solutions.constants.MainPageConstants.STUDY_INFO_TITLE;
import static com.kahyalar.fob_solutions.constants.MainPageConstants.TAB_BAR;
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
}
