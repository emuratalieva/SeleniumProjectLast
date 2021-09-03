package com.cybertek.day01_navigtion_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicNavigation_FireFox {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("https://cybertekschool.com");

        System.out.println("About to quit ");
        driver.quit();



    }
}
