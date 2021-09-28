package com.cybertek.selfStudy;

import com.cybertek.utility.TestBase;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertFalse;


public class Alerts extends TestBase {

    @Test
    public void alertBox() {

        driver.get("http://practice.cybertekschool.com/javascript_alerts");


        //REGULAR ALERT BOX

        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();

        String alertBOX = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();



        System.out.println(alertBOX);

        // CONFIRM ALERT BOX

        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();

      //  driver.switchTo().alert().dismiss();

     //   driver.findElement(By.cssSelector("div button[onclick='jsConfirm()']")).click();

        driver.switchTo().alert().accept();

        //PROMPT ALERT BOX

        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();

        driver.switchTo().alert().sendKeys("HELLO HELLO HELLO");

        driver.switchTo().alert().accept();

        String expectedResult = driver.findElement(By.id("result")).getText();

        assertFalse(!(expectedResult.equals(expectedResult)));

    }
}
