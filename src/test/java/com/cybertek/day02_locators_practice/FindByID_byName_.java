package com.cybertek.day02_locators_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByID_byName_ {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        WebElement emailBox = driver.findElement(By.id("email"));
        emailBox.sendKeys("some email here");

        WebElement passwordBox = driver.findElement(By.name("pass"));
        passwordBox.sendKeys("password input");

        WebElement logInBtn = driver.findElement(By.name("login"));
        logInBtn.sendKeys("clicking login btn");

        Thread.sleep(5000);

        WebElement forgetLink = driver.findElement(By.linkText("Forgot Password?"));
        forgetLink.click();

       // driver.quit();


    }
}
