package com.cybertek.tests.day08_upload_actions_window_wait_js;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorTest extends TestBase {

    @Test
    public void testScrollWholeWindow(){
        driver.get("http://practice.cybertekschool.com/infinite_scroll");
        //scroll by 1000 down, no need for left and right scroll
        BrowserUtil.waitFor(2);
        // get JavaScriptExecutor reference from driver variable
        // so we can run this js code window.scrollBy(0,1000)
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        // it use execute method to run javascript, it can accept parameter
        jse.executeScript("window.scrollBy(0,1000)");

        for (int i = 1; i <=10 ; i++) {
            jse.executeScript("window.scrollBy(0,1000)");
            BrowserUtil.waitFor(1);
        }
        BrowserUtil.waitFor(4);

    }

    @Test
    public void testScrollElementIntoView(){
        driver.get("http://practice.cybertekschool.com/large");
        // locate cybertek school link and home link
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        // run this javascript to scroll it to the element into the view
        // theElementIdentified.scrollIntoView(true)
        // in order to pass our element into above method
        // we need to use arguments[specify index here]
        // whatever we pass to executeScript method after javascript code will be argument with index

        // try out by passing argument in window.scrollBy(0,1000)
        // I want to pass this 1000 externally when i cal the method
        int myScrollNumber = 1000 ;
        jse.executeScript("window.scrollBy(0, arguments[0])" , myScrollNumber);

        // now call arguments[0].scrollIntoView(true)
        WebElement cybertekSchoolLnk = driver.findElement(By.linkText("Cybertek School"));

        jse.executeScript("arguments[0].scrollIntoView(true)" , cybertekSchoolLnk);

        BrowserUtil.waitFor(4);







    }

}
