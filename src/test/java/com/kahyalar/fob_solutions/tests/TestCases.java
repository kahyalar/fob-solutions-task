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
                .checkForFirstTime()
                .loginAsGuest()
                .clickToMenuButton()
                .goToSettingsPage()
                .pressSelectRoleButton()
                .selectLocalStudent()
                .clickToMenuButton()
                .checkStudyInfoTab();
    }
}
