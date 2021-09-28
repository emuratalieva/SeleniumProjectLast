package com.cybertek.office_hours.Practice_09_08_2021;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_TagName {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com");

       WebElement firstTag = driver.findElement(By.tagName("a"));
        System.out.println("firstTag.getText() = " + firstTag.getText());
        driver.quit();
    }
}
