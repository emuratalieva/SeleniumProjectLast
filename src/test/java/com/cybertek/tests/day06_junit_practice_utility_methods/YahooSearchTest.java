package com.cybertek.tests.day06_junit_practice_utility_methods;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YahooSearchTest extends TestBase {

    @Test
    public void testYahooSearchHomePage() throws InterruptedException {
        driver.get("https://search.yahoo.com");
        String expectedTitle = "Yahoo Search - Web Search";
        Thread.sleep(2000);
        //driver.getTitle() = Yahoo Search - Web Search
        String actualTitle = driver.getTitle();
        Thread.sleep(2000);
        assertEquals(expectedTitle,actualTitle);
    }

    @Test
    public void testYahooSearchResultPage() throws InterruptedException {

        driver.get("https://search.yahoo.com");
        driver.findElement(By.name("p")).sendKeys("selenium"+ Keys.ENTER);

        Thread.sleep(1000);
        System.out.println("driver.getTitle() = " + driver.getTitle());
        assertTrue(driver.getTitle().startsWith("selenium"));



    }

}
