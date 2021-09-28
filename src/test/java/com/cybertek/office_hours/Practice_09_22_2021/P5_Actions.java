package com.cybertek.office_hours.Practice_09_22_2021;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P5_Actions extends TestBase {

    @Test
    public void hoverOver(){
        driver.get("http://automationpractice.com/index.php");

        //(//a[@title='Dresses'])[2]

        WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));

      driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));

    }
}
