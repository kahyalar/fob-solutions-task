package com.kahyalar.fob_solutions.pages;

import com.kahyalar.fob_solutions.base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import static com.kahyalar.fob_solutions.constants.WelcomePageConstants.GUEST_BUTTON;
import static com.kahyalar.fob_solutions.constants.WelcomePageConstants.LOCAL_STUDENT_BUTTON;

/**
 * Created by kahyalar on 2.10.2018.
 */
public class WelcomePage extends BasePage {
    public WelcomePage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public MainPage loginAsGuest(){
        clickTo(GUEST_BUTTON);
        return new MainPage(driver);
    }

    public MainPage loginAsLocal(){
        clickTo(LOCAL_STUDENT_BUTTON);
        return new MainPage(driver);
    }
}
