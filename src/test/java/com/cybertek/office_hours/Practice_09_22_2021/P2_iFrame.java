package com.cybertek.office_hours.Practice_09_22_2021;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class P2_iFrame extends TestBase {
    @Test
    //#sampleHeading
    public void toolQa(){
        driver.get("https://demoqa.com/frames");

        driver.switchTo().frame("frame1");

        System.out.println("driver.findElement(By.cssSelector(\"#sampleHeading\")) = "
                + driver.findElement(By.cssSelector("#sampleHeading")));

    }

    @Test
    public void nestedFrame(){
        driver.get("http://practice.cybertekschool.com/nested_frames");

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");

        System.out.println("driver.findElement(By.cssSelector(\"#content\")) = "
                + driver.findElement(By.cssSelector("#content")));

        driver.switchTo().parentFrame(); // frame-top

        driver.switchTo().frame(2);

        driver.findElement(By.tagName("body")).getText();

       // driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);

    }
    //"C:\Users\Talant\Desktop\vision board 2020-2021\1_Happy-mother-and-adult-daughter-hugging-in-the-countryside.jpg"

}
