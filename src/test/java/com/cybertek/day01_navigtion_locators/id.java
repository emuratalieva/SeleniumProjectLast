package com.cybertek.day01_navigtion_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class id {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com/");

      WebElement searchBox =  driver.findElement(By.id("ybar-sbq"));

      searchBox.sendKeys("Selenium");

      WebElement searchBtn = driver.findElement(By.id("ybar-search"));

    //  searchBtn.click();
        searchBtn.submit();

      Thread.sleep(5000);

      driver.quit();




    }

}
