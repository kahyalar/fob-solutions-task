package com.kahyalar.fob_solutions.constants;

import org.openqa.selenium.By;

/**
 * Created by kahyalar on 2.10.2018.
 */
public interface BasePageConstants {
    By MENU_BUTTON = By.xpath("//*[@resource-id=\"ee.taltech.android:id/toolbar\"]/android.widget.ImageButton[1]");
    By SETTINGS_BUTTON = By.xpath("//*[@text=\"Settings\"]");
    By STUDY_INFO_BUTTON = By.xpath("//*[@text=\"Study info\"]");
}
