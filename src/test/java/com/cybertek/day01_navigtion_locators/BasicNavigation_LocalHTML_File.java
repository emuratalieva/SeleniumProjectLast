package com.cybertek.day01_navigtion_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation_LocalHTML_File {
    public static void main(String[] args) throws InterruptedException {

        //file:///C:/Users/Talant/Desktop/HTML_Class/Day2.html

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("file:///C:/Users/Talant/Desktop/HTML_Class/Day2.html");

        Thread.sleep(3000);

        driver.quit();



    }
}
