package com.cybertek.office_hours.Practice_09_08_2021;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Name {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com");

        driver.findElement(By.partialLinkText("Sign")).click();

        WebElement name = driver.findElement(By.name("full_name"));
        name.sendKeys("Mike Smith");
        System.out.println("name.getAttribute(\"type\") = " + name.getAttribute("type"));

        WebElement email = driver.findElement(By.id("email"));


    }
}
