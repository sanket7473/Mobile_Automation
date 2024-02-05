package com.bridgelabz.test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Mobile_Alarm {
    public AndroidDriver driver;
    //BeforeMethod is to do a setup in a appium
    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities dc= new DesiredCapabilities();
        dc.setCapability("platformName","Android");
        dc.setCapability("udid","RZ8N109RC6W");
        dc.setCapability("deviceName","Galaxy M30s");
        dc.setCapability("platformVersion","11.0");
        dc.setCapability("appPackage","com.sec.android.app.clockpackage");
        dc.setCapability("appActivity","com.sec.android.app.clockpackage.ClockPackage");
        driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
        System.out.println("It is Starting");
    }
    //Testing a add operation is working
    @Test
    public void alarm() throws InterruptedException {
        WebElement one=driver.findElement(By.id("com.sec.android.app.clockpackage:id/menu_alarm_add"));
        one.click();
        Thread.sleep(2000);
        WebElement two=driver.findElement(By.id("com.sec.android.app.clockpackage:id/repeat_0"));
        two.click();
        WebElement save=driver.findElement(By.id("com.sec.android.app.clockpackage:id/smallLabel"));
        save.click();

    }
}
