package com.bridgelabz.test;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.PerformsTouchID;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
public class Mobile_Calender {
    public AndroidDriver driver;
    //BeforeMethod is to do a setup in a appium
    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities dc= new DesiredCapabilities();
        dc.setCapability("platformName","Android");
        dc.setCapability("udid","RZ8N109RC6W");
        dc.setCapability("deviceName","Galaxy M30s");
        dc.setCapability("platformVersion","11.0");
        dc.setCapability("appPackage","com.samsung.android.calender");
        dc.setCapability("appActivity","com.samsung.android.app.calendar.activity.MainActivity");
        driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
        System.out.println("It is Starting");
    }
    @Test
    public void calender(){
        WebElement one = driver.findElement(By.xpath("(//android.view.View[@content-desc=\" \"])[1]"));
        one.click();
        TouchAction t = new TouchAction(driver);
        t.tap(PointOption.point(642,1010)).perform();
//        WebElement add = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add"));
//        add.click();
//        WebElement two = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_09"));
//        two.click();
//        WebElement equal = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));
//        equal.click();
    }
    //Mobile calculator app subtraction options
}
