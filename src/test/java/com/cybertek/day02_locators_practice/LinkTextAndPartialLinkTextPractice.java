package com.cybertek.day02_locators_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextAndPartialLinkTextPractice {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        //click on 1st link A/B testing
//       WebElement firstLink = driver.findElement(By.linkText("A/B Testing"));
//        firstLink.click();

        driver.findElement(By.linkText("A/B Testing")).click();

        // navigate back to home page
        driver.navigate().back();


        //click on second link
        driver.manage().window().maximize();


       // driver.findElement(By.linkText("Add/Remove Elements")).click();

       WebElement addOrLink = driver.findElement(By.partialLinkText("Add/Remove"));
       addOrLink.click();

        // click on home page to go back home
       driver.findElement(By.linkText("Home")).click();

        // click  on link called Redirection
        driver.findElement(By.linkText("Redirect Link")).click();


        driver.close();

    }
}
