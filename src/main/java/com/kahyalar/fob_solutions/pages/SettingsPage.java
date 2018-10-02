package com.kahyalar.fob_solutions.pages;

import com.kahyalar.fob_solutions.base.BasePage;
import com.kahyalar.fob_solutions.constants.SettingsPageConstants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import static com.kahyalar.fob_solutions.constants.SettingsPageConstants.LOCAL_STUDENT_POPUP;
import static com.kahyalar.fob_solutions.constants.SettingsPageConstants.SELECT_ROLE_BUTTON;

/**
 * Created by kahyalar on 2.10.2018.
 */
public class SettingsPage extends BasePage {
    public SettingsPage(AppiumDriver<MobileElement> driver) {
        super(driver);
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
