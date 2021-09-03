package com.cybertek.day01_navigtion_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

      //  driver.navigate().to("https://yahoo.com");
        driver.get("https://amazon.com");

        driver.navigate().to("https://google.com");

        driver.navigate().back();

        driver.navigate().forward();

        driver.quit();


    }

}
