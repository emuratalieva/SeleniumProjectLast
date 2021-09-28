package com.cybertek.day05_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorPractice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        // locate the element
        WebElement emailBox = driver.findElement(By.cssSelector("input[name='email']"));
        emailBox.sendKeys("someone@somewhere.com");

        WebElement retrieveBtn = driver.findElement(By.cssSelector("#form_submit"));
        retrieveBtn.click();

        driver.quit();


    }
}
