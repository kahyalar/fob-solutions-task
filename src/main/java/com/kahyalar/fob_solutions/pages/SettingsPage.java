package com.kahyalar.fob_solutions.pages;

import com.kahyalar.fob_solutions.base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Assert;

import static com.kahyalar.fob_solutions.constants.SettingsPageConstants.LOCAL_STUDENT_POPUP;
import static com.kahyalar.fob_solutions.constants.SettingsPageConstants.SELECT_ROLE_BUTTON;
import static com.kahyalar.fob_solutions.constants.SettingsPageConstants.SETTINGS_TITLE;

/**
 * Created by kahyalar on 2.10.2018.
 */
public class SettingsPage extends BasePage {
    public SettingsPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public SettingsPage checkIsSettingsPage(){
        Assert.assertTrue("Title 'Settings' should be visible at this moment!", isExist(SETTINGS_TITLE));
        return this;
    }

    public SettingsPage pressSelectRoleButton(){
        clickTo(SELECT_ROLE_BUTTON);
        return this;
    }

    public SettingsPage selectLocalStudent(){
        clickTo(LOCAL_STUDENT_POPUP);
        return this;
    }

    public SettingsPage clickToMenuButton(){
        clickToMenu();
        return this;
    }

    public SettingsPage checkStudyInfoTab(){
        checkStudyInfoIsVisible();
        return this;

    }
}
