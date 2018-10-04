package com.kahyalar.fob_solutions.constants;

import org.openqa.selenium.By;

/**
 * Created by kahyalar on 2.10.2018.
 */
public interface MainPageConstants {
    By STUDY_INFO_TITLE = By.xpath("//*[@text=\"Study info\"]");
    By TAB_BAR = By.id("ee.taltech.android:id/tabLayout");
    By CALENDAR_VIEW = By.id("ee.taltech.android:id/calendarView");
    By DECEMBER_TEXT = By.xpath("//*[@text=\"December 2018\"]");
    By EVENT_DATE = By.xpath("//*[@text=\"12/23/18\"]");
    By EVENT_DATE_BUTTON = By.xpath("//*[@text=\"23\"]");
}
