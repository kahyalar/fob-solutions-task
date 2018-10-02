package com.kahyalar.fob_solutions.tests;

import com.kahyalar.fob_solutions.base.BaseTest;
import com.kahyalar.fob_solutions.pages.MainPage;
import com.kahyalar.fob_solutions.pages.WelcomePage;
import org.junit.Test;

/**
 * Created by kahyalar on 2.10.2018.
 */

public class TestCases extends BaseTest{
    @Test
    public void isStudyInfoVisibleAfterRoleChanging() {
        new WelcomePage(driver)
                .checkForFirstTime()
                .loginAsGuest()
                .clickToMenuButton()
                .goToSettingsPage()
                .pressSelectRoleButton()
                .selectLocalStudent()
                .clickToMenuButton()
                .checkStudyInfoTab();
    }

    @Test
    public void isCheckedItemsStaysCheckedAfterRestart(){
        new WelcomePage(driver)
                .checkForFirstTime()
                .loginAsLocal()
                .goToChecklistPage()
                .checkFirstItem()
                .goToMainPage()
                .goToChecklistPage()
                .checkIsFirstItemChecked();
    }

    @Test
    public void isCalendarRedirectsToEvent(){
        
    }
}
