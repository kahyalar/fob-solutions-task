package com.kahyalar.fob_solutions.constants;

import org.openqa.selenium.By;

/**
 * Created by kahyalar on 2.10.2018.
 */
public interface SettingsPageConstants {
    By SELECT_ROLE_BUTTON = By.xpath("//*[@resource-id=\"ee.taltech.android:id/list\"]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]");
    By LOCAL_STUDENT_POPUP = By.xpath("//*[@text=\"Local student\"]");
    By SETTINGS_TITLE = By.xpath("//*[@text=\"Settings\"]");
}
