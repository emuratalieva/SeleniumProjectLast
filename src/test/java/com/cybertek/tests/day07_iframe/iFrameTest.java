package com.cybertek.tests.day07_iframe;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iFrameTest extends TestBase {

    @Test
    public void testSimpleIFrame(){

        driver.get("http://practice.cybertekschool.com/iframe");
        // first we need to switch to the iframe
        // -- by index
        // driver.switchTo().frame(0);
        //--by name or id
        //driver.switchTo().frame("mce_0_ifr");
        // --by passing iframe WebElement object
        // locate the iframe element by its title "Rich Text Area ...."
      WebElement iframeElm = driver.findElement(By.cssSelector("iframe[title^='Rich Text Area']"));

      driver.switchTo().frame(iframeElm);
      WebElement pTagInsideiFrame = driver.findElement(By.tagName("p"));

      System.out.println("pTagInsideiFrame.getText() = " + pTagInsideiFrame.getText());

        //driver.switchTo().parentFrame();

        driver.switchTo().defaultContent();

        driver.findElement(By.linkText("Home")).click();
        System.out.println("the end");



    }

}
