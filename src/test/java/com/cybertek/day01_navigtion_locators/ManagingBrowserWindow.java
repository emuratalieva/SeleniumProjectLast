package com.cybertek.day01_navigtion_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagingBrowserWindow {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://google.com");

        driver.manage().window().maximize();

        driver.manage().window().fullscreen();

        driver.quit();


    }
}
