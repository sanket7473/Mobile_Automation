package com.bridgelabz.test;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Genomotion_Calculator {
    public AndroidDriver driver;
    //BeforeMethod is to do a setup in a appium
    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities dc= new DesiredCapabilities();
        dc.setCapability("platformName","Android");
        dc.setCapability("deviceName","emulator-5554");
        dc.setCapability("platformVersion","9.0");
        dc.setCapability("appPackage","com.android.calculator2");
        dc.setCapability("appActivity","com.android.calculator2.Calculator");
        driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
        System.out.println("It is Starting");
    }
    //Testing a add operation is working
    @Test
    public void addition(){
        WebElement one=driver.findElement(By.id("com.android.calculator2:id/digit_3"));
        one.click();

        WebElement add = driver.findElement(By.id("com.android.calculator2:id/op_add"));
        add.click();

        WebElement two = driver.findElement(By.id("com.android.calculator2:id/digit_6"));
        two.click();

        WebElement equal = driver.findElement(By.id("com.android.calculator2:id/eq"));

        equal.click();
    }
    //Testing  a substraction
    @Test
    public void substraction(){
        WebElement one=driver.findElement(By.id("com.android.calculator2:id/digit_3"));
        one.click();

        WebElement sub = driver.findElement(By.id("com.android.calculator2:id/op_sub"));
        sub.click();

        WebElement two = driver.findElement(By.id("com.android.calculator2:id/digit_6"));
        two.click();

        WebElement equal = driver.findElement(By.id("com.android.calculator2:id/eq"));

        equal.click();
    }

    //Testing a multiplication
    @Test
    public void multiplication(){
        WebElement one=driver.findElement(By.id("com.android.calculator2:id/digit_3"));
        one.click();

        WebElement mul = driver.findElement(By.id("com.android.calculator2:id/op_mul"));
        mul.click();

        WebElement two = driver.findElement(By.id("com.android.calculator2:id/digit_6"));
        two.click();

        WebElement equal = driver.findElement(By.id("com.android.calculator2:id/eq"));

        equal.click();
    }

    //Testing a divide
    @Test
    public void divide() throws InterruptedException {
        WebElement one=driver.findElement(By.id("com.android.calculator2:id/digit_8"));
        one.click();
        Thread.sleep(1000);
        WebElement div = driver.findElement(By.id("com.android.calculator2:id/op_div"));
        div.click();
        Thread.sleep(1000);
        WebElement two = driver.findElement(By.id("com.android.calculator2:id/digit_2"));
        two.click();
        WebElement equal = driver.findElement(By.id("com.android.calculator2:id/eq"));
        equal.click();
    }
}
