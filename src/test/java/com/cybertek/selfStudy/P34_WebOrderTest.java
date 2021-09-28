package com.cybertek.selfStudy;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P34_WebOrderTest extends TestBase {

//id="ctl00_MainContent_login_button"
    @Test
    public void testLogin(){
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");

        WebElement loginBox = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginBox.sendKeys("Tester");

        WebElement passwordBox = driver.findElement(By.id("ctl00_MainContent_password"));
        passwordBox.sendKeys("test");

        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        BrowserUtil.waitFor(3);


    }
}
