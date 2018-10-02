package com.kahyalar.fob_solutions.base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by kahyalar on 2.10.2018.
 */
public class BaseTest {
    protected static AndroidDriver<MobileElement> driver;
    protected static DesiredCapabilities capabilities = new DesiredCapabilities();

    @Before
    public void startUp(){
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability("appPackage", "ee.taltech.android");
        capabilities.setCapability("appActivity", "ee.taltech.android.activities.StartActivity_");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "device");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setPlatform(Platform.ANDROID);
        driver = new AndroidDriver<MobileElement>(capabilities);
    }

    @After
    public void tearDown(){
        driver.closeApp();
        driver.quit();
    }
}
