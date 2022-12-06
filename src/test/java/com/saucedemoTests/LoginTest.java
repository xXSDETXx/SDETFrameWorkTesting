package com.saucedemoTests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest extends BaseTest{

    @Test
    public void Example2(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

    }
}
