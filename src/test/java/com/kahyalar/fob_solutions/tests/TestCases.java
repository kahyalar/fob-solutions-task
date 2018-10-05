package com.kahyalar.fob_solutions.tests;

import com.kahyalar.fob_solutions.base.BaseTest;
import com.kahyalar.fob_solutions.pages.WelcomePage;
import org.junit.Test;

/**
 * Created by kahyalar on 2.10.2018.
 */

public class TestCases extends BaseTest{
    @Test
    public void isStudyInfoVisibleAfterRoleChanging() {
        new WelcomePage(driver)
                .loginAsGuest()
                .clickToMenuButton()
                .goToSettingsPage()
                .checkIsSettingsPage()
                .pressSelectRoleButton()
                .selectLocalStudent()
                .clickToMenuButton()
                .checkStudyInfoTab();
    }

    @Test
    public void isCheckedItemsStaysCheckedAfterRestart(){
        new WelcomePage(driver)
                .loginAsLocal()
                .goToChecklistPage()
                .checkIsCheckListPage()
                .checkFirstItem()
                .goToMainPage()
                .checkIsMainPage()
                .goToChecklistPage()
                .checkIsCheckListPage()
                .checkIsFirstItemChecked();
    }

    @Test
    public void isCalendarRedirectsToEvent(){
        new WelcomePage(driver)
                .loginAsLocal()
                .checkFieldsIsVisible()
                .goToDecemberMonth()
                .clickToEventDate()
                .checkEventIsVisible();
    }
}
