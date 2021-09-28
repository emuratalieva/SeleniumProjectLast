package com.cybertek.tests.day09_explicitwait_singleton_properties;

import com.cybertek.utility.TestBase;
import com.cybertek.utility.WebDriverFactory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class Explicit_Wait extends TestBase {

    @Test
    public void testWaitForTitle(){

        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        driver.findElement(By.partialLinkText("Example 7")).click();

        // we want to wait until the title value become "Dynamic Title"
        // this is how we create WebDriverWait object with driver and max time to wait
        WebDriverWait wait = new WebDriverWait(driver,6);
        // the we use until method that accept expected conditions
        // ExpectedConditions helper class has a lot of
       // wait.until(ExpectedConditions.titleIs("Dynamic title"));

      //  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")) );
       //import static org.openqa.selenium.support.ui.ExpectedConditions.*;
        // we did static import so codes can be shorter
        wait.until(visibilityOfElementLocated(By.xpath("//img[@alt='square pants']")));

        // the warning area iitially has text of this page is slow wait for 5 seconds


        System.out.println("END");

    }

    @Test
    public void testByTextToBe(){
        //1. navigate to http://practice.cybertekschool.com/dynamic_loading
        driver.get(" http://practice.cybertekschool.com/dynamic_loading");
        //2. Click on Example 7
        driver.findElement(By.partialLinkText("Example 7")).click();

        WebElement alertArea = driver.findElement(By.id("alert"));
        System.out.println("alertArea.getText() = " + alertArea.getText());

        WebDriverWait wait = new WebDriverWait(driver, 7);
        // wait for the image show up
        wait.until( visibilityOfElementLocated(By.xpath("//img[@alt='square pants']")) ) ;

        alertArea = driver.findElement(By.id("alert"));

        System.out.println("alertArea.getText() = " + alertArea.getText());



    }




}
