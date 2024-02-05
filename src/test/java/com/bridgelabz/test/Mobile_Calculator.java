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

public class Mobile_Calculator {
    public AndroidDriver driver;
    //BeforeMethod is to do a setup in a appium
    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities dc= new DesiredCapabilities();
        dc.setCapability("platformName","Android");
        dc.setCapability("udid","RZ8N109RC6W");
        dc.setCapability("deviceName","Galaxy M30s");
        dc.setCapability("platformVersion","11.0");
        dc.setCapability("appPackage","com.sec.android.app.popupcalculator");
        dc.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");
        driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
        System.out.println("It is Starting");
    }
    //Testing a add operation is working
    @Test
    public void addition(){
        WebElement one=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_07"));
        one.click();
        WebElement add = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add"));
        add.click();
        WebElement two = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_09"));
        two.click();
        WebElement equal = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));
        equal.click();
    }
    //Mobile calculator app subtraction options
    @Test
    public void substraction(){
        WebElement one=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_09"));
        one.click();
        WebElement sub = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_sub"));
        sub.click();
        WebElement two = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_07"));
        two.click();
        WebElement equal = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));
        equal.click();

    }
    //Calculator multiplication operation
    @Test
    public void multiply(){
        WebElement one=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_09"));
        one.click();
        WebElement sub = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_mul"));
        sub.click();
        WebElement two = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_07"));
        two.click();
        WebElement equal = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));
        equal.click();

    }

    //Calculator Division Operation
    @Test
    public void Division(){
        WebElement one=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_09"));
        one.click();
        WebElement sub = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_div"));
        sub.click();
        WebElement two = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_03"));
        two.click();
        WebElement equal = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));
        equal.click();

    }
}
