package com.cybertek.tests.day09_explicitwait_singleton_properties;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class ExplicitWaitTest2 extends TestBase {
    @Test
    public void waitUntilElementInteractive(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputField = driver.findElement(By.cssSelector("form#input-example>input"));
        System.out.println("inputField.isEnabled() = " + inputField.isEnabled());

        // click on enable button and wait until the inputb=Box is enabled clickable
        driver.findElement(By.xpath("//button[.='Enable']")).click();

        WebDriverWait wait = new WebDriverWait(driver, 7);
        // this will wait for 7 second max for input element located by cssSelector("form#input-example>input")
        // enabled , interactive , visible
        //wait.until( elementToBeClickable(By.cssSelector("form#input-example>input") )  );
        wait.until( elementToBeClickable(inputField) ) ;

        // now enter something into the input filed
        inputField.sendKeys("HELLO WORLD");

        BrowserUtil.waitFor(5);



    }

}
