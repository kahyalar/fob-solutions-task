package com.kahyalar.fob_solutions.pages;

import com.kahyalar.fob_solutions.base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Assert;

import java.util.List;

import static com.kahyalar.fob_solutions.constants.ChecklistPageConstants.CHECKLIST_ITEM;
import static com.kahyalar.fob_solutions.constants.ChecklistPageConstants.CHECKLIST_TITLE;
import static com.kahyalar.fob_solutions.constants.MainPageConstants.TAB_BAR;

/**
 * Created by kahyalar on 2.10.2018.
 */
public class ChecklistPage extends BasePage {
    public ChecklistPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public ChecklistPage checkFirstItem(){
        List<MobileElement> list = findElements(CHECKLIST_ITEM);
        list.get(0).click();
        return this;
    }

    public ChecklistPage checkIsFirstItemChecked(){
        List<MobileElement> list = findElements(CHECKLIST_ITEM);
        Assert.assertTrue("Checked Item should be stay checked!", isChecked(list.get(0)));
        return this;
    }

    public MainPage goToMainPage(){
        List<MobileElement> list = findElement(TAB_BAR).findElementsByClassName("android.widget.ImageView");
        list.get(0).click();
        return new MainPage(driver);
    }

    public ChecklistPage checkIsCheckListPage(){
        Assert.assertTrue("'Start of the school year checklist' should be visible at this moment!", isExist(CHECKLIST_TITLE));
        return this;
    }
}
