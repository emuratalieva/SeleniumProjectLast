package com.cybertek.tests.day06_junit_practice_utility_methods;


import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

// JavaScript alerts are pop up that show up after you click on button
// regular(ok), confirm(ok and cancel), prompt(enter text)
public class AlertPracticeTest extends TestBase {

    @Test
    public void testJavaScriptAlert(){
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        //Alert interface from Selenium is used to deal with alerts
        // your driver object can switch to the alert and take action on it
        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
        // driver first need to switch to the alert box since it's not part of html
        // using switchTo() method followed by alert() method
        // .alert() method return a type Alert from Selenium
        // and it has 4 methods
            // - accept() --> click on ok button
            //- dismiss() --> click on cancel button
            // - sendKey(yourText) --> enter text into prompt
            // - getText()  --> get the text of the alert box

        System.out.println("driver.switchTo().alert().getText() = " + driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
      //  Alert alertObj = driver.switchTo().alert();
     //   alertObj.accept();

        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
      //  driver.switchTo().alert().dismiss(); // this will click on cancel button
        driver.switchTo().alert().accept(); // this will click on ok btn

        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
        driver.switchTo().alert().sendKeys("Hello"); // this is how we can enter text
        driver.switchTo().alert().accept(); // click ok


        System.out.println("The end");



    }

}
