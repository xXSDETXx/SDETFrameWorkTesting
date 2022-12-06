package com.saucedemoTests;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    @BeforeClass
    public void Example1(){
        String driverPath = "src/test/resources/Webdriver";
        System.setProperty("webdriver.chrome.driver", driverPath + "/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
    }
//    @AfterClass
//    public void Example2(){
//        WebDriver driver=new ChromeDriver();
//        driver.quit();
//    }
}
