package com.bridgelabz.test;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
public class Mobile_Browser {
    public AndroidDriver driver;
    //BeforeMethod is to do a setup in a appium
    @BeforeMethod
    public void setup() throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc= new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        dc.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
        dc.setCapability("chromedriverExecutable","C:\\Users\\Sanket\\Downloads\\chromedriver_win32\\chromedriver.exe");
        dc.setCapability("chromeOptions", ImmutableMultimap.of("w3c",false));
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
        Thread.sleep(2000);
    }
    @Test
    public void reu() throws InterruptedException {

        driver.get("https://www.amazon.com");
        Thread.sleep(6000);
        WebElement element=driver.findElement(By.name("k"));
        element.sendKeys("iphone");
        element.sendKeys(Keys.ENTER);
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollTo(0,300)");
    }
}
