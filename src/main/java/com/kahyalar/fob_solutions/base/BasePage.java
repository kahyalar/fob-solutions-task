package com.kahyalar.fob_solutions.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

import static com.kahyalar.fob_solutions.constants.BasePageConstants.MENU_BUTTON;
import static com.kahyalar.fob_solutions.constants.BasePageConstants.STUDY_INFO_BUTTON;

/**
 * Created by kahyalar on 2.10.2018.
 */
public class BasePage {
    protected AppiumDriver<MobileElement> driver;
    private WebDriverWait wait;
    private final int ELEMENT_MAX_WAIT = 5;
    private final int ELEMENT_SEARCH_SLEEP = 1000;

    public BasePage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    private WebDriverWait getWait(){
        return new WebDriverWait(driver, ELEMENT_MAX_WAIT, ELEMENT_SEARCH_SLEEP);
    }

    private void waitElement(By by){
        getWait().until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    private void waitUntilClickable(By by){
        getWait().until(ExpectedConditions.elementToBeClickable(by));
    }

    private void waitElements(By by){
        getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    protected MobileElement findElement(By by) {
        waitElement(by);
        return driver.findElement(by);
    }

    protected List<MobileElement> findElements(By by){
        waitElements(by);
        return driver.findElements(by);
    }

    protected void clickTo(By by){
        waitUntilClickable(by);
        findElement(by).click();
    }

    protected boolean isExist(By by){
        if (findElements(by).isEmpty()){
            System.out.println("Item not found!");
            return false;
        }
        else {
            System.out.println("Item found!");
            return true;
        }
    }

    protected void clickToMenu(){
        clickTo(MENU_BUTTON);
    }

    protected void checkStudyInfoIsVisible(){
        Assert.assertTrue("Study Info button should be visible, but now it's hidden!", isExist(STUDY_INFO_BUTTON));
    }

    protected void restart(){
        driver.closeApp();
        driver.launchApp();
    }
}
