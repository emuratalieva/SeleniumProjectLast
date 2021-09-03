package com.cybertek.day01_navigtion_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByLinkText {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        WebElement searchBox = driver.findElement(By.name("q")) ;
        searchBox.sendKeys("Everything is awesome");
               // submit the search by clicking on the search button
        WebElement searchBtn = driver.findElement(By.name("btnK")) ;
                   searchBtn.submit();

       driver.navigate().back();

       Thread.sleep(3000);

       WebElement aboutLink = driver.findElement(By.linkText("About"));
       aboutLink.click();

       Thread.sleep(3000);

       driver.quit();



    }

}
