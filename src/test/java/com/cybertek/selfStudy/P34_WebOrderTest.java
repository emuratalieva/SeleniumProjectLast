package com.cybertek.selfStudy;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import com.cybertek.utility.WebOrderUtil;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    public void testDriverUtilityLoginLogout(){

        WebOrderUtil.openWebOrderApp();
        WebOrderUtil.login();
         assertTrue( WebOrderUtil.isAtAllOrderPage());


         WebOrderUtil.verifyUsername("Tester");


        System.out.println("WebOrderUtil.getUsernameFromWelcomeMsg(\"Tester\")  "
                + WebOrderUtil.getUsernameFromWelcomeMsg("Tester"));


        WebOrderUtil.selectSideBarTab("View all orders");
        BrowserUtil.waitFor(2);
        WebOrderUtil.selectSideBarTab("View all products");
        BrowserUtil.waitFor(2);
        WebOrderUtil.selectSideBarTab("Order");
        BrowserUtil.waitFor(2);


//        WebOrderUtil.logout();
//        BrowserUtil.waitFor(2);
//
//        WebOrderUtil.login("Tester","test");
//        WebOrderUtil.logout();
//        BrowserUtil.waitFor(2);

    }
}
