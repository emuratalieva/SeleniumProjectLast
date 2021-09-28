package com.cybertek.tests.day08_upload_actions_window_wait_js;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.*;

public class ActionClassTest extends TestBase {

    @Test
    public void testHoverAction(){
        //(//div[@class='figure']/img)[1]

        driver.get("http://practice.cybertekschool.com/hovers");

        WebElement img1Elm = driver.findElement(By.xpath("(//div[@class='figure']/img)[1]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(img1Elm).perform();

        BrowserUtil.waitFor(3);

        //verify User profile 1 displayed with text --> name: user1
        WebElement firstProfileElm = driver.findElement(By.xpath("//h5[.='name: user1']"));
        assertTrue(firstProfileElm.isDisplayed());

        WebElement img2Elm = driver.findElement(By.xpath("(//div[@class='figure']/img)[2]"));
        actions.moveToElement(img2Elm).perform();
        BrowserUtil.waitFor(3);

        actions.moveToElement(img1Elm).pause(2000)
                .moveToElement(img2Elm).pause(2000)
                .moveToElement(img1Elm).pause(2000)
                .moveToElement(img2Elm).pause(2000)
                .perform();




    }

    @Test
    public void testDragAndDrop(){

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        BrowserUtil.waitFor(2);

        WebElement smallCircle = driver.findElement(By.id("draggable"));
        WebElement biggerCircle=driver.findElement(By.id("droptarget"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(smallCircle,biggerCircle).perform();

        BrowserUtil.waitFor(2);

        assertEquals("You did great!", biggerCircle.getText());


    }


    @Test
    public void testKeyboardAction(){
        // navigate to https://www.google.com
        // hold down to shift enter text "i love selenium"
        // release the shift
        // enter text "i love selenium"
        // hold down to command on mac control on windows and enter "A"
        // release the command or control key
        // then hit backspace to delete

        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));

        Actions actions = new Actions(driver);
       // keyDown method for holding down to certain modifier key like Control , SHIFT and so on
        // keyUp method for releasing what you are holding down to
        // sendKeys method of Actions class is for pressing key that provided
        // pause method of Actions class is for pausing in between actions in milleseconds
        actions.keyDown(Keys.SHIFT).sendKeys("i love selenium")
                .pause(2000).keyUp(Keys.SHIFT)
                .sendKeys("i love selenium").pause(2000)
                .keyDown(Keys.CONTROL).sendKeys("A")
                .keyUp(Keys.CONTROL).pause(2000)
                .sendKeys(Keys.BACK_SPACE)
                .perform();


    }

    @Test
    public void testDoubleClick(){
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
        BrowserUtil.waitFor(2);
// both elements are under the fram, so switch into it first
        driver.switchTo().frame("iframeResult");
        WebElement pElm1 = driver.findElement(By.xpath("//p[.='Double-click this paragraph to trigger a function.']"));
        // in order to double-click we will use actions class
        Actions actions = new Actions(driver);
        actions.doubleClick(pElm1).perform(); // this is how we double click

        BrowserUtil.waitFor(2);
        // TODO: go ahead and assert the Hello World showed up

    }

    @Test
    public void testRightClick(){// right click is called context click
             // navigate to below url
            driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_oncontextmenu");
            // locate the yellow area : css selector div[contextmenu='mymenu']
            // first switch to the iframe
            driver.switchTo().frame("iframeResult");
            WebElement yellowArea = driver.findElement(By.cssSelector("div[contextmenu='mymenu']"));

            // right-click on that area using Actions class method contextClick( pass the element here)
            Actions actions = new Actions(driver);
            actions.contextClick(yellowArea).perform();

            BrowserUtil.waitFor(1);
            // close the alert that showed up after

    }

}
