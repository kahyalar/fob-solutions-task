package com.kahyalar.fob_solutions.pages;

import com.kahyalar.fob_solutions.base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import static com.kahyalar.fob_solutions.constants.WelcomePageConstants.GUEST_BUTTON;

/**
 * Created by kahyalar on 2.10.2018.
 */
public class WelcomePage extends BasePage {
    private boolean isExist;

    public WelcomePage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public WelcomePage checkForFirstTime(){
        isExist = isExist(GUEST_BUTTON);
        return this;
    }

    public MainPage loginAsGuest(){
        if(isExist){
            clickTo(GUEST_BUTTON);
        }
        return new MainPage(driver);
    }
}
