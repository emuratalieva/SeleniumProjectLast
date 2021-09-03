package com.cybertek.day01_navigtion_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByName {
    public static void main(String[] args)  {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com");

        WebElement searchBox = driver.findElement(By.name("p"));
        searchBox.sendKeys("Selenium");

       WebElement searchBtn = driver.findElement(By.id("ybar-search"));

       searchBtn.submit();

        driver.quit();


    }
}
